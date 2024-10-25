package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Searching bags for boys
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys", Keys.ENTER);
		
		//Print the total number of results (like 50000)
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		
		// Select the first 2 brands in the left menu
		   driver.findElement(By.xpath("(//span[text()='Skybags'])[3]")).click();
		   driver.findElement(By.xpath("//span[text()='Safari']")).click();
				   
		//Choose New Arrivals in Sort By
		   driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		   driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		   
		//Print the first resulting bag info (name, discounted price)
		   String text = driver.findElement(By.xpath("//span[contains(text(),'Spree USB 30L Backpack')]")).getText();
		   System.out.println("Name of the selected bag: "+text);
		   
		   String text2 = driver.findElement(By.xpath("//span[text()='598']")).getText();
		   System.out.println("The discounted price is: "+text2);
		   
		//Getting the page title
		   String title = driver.getTitle();
		   System.out.println("Page title: "+title);
		   
		//Closing the browser
		   driver.close();

	}

}
