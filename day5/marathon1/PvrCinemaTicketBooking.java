package week2.day5.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PvrCinemaTicketBooking {

	public static void main (String args[]) {
		//Launch Browser
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		
		//Load Url
		driver.get("https://www.pvrcinemas.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Select location
		WebElement selectLocation=driver.findElement(By.xpath("//div[@class='show-desktop-view']"));
		selectLocation.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement chennai=driver.findElement(By.xpath("//div[@class='p-sidebar-content']//div[7]"));
		chennai.click();
		
		//Select Cinema from quick book
		WebElement cinema=driver.findElement(By.xpath("//div[@class='date-show']/span[2]"));
		cinema.click();
		
		//Select cinema option from Quick book
		WebElement cinemaSelect=driver.findElement(By.xpath("//div[@id='cinema']"));
		cinemaSelect.click();
		
		//Select first option of cinema from drop down
		WebElement movieSelect=driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]"));
		movieSelect.click();
		
		//Select date first option
		WebElement movieDate=driver.findElement(By.xpath("//div[@id='date']"));
		movieDate.click();
		WebElement movieDateSelect=driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[2]"));
		movieDateSelect.click();
		
		//Select movie first option
		WebElement movie=driver.findElement(By.xpath("//div[@id='movie']"));
		movie.click();
		WebElement movieSelectFirst=driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]"));
		movieSelectFirst.click();
		
		
		//Select time first option
		WebElement time=driver.findElement(By.xpath("//div[@id='time']"));
		time.click();
		WebElement timeSelect=driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]"));
		timeSelect.click();
		
		//Click book button
		WebElement clickBook=driver.findElement(By.xpath("//div[@class='quick-lefts ']"));
		clickBook.click();
		
		//Click accept button from the Pop up terms & conditions
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[2]")).click();
		
		//Select seat
		driver.findElement(By.xpath("//tr[@class='seats-row'][2]/td[11]")).click();
		
		//Click Proceed button in payment summary
		driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		
		//Print the seat number in console from booking summary
		String seatNumber=driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		System.out.println("The Selected seat number is :"+seatNumber);
		
		//Print the Grand total in console from booking summary
		String grandTotal=driver.findElement(By.xpath("//div[contains(@class,'grand-tota col-md-3')]")).getText();
		System.out.println("The Selected seat number is :"+grandTotal);
		
		//click proceed button from booking summary
		driver.findElement(By.xpath("//div[contains(@class,'register-btn col-md-3')]")).click();
		
		//Click "x" mark from the popup opened
		driver.findElement(By.xpath("//div[contains(@class,'cross-icon mx-2')]")).click();
		
		//Get the title and verify in console
		String title=driver.getTitle();
		System.out.println("The Title is :"+title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Close the browser
		driver.close();
	}
}
