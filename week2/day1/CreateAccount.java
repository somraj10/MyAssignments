package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		 driver.findElement(By.id("accountName")).sendKeys("Testleaf Account");
		 
		 //Enter a description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		WebElement Ind = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(Ind);
		sel.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement Own = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(Own);
		sel2.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement Sor = driver.findElement(By.name("dataSourceId"));
		Select sel3 = new Select(Sor);
		sel3.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement MarCamp = driver.findElement(By.name("marketingCampaignId"));
		Select sel4 = new Select(MarCamp);
		sel4.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement Sta = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel5 = new Select(Sta);
		sel5.selectByValue("TX");
		
		//Click Create Account
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get page title
		System.out.println(driver.getTitle());
		
		//Verifying Account name
		
		
		//Close the Browser window
		driver.close();

	}

}
