package week2.day5.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBagSearch {
	
	public static void main (String args[]) {
	//Launch Browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load Url
	driver.get("https://www.amazon.in/");
	
	//Maximize window
	driver.manage().window().maximize();
	
	//Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Search for "Bags for boys"
	WebElement bags=driver.findElement(By.id("twotabsearchtextbox"));
	bags.sendKeys("Bags for boys");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	//Print the 1-48 of total text
	WebElement textPrint1=driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span[1]"));
	WebElement textPrint2=driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span[3]"));
	System.out.println(textPrint1.getText()+" "+textPrint2.getText());
	
	//Select first 2  Brands
	WebElement brand1=driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]//i)[2]"));
	brand1.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebElement brand2=driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]//i)[3]"));
	brand2.click();
	 
	WebElement opt=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	Select optionsNew=new Select(opt);
	optionsNew.selectByIndex(4);
	 
	//Print the text and price of the first bag from the sorted Newest
	String bagTitle=driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline-text')]//span")).getText();
	String bagPrice=driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-no-hover s-underline-tex')]//span[1]")).getText();
	System.out.println("Bag Title is "+bagTitle+" & the Price is "+bagPrice);
	 
	//Get the title of the page
	String titlePage=driver.getTitle();
	System.out.println("Title of the Page is "+titlePage);
	 
	//Browser close
	driver.close();
	}
}
