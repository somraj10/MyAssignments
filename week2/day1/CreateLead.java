package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.\r\n");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Somraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		WebElement SourceID = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(SourceID);
		sel.selectByIndex(4);
		
		WebElement Mrk = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2 = new Select(Mrk);
		sel2.selectByVisibleText("Automobile");
		
		WebElement Own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel3 = new Select(Own);
		sel3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
