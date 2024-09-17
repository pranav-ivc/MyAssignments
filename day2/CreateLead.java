package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoCSR");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		WebElement login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		WebElement crm=driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crm.click();
	}

}
