package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		Thread.sleep(2000);
		
		// we say static dropdown 
		// and Dynamic Drop down with index  "(//a[@value='MAA'])[2]"
		
		
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		// //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']     we can use both the by parent child methods
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		// we use these method when we have multiple instances
		
		
		////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']   
		
		//we can use without the index by using parent and child method
		
		// parent child relationship xpath
		
		// in some cases clients will not accept the code using index 
		// we can also use another method to handle this
		
		
		
		
		

	}

}
