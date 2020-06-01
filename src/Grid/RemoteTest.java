package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		// To run your test cases in Remotely 
		// we need to use DesiredCapabilities
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		
		dc.setPlatform(Platform.WINDOWS);
		

		// webdriver driver = new Chromedriver() to Run in Local machine
		
	
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		
		
		
		
		
		
	}

}
