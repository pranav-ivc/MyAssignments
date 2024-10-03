package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTry {

	public static void main(String[] args) {
	
		//Launch Browser
				ChromeDriver driver=new ChromeDriver();
				
				
				//Load Url
				driver.get("https://www.leafground.com/table.xhtml");
				
				
				//Maximize Window
				driver.manage().window().maximize();
				
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Locate the table
				WebElement table=driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody"));
				
				List<WebElement> numberOfRows=table.findElements(By.tagName("tr"));
				
				int rowSize=numberOfRows.size();
				System.out.println(rowSize);
				
				List<WebElement> numberOfColumns=table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));;
				
				int columnSize=numberOfColumns.size();
				System.out.println(columnSize);
				
				List<WebElement> fourthData=table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr[4]/td"));
				
		
				
	}

}
