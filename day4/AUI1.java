package week4.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI1 {

	public static void main(String[] args) throws IOException {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//Load Url
		driver.get("https://www.amazon.in/");
		
		
		//Maximize Window
		driver.manage().window().maximize();
		
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Instantiate Action 
		Actions act=new Actions(driver);
		
		//Finding WebElement for "condition of use and sale"
		WebElement cond=driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		
		act.scrollToElement(cond).perform();
		//cond.click();
		
		String text=cond.getText();
		System.out.println(text);
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/conditionOfUseAndSale.png");
		FileUtils.copyFile(source, destination);
		
		

	}

}
