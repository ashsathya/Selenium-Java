package day3.classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	private static WebElement ddSecond;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the property for ChromeDriver
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
		;
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Ashsathasdgasdaya");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("ABCasdaD");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("ASasdaDJ");
		WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");

		Select dd = new Select(dropDown);

		// Select 'Source' as 'Other' (Handling DropDown)
		// dd.selectByValue("LEAD_OTHER");
		// dd.selectByIndex(6);
		dd.selectByVisibleText("Other");
		// Select 'Preferred Currency' as 'INR'

		ddSecond = driver.findElementById("createLeadForm_currencyUomId");
		Select dd2 = new Select(ddSecond);
		//dd2.selectByValue("INR");
		//dd2.selectByVisibleText("INR - Indian Rupee");
		//Get all the size
		//To select last -1 option from the dropdown.
		List<WebElement> options = dd2.getOptions();
		int option=options.size();
		dd2.selectByIndex(option-1);

		//To print all options

		//for (WebElement eachElement : options) 
		//{
		//String text = eachElement.getText();
		//System.out.println(text);
		//}
		driver.findElementByClassName("smallSubmit").click();
		driver.navigate().back();
		driver.navigate().forward();

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}
