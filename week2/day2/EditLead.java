package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf333");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Somraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Test Last");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Test Department");
		
		//Enter the Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test Description");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testleaf12345@gmail.com");
		
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(State);
		sel.selectByVisibleText("New York");
		
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Click on the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Test Notes");
		
		//Click on the update button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//Get the Title of the Resulting Page
		System.out.println("The page title is: "+driver.getTitle());
		
		//Close the browser window
		driver.close();
		

	}

}
