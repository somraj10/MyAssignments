package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Clicking on SUBMIT buttom having prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		
		//Enter text in the prompt alert text box
		alert.sendKeys("Somraj");
		alert.dismiss();
		
		//Get text alter dismissing the alert
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);

	}

}
