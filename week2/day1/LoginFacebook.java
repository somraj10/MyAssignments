package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click on the Create new account button
		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		
		// Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Test");
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Name");
		
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("7788994455");
		
		//Enter the New password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome@123");
		
		//Handling all the three dropdowns in Date of Birth
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByIndex(3);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel3 = new Select(month);
		sel3.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByIndex(1);
		
		//Select the radio button in Gender
		driver.findElement(By.id("sex")).isSelected();

	}

}
