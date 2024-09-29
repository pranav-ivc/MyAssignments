package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		//Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/dashboard.xhtml");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the button with the text ‘Click and Confirm title
		//driver.findElement(By.xpath("//div[@class='card']//span[1]")).click();
		
		//Verify that the title of the page is ‘dashboard'.
		String dashboardTitle=driver.getTitle();
		//String dash="Dashboard";
		//if(dash.equals(dashboardTitle)) {
		System.out.println("The Dashboard Title is : "+dashboardTitle);
		//}
		//else {
		//	System.out.println("The title is wrong ");
		//}
		
		driver.findElement(By.xpath("//ul[contains(@class,'layout-menu')]/li[3]")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_button']")).click();
		
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		boolean disabled=driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled')]")).isEnabled();
		System.out.println("Confirm if the button is disabled or not :"+disabled);
		
		//Find and print the position of the button with the text ‘Submit.
		Point location=driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2 ui-state-hover')]")).getLocation();
		System.out.println(location);
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		//getCssValue("background-color");
		String backgroundColor=driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2')]")).getCssValue("background-color");
		System.out.println(backgroundColor);
	}

}
