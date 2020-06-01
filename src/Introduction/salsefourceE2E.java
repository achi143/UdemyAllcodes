package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salsefourceE2E {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com");
		//Regural Expression this is used only the part of that
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		
		//this is general xpath expression
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("ashrith");
		
		//this is using the #
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");
		
		driver.close();
		

	}

}
