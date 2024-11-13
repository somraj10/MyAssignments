package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Getting Page Title
		String title = driver.getTitle();
		
		//Click on From Contact Widget
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		//Handle Window
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> childWindow = new ArrayList <String>(windowHandles);
		
		//Navigate to childWindow
		driver.switchTo().window(childWindow.get(1));
		System.out.println(windowHandles);
		
		//Click on First Contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		//Switch to Parent Window
		driver.switchTo().window(childWindow.get(0));
		
		//To Contact
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		//Swith To Child Window 2
		Set<String> windowHandles2 = driver.getWindowHandles();
		List <String> childWindow2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(childWindow2.get(1));
		
		//Click on Second Result
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//a")).click();
		
		//Switch to parent window
		driver.switchTo().window(childWindow2.get(0));
		
		//Click on Merge Button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Click OK in Alert message
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Vwerify the Page TItle
		String title2 = driver.getTitle();
		System.out.println(title);
		System.out.println(title2);
		
		if(title2.equals(title)) {
			System.out.println("Page Title is verified and it is correct");
		}else {
			System.out.println("Page title is incorrect");
		}
		
		//Close the Window
		driver.close();
		
		
		
		

	}

}
