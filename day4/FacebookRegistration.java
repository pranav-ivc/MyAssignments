package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//LoadUrl
		driver.get("https://en-gb.facebook.com/");
		
		//Click Create New Account
		WebElement createNewAccount=driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
		createNewAccount.click();
		
		//Enter First Name
		//WebElement firstName=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Pranav");
		
		//Enter SurName
		WebElement surName=driver.findElement(By.name("lastname"));
		surName.sendKeys("Vivekanandhan");
		
		//Enter Mobile Number
		WebElement mobileNumber=driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("3847409870");
		
		//Enter Password
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("PASSWORD@123");
		
		//Enter Date of Birth
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select dropDownDay=new Select(day);
		dropDownDay.selectByValue("20");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select dropDownMonth=new Select(month);
		dropDownMonth.selectByVisibleText("Sep");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select dropDownYear=new Select(year);
		dropDownYear.selectByIndex(15);
		
		//Enter Gender
		WebElement gender=driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		gender.click();
		
		//Click Sign up
		WebElement signUp=driver.findElement(By.id("u_f_n_va"));
		signUp.click();
	}

}
