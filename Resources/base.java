

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class base 
{
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		
			
		//String browserName=System.getProperty("browser");
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.contains("chrome"))
		{
			
			
			System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"resources\\Drivers\\chromedriver.exe");
			/*
			ChromeOptions options = new ChromeOptions();
			
			if(browserName.contains("--headless"))
			{
				options.addArguments("--headless");
			}*/ 
				
			driver = new ChromeDriver();
			//(options)
			
			
		}
		
		else if(browserName.contains("Firefox"))
		{
			
			System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"resources\\Drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		return driver;	
	}
	
	
	
	public void getScreenshots(String result) throws IOException {
		// TODO Auto-generated method stub
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src ,new File("F://Test//"+result+"Screenshot.png"));
		
	}
	
	/*public void TakeScreenshots(String fileName, String fileExtension) throws IOException {
		

		String ScreenshotDirName = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		
		File crtDateFolder = new File(System.getProperty("user.dir") + "\\Screenshots\\" + ScreenshotDirName);
		
		if(!crtDateFolder.exists()) {
			crtDateFolder.mkdir();
		}
		
		//@SuppressWarnings("unchecked")
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = ((TakesScreenshot) srcShot).getScreenshotAs(OutputType.FILE);
		File DestFile = new File(crtDateFolder+ "\\" + fileName + fileExtension); //    /Screenshots
        FileUtils.copyFile(SrcFile, DestFile);
	}
	*/
	public void click() {
		
		click();
	}
	
	public void sendkeys() {
		
		sendkeys();
	}	
	

}
