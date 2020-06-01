package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		
		WebElement Source = driver.findElement(By.className(""));
		
		Thread.sleep(2000);
		
		Source.clear();
		Thread.sleep(2000);
		Source.sendKeys("MUM");
		Source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.className(""));
		
		Thread.sleep(2000);
		destination.clear();
		Thread.sleep(2000);
		destination.sendKeys("HYD");
		
		destination.sendKeys(Keys.ARROW_DOWN);
		
		destination.sendKeys(Keys.ENTER);
		
		// this program will get an error 
		
		
		
		
		
	}

}
