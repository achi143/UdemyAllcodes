package Session2fromLesson64;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Luna Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companions");
		
		// month name and date name
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		// Grab the common attribute  // put into the list and iterator
		
		
			// while loop will keep on executing until it become false
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Aug"))
				
		{
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
			
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++) 
		{
			
			String text = driver.findElements(By.className("day")).get(i).getText();
			
			if (text.equalsIgnoreCase("2"))
			{
				
			driver.findElements(By.className("day")).get(i).click();
			
			break;	
				
			}		
		}
		
	}

}
