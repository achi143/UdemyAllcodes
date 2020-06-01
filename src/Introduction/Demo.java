package Introduction;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());//validate you are landed on correct url

		//System.out.println(driver.getPageSource());//print page sources
		
		driver.get("http://yahoo.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		//driver.close();
	}

}
