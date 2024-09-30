package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//Load Url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		//Maximize Window
		driver.manage().window().maximize();
		
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Enter UserName & Password then Click Login
		//Enter Username
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoCSR");
		
		//Enter Password
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		
		//Click Login button
		WebElement login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
			
		//Click on the CRM/SFA
		WebElement crmSfa=driver.findElement(By.xpath("//div[@id='label']/a"));
		crmSfa.click();
		
		
		//Click on Contacts Button
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		contact.click();
		
		
		//Click on merge contacts
		WebElement mergeContact=driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]"));
		mergeContact.click();
		
		
		//Click on the widget of the "From Contact".
		WebElement fromContact=driver.findElement(By.xpath("//table[contains(@class,'twoColumnForm')]//following::a[1]"));
		fromContact.click();
		
		
		//Windows Handling
		Set<String> resultingContact=driver.getWindowHandles();
		
		List<String> resultAllContact=new ArrayList<String>(resultingContact);
		driver.switchTo().window(resultAllContact.get(1));
		
		Thread.sleep(3000);
		//Click on the first resulting contact.
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		
		//Switch Back to default window page
		driver.switchTo().window(resultAllContact.get(0));
		
		Thread.sleep(3000);
		//Click on the widget of the "To Contact".
		WebElement toContact=driver.findElement(By.xpath("//table[contains(@class,'twoColumnForm')]//following::a[2]"));
		toContact.click();
		
		
		//Windows Handling
		Set<String> resultingContact2=driver.getWindowHandles();
				
		List<String> resultAllContact2=new ArrayList<String>(resultingContact2);
		driver.switchTo().window(resultAllContact2.get(1));
		
		Thread.sleep(3000);
		//Click on the second resulting contact.
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();

		
		//Switch Back to default window page
		driver.switchTo().window(resultAllContact.get(0));
		
		
		//Click on the Merge button.
		WebElement merge=driver.findElement(By.xpath("//table[contains(@class,'twoColumnForm')]//following::a[3]"));
		merge.click();
		
		
		//Alert Handling
		Alert alert=driver.switchTo().alert();
		
		
		//Accept the alert.
		alert.accept();
		
		//Verify the title of the page.
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.close();

	}

}
