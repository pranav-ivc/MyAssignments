package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebookBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("testleaf.2023@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//driver.findElement(By.id("identify_email")).sendKeys("test@2023@gmail.com");
		//driver.findElement(By.id("did_submit")).click();
		//String title=driver.getTitle();
		//System.out.println(title);

	}

}
