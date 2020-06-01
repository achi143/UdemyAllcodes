package Session3fromlesson107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablesort {
	
	public static void main(String[] args) {
		

		System.setProperty("webDriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> firstcollist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		
		for(int i =0;i<firstcollist.size();i++) {
			
			originalList.add(firstcollist.get(i).getText());
			
		}
		
		ArrayList<String> copyList = new ArrayList<String>();
		
		for (int i=0;i<originalList.size();i++)
		{	
			copyList.add(originalList.get(i));	
			
		}
		
		Collections.sort(copyList);
		
		Assert.assertTrue(originalList.equals(copyList));
		
		
	}

}
