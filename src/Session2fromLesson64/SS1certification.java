package Session2fromLesson64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SS1certification {
	
	public static void main(String[] args) {
		
		// SS1 certificates
		
		// desired capabilities
		// general chrome profile
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// below is local browser
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver(c);
	}

}
