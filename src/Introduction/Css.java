package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Ashrith");
		
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.close();
		
		
		//verify the your code in the firebug before you Run the Test
		// Css Customized Xpath
		//we can identify css by using Shotcuts
		//#Login for the Css
		//.classname
		//try to find the uniqe attribte

	}

}
