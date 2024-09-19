package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		//Implicity wait for 3 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Create Accounts
		//WebElement account=driver.findElement(By.xpath("//div[@class='x-panel-header']/a"));
		WebElement account=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		account.click();
		WebElement createAccount=driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
		createAccount.click();
		
		// Enter Account Name
		WebElement accountName=driver.findElement(By.xpath("//input[@id='accountName']"));
String accName="Current Account3";
		accountName.sendKeys(accName);
		
		//Enter Description as "Seleniumn Automation Tester"
		WebElement description=driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("This is My First Current Account");
		
		//Select "Computer software "  as Industry
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dropDownIndustry = new Select(industry);
		dropDownIndustry.selectByIndex(3);
		
		//Select "S-Corporation" as Ownership
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dropDownOwnership=new Select(ownership);
		dropDownOwnership.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as Source
		WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dropDownSource=new Select(source);
		dropDownSource.selectByValue("LEAD_EMPLOYEE");
		
		//Select "Ecommerce site internal campaign" as marketing campaign 
		WebElement marketingCampaign=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select dropDownMarketingCampaign=new Select(marketingCampaign);
		dropDownMarketingCampaign.selectByIndex(6);
		
		//Select "Texas" as State/Province
		WebElement state=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select dropDownState=new Select(state);
		dropDownState.selectByValue("TX");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//Clcik Create account Button
		WebElement createAccount1=driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		createAccount1.click();
		
		//Verify Account name ==>> Need Help on Verifying Account Name
		WebElement verifyAccountName=driver.findElement(By.xpath("//span[contains(text(),'Current Account3']"));
		String vAccName=verifyAccountName.getText();
		if(vAccName.equals(accName)) {
			System.out.println("Account Name Verified and All Good ");
		}
		
		//Close Browser
		driver.close();

	}

}
