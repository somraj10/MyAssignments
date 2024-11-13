package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the AJIO website
		driver.get("https://www.ajio.com/");
		
		//Serach "Bags"
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		//Select gender as Male
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		
		//Select category as Fashion Bags
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		
		//Print the count of the items found.
		String text = driver.findElement(By.xpath("//div[@class=' filter-container']//strong")).getText();
		System.out.println(text);
		
		//Get the list of brand of the products displayed in the page and print the list
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		List <WebElement> brand = driver.findElements(By.xpath("//input[@name='brand']/following-sibling::label"));
		
		List <String> brandList = new ArrayList <String> ();
		
		for (WebElement i : brand) {
			String text2 = i.getText();
			//System.out.println(text2);
			brandList.add(text2);
		}
		
		System.out.println("The brands are: "+brandList);
		
		//Get the list of names of the bags and print it
		List <WebElement> bagName = driver.findElements(By.className("nameCls"));
		
		List <String> bagList = new ArrayList <String> ();
		
		for (WebElement i : bagName) {
			String text3 = i.getText();
			//System.out.println(text3);
			bagList.add(text3);
		}
		
		System.out.println(bagList);
		
		driver.close();

	}

}
