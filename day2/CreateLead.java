package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maxmize the window
		driver.manage().window().maximize();
		
		//Provide UserName and Password for Login
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoCSR");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		WebElement login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
		//Getinto CRM/SFA
		WebElement crm=driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crm.click();
		
		//Create Leads
		WebElement leads=driver.findElement(By.xpath("//a[contains(text(),'Lead')]"));
		leads.click();
		WebElement createLead=driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createLead.click();
		
		//Not working .. need help
		WebElement companyName=driver.findElement(By.xpath("//input[@name='companyName']"));
		companyName.sendKeys("TestLeaf");
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Pranav");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Vivekanandhan");
	}

}
