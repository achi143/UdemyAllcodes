package Session2fromLesson64;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

// Enter the letters BENG
// verify the airport optio

public class Autosuggestive {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		
		
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		// java script DOM can extrct the hidden elements
		
		// because selenium identify hidden elements  -(Ajax implementation)
		
		// investigate the properites of object if have any hidden text
		
		// javascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value";
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		// bengular international airport
		
		int i = 0;
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
			
		{
			i++;
			
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
						
			text = (String) js.executeScript(script);
			
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
		}	
		
		if (i>10)
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("Element found");
		}
		
	}

}
