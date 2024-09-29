package week3.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("//div[@class='card']//td[3]")).click();
		
		Thread.sleep(2000);
		
		WebElement selected=driver.findElement(By.xpath("//div[@class='card']//td[3]"));
		selected.click();
		boolean se=selected.isEnabled();
		System.out.println(se);
		
		List<WebElement> radio = driver.findElements(By.name("//div[contains(@class,'grid ui-fluid')]"));
			

	}

}
