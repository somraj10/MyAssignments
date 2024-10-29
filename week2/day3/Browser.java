package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	String browserName = "Chrome";
	String browserVersion = "V-1.1.2";
	
	ChromeDriver driver = new ChromeDriver();
	public void openURL() {
		driver.get("https://www.google.co.in/");
		System.out.println("Browser Opened");
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser Closed");
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	
}
