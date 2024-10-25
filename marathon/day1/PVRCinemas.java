package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launching the  PVR Cinemas website
		driver.get("https://www.pvrcinemas.com/");
		
		//Select the location
		//driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//Thread.sleep(5000);
	
		//Click on "Cinema"
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//Selecting the Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//Selecting the Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		//Selecting the Movie
		driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).click();
		
		//Selecting the Show Time
		driver.findElement(By.xpath("//span[text()='04:15 PM']")).click();
		
		//Click on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Selcting the available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:14']")).click();
		
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Print the Seat info under book summary
		String text = driver.findElement(By.xpath("//p[text()='D14']")).getText();
		System.out.println("The selected seat number is: "+text);
		
		//Print the grand total under book summary
		String text2 = driver.findElement(By.xpath("(//span[text()='221.46'])[2]")).getText();
		System.out.println("The grand total of the ticket is: "+text2);
		
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		// Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//Print Your Current Page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close Browser
		driver.close();

	}

}
