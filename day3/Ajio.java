package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URl
		driver.get("https://www.ajio.com/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Search Bag
		WebElement bags=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		bags.sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		
		//Select Gender Men
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
		
		//Select Category Fashion Bags
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags')]")).click();
		
		//Print the number of items found
		String getItemsFound=driver.findElement(By.xpath("//div[@class=' filter-container']//strong")).getText();
		System.out.println(getItemsFound);
		
		//Print the Brands 
		List<String> printBrandName=new ArrayList<String>();
		String brandText;
		List<WebElement> brands=driver.findElements(By.xpath("//div[@class='brand']"));
		int brandSize=brands.size();
		for(int i=0; i<brandSize;i++) {
			brandText= brands.get(i).getText();
			printBrandName.add(brandText);
		}
		
		System.out.println("**************Brand Names*****************");
		System.out.println(printBrandName);
		
		//Print Bag Names
		List<String> printBagNames=new ArrayList<String>();
		String bagText;
		List<WebElement> bagNames=driver.findElements(By.xpath("//div[@class='nameCls']"));
		int bagNameSize=bagNames.size();
		for(int i=0; i<bagNameSize;i++) {
			bagText=bagNames.get(i).getText();
			printBagNames.add(bagText);
		}
				
		System.out.println("**************Bag Names*****************");
		System.out.println(printBagNames);
		
		//Close the Browser
		driver.close();
		
	}

}
