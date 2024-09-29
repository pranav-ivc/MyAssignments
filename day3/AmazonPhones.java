package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonPhones {

	public static void main(String[] args) {

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load Url
		driver.get("https://www.amazon.in/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Search for "phones"
		WebElement bags=driver.findElement(By.id("twotabsearchtextbox"));
		bags.sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Print the prices of that first webpage
		
		//Using className as finder
		//List<WebElement> prices=driver.findElements(By.className("a-price-whole"));
		
		//Using xpath for finder which prints only price
		//List<WebElement> prices=driver.findElements(By.xpath("//span[contains(@class,'a-price-whole')]"));
		
		//Using xpath for finder which prints price and the currency symbol
		List<WebElement> prices=driver.findElements(By.xpath("//span[@class='a-price']"));
		
		int size=prices.size();
		System.out.println("Number of prices displayed in first webpage is : "+size);
		
		//Object creation for array list
		List<String> grandTotal=new ArrayList<String>();
		
		for (int i=0;i<size;i++) {
			String total=prices.get(i).getText();
			grandTotal.add(total);
		}
		System.out.println("Prises of Phones are :"+grandTotal);
		
		driver.close();
	}
}
