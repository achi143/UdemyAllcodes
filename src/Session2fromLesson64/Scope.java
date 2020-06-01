package Session2fromLesson64;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	
	public static void main(String[] args) throws InterruptedException {
		
		//   Requriment
		
		// 1. give me the count of links on the page
		// 2. count of the footer section
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size()); // this use to get all the link tags
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // this is use to get particular links like footer section
		
		System.out.println(footerdriver.findElement(By.tagName("a")).getSize());
		
		// i want the link on the First colum
		
		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		
		// click on each link in the coloum and check if the pages are opening
		
		for (int i =1; i<coloumdriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonthelinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonthelinktab);
			
			Thread.sleep(5000L);
		}
			
			Set<String> abc = driver.getWindowHandles();
			
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				
				System.out.println(driver.getTitle());	
			}
	}

}
