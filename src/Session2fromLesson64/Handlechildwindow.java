package Session2fromLesson64;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlechildwindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("");

		driver.findElement(By.xpath("  ")).click();

		System.out.println(driver.getTitle());           // this will return the parent title

		Set<String> ids = driver.getWindowHandles();     // this is use to get the ids of the windows

		Iterator<String> it = ids.iterator();            // this is used to get the ids of the windows

		String parentid = it.next();                     // .next will navigate to next window and get the ids of the parent window

		String childid = it.next();                      // .next will perform the same

		driver.switchTo().window(childid);               // this is used to switch to the child window

		System.out.println(driver.getTitle()); 			 // this is used to get the title of the child window
		
		driver.switchTo().window(parentid);				 // this is used to switch back to the parent window

	}

}
