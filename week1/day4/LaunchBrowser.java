package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Creating object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Browser
		driver.get("https://www.facebook.com/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Get browser title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the browser
		//driver.close();
		

	}

}
