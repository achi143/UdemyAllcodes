package Session2fromLesson64;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiosDeom {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().contextClick().build().perform();
		
		// .keyDown(key.shift) is used to click on the shift button
		
		// . doubleclick() is used to select the element
		
		// . contextclick () is used to right click on the particular element 
		
		// . build() is used to build the operation
		//.perform() is used to perform the given action
	}

}
