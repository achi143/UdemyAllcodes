package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CkeckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		Thread.sleep(2000);

		// we say static dropdown
		// and Dynamic Drop down with index "(//a[@value='MAA'])[2]"

		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		// we can use both the by parent child relationship

		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Assert.assertFalse(true);

		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(true);

		// count no of checkboxes present in the webpage
		// we need to select the common type and use that in chropath

		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).

		// System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("Class"));
		
		

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("Class").contains("1"));
		

		if (driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).getAttribute("Class").contains("select-label"))
			
		{
			System.out.println("it's enabled");
			Assert.assertTrue(false);
		}

		else {
			Assert.assertFalse(true);

		}
	}
}
