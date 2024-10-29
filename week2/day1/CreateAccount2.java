package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 
		 //Launch Website
		 driver.get("http://leaftaps.com/opentaps/");
		 
		 //Maximize Window
		 driver.manage().window().maximize();
		 
		 //Enter Username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 //Enter Password
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 
		 //Click on Login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click on  "CRM/SFA" link
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 
		 //Click on Accounts tab
		 driver.findElement(By.linkText("Accounts")).click();
		 
		 //lick on the "Create Account" button
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 //Enter an account name
		 driver.findElement(By.id("accountName")).sendKeys("Testleaf Account2");
		 
		 //Enter a description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter a Number Of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("7");
		
		//Enter a Site Name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the Title is displayed correctly
		
		
		//Close the browser tab
		driver.close();

	}

}
