package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractise_findleads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the UserName
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		// findElementByID
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		//parent sibling
		driver.findElementByXPath("(//label[text()='First name:'])[3]/following::input").sendKeys("ASH");
		


	}

}
