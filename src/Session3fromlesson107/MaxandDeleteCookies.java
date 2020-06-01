package Session3fromlesson107;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaxandDeleteCookies {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookieNamed("dfsdf");  // this method is used when we now the name of the cookie
		
		//driver.manage().addCookie("cookiee"); //this we not work 
		
		// click on any link
		// login page verify login url
		
		driver.get("http://google.com");
		
		
		
		
	}

}
