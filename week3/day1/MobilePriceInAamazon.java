package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePriceInAamazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for mobiles in Amazon
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles", Keys.ENTER);
		
		//Mobiles prices in first page
		List<WebElement> mobilePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = mobilePrices.size();
		System.out.println(size);
		
		//Storing the all the mobile prices in a list
		List<String> list = new ArrayList<String>();
		
		for(WebElement i:mobilePrices) {
			String text = i.getText();
			System.out.println(text);
			list.add(text);
		}
		
		System.out.println(list);
	}

}
