package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {
		
		//Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load URl
		driver.get("https://erail.in/");
		
		//Maxim,ize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Select MAS from station
		WebElement from=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("MAS");
		WebElement mas=driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']"));
		mas.click();
		
		//Select EDU To station
		WebElement to=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.clear();
		to.sendKeys("MDU");
		WebElement mdu=driver.findElement(By.xpath("//div[text()='Madurai Jn']"));
		mdu.click();
		
		// Uncheck the "Sort on Date" checkbox
		WebElement sort=driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		sort.click();
		
		//Retrieve the train names from the web table
		//Select table
		WebElement table=driver.findElement(By.xpath("//div[@id='divMainWrapper']//table/tbody"));
		
		List<WebElement> numberOfRows=new ArrayList<WebElement>();
		numberOfRows=table.findElements(By.tagName("tr"));
		int rowSize=numberOfRows.size();
		System.out.println("Row Size is: "+rowSize);
		
		List<WebElement> numberOfColumns=table.findElements(By.xpath("//div[@id='divMainWrapper']//table//th"));
		int columnSize=numberOfColumns.size();
		System.out.println("Column size is: "+columnSize);
		
		List<WebElement> secondColumnTrainNames=table.findElements(By.xpath("//div[@id='divMainWrapper']//table/tbody/tr/td[2]"));
		
		List<String> trainNames1=new ArrayList<String>();

		String train=null;
		for(int i=2;i<rowSize;i++) {
			WebElement selectRow=table.findElement(By.xpath("//div[@id='divMainWrapper']//table/tbody/tr["+i+"]"));
			
			for(int j=2;j<3;j++) {
				WebElement selectColumn=table.findElement(By.xpath("//div[@id='divMainWrapper']//table/tbody/tr["+i+"]/td["+j+"]"));
				train=selectColumn.getText();
				trainNames1.add(train);
				
							}
		}
		System.out.print(trainNames1);
		int size=trainNames1.size();
						
				
		//verify any duplicate train names are present or not
		
		HashSet<String> set = new HashSet<String>();
	    List<String> duplicateList = new ArrayList<String>();

	    for (String item : trainNames1) {
	        if (!set.contains(item)) {              
	            set.add(item);
	        } else {
	            duplicateList.add(item);
	        }
	    }
	    
	    System.out.println(" ");
	    System.out.println("Size of duplicateList is :"+duplicateList.size());
	    
	    for (String element : duplicateList) {
	        System.out.println("Duplicate Train name is :"+element);
	    }
				
	}

}
