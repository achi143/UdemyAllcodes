package Session2fromLesson64;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//  Lesson no 65

public class Base {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Brocolli", "Cucumber", "Carrot" };

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Cucumber -1 kg should be split like
			// Cucumber , 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// formate it to get actual vegeatble name
			// check wether name you extracted is present in arrayList or not
			// convert array to array list for easy search

			List itemNeededlist = Arrays.asList(itemsNeeded);

			if (itemNeededlist.contains(formattedName)) {
				j++;
				/// click to Add to cart

				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				// 3times

				if (j == itemsNeeded.length) {

					break;
				}
			}
		}
	}
}
