package day3.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Used getTitle()  
public class verifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
		if (driver.getTitle().contains("Testleaf")) //contains method is used to verify whether the title has this part of text in the title.
		{
			System.out.println("Testleaf is present");
		} else {
			System.out.println("Testleaf is not present");
		}

		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());

		/*
		 * 

	WebElement verifications = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
		System.out.println(verifications.getAttribute("href"));
		 */
	}

}
