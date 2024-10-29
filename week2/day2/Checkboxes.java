package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Basic Checkbox
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']/div)[2]")).click();
		
		//Click on Notification Checkbox
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt91']/div)[2]")).click();
		
		//Get text from the popup message
		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text);
		if(text.equals("Checked")){
			System.out.println("The Notification is turned ON");
		}else {
			System.out.println("The Notification is not turned ON");
		}
		
		//Favorite Language
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[2]")).click();
		
		//Click on Tristate checkbox
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Get and verify text from the Tristate checkbox message
		String text2 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println(text2);
		if(text2.equals("State = 1")){
			System.out.println("The Tristate is Accepted");
		}else if(text2 == "State = 2"){
			System.out.println("The Tristate is Rejected");
		}else {
			System.out.println("The Tristate is Unchecked");
		}
		
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String text3 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text3);
		
		if(text3.equals("Checked")){
			System.out.println("The toggle is turned ON");
		}else {
			System.out.println("The toggle is not turned ON");
		}
		
		//Verifing if the Checkbox is disabled
		boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
		System.out.println(enabled);
		
		if(enabled==true)
		{
			System.out.println("The checkbox is enabled");
		}else {
			System.out.println("The checkbox is disabled");
		}
		
		//Multiple options on the page (details may be needed)
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:multiple_panel']//span)[3]")).click();
			
		//Perform any additional actions or verifications required
		System.out.println(driver.getTitle());
		
		
		//Close the browser
		//driver.close();
		
	}

}
