package week2.day5.marathon1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusTicketBooking {

	public static void main(String[] args) {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
				
		//Load Url
		driver.get("https://www.abhibus.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
			
		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select From station
		WebElement fromStation=driver.findElement(By.xpath("//div[@id='search-from']//input"));
		fromStation.sendKeys("Bangalore");
		fromStation.click();
		
		//Select To Station
		WebElement toStation=driver.findElement(By.xpath("//div[@id='search-to']//input"));
		toStation.sendKeys("chennai");
		toStation.click();
		
		//Select the Date of Journey
		//WebElement dateOfJourney=driver.findElement(By.xpath("//div[@id='jaurney-date']//button[1]"));
		//dateOfJourney.click();
		
		//Click Search
		WebElement search=driver.findElement(By.xpath("//div[@id='search-button']"));
		search.click();
		
		WebElement fromStation1=driver.findElement(By.xpath("//div[@id='search-from']//input"));
		fromStation1.sendKeys("Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		search.click();
		
		
		
		
		
		
		
	}

}
