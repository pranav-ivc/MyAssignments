package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		WebDriver frame=driver.switchTo().frame("iframeResult");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		//alert.accept();
		alert.dismiss();
		
		
		String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(text.equals("You pressed OK!")) {
		
		System.out.println("The verified text is: "+text);
		
		}
		else {
			System.out.println("The verified text is: "+text);
		}
		
		driver.switchTo().defaultContent();
		
		driver.close();
				
	}

}
