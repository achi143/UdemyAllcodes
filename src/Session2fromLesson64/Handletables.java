package Session2fromLesson64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handletables {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22747/ind-vs-ban-2nd-t20i-bangladesh-tour-of-india-2019");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//table.findElements(By.cssSelector())
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
