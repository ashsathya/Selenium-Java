package day3.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//find the element
		WebElement web=driver.findElementById("dropdown1");
		//use select class for dropdown
		Select selectDropdown =new Select(web);
		//use select class object to handle the dropdowns
		selectDropdown.selectByIndex(1);


		WebElement web2=driver.findElementByName("dropdown2");
		Select dd2=new Select(web2);
		dd2.selectByVisibleText("Selenium");

		WebElement web3=driver.findElementById("dropdown3");
		Select dd3=new Select(web3);
		dd3.selectByValue("1");

		WebElement web4=driver.findElementByClassName("dropdown");
		Select drop=new Select(web4);

		//To get the number of dropdown options

		List<WebElement> options=drop.getOptions();
		int dropdownCount =options.size();
		System.out.println(dropdownCount);

		//To Select the dropdown using sendkeys

		driver.findElementByClassName("dropdown").sendKeys("Appium");

		driver.findElementByXPath("(//select)[6]").sendKeys("Selenium");


	}

}
