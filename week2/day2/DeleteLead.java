package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		//Click "Find leads"
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture the lead ID of the first resulting lead
		Thread.sleep(10000);
		String text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).getText();
		System.out.println(text);
		
		//Click the first resulting lead
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click "Find leads" again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		if(text2.equals("No records to display")) {
			System.out.println("No records to display");
		}else {
			System.out.println("The Lead is not deleted");
		}
		
		//Close the browser
		driver.close();

	}

}
