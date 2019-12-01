package day4.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("https://erail.in/");
		// Maximize the browser
		driver.manage().window().maximize();
		//to remove the blank spaces - uncheck sort by dates
		driver.findElementByXPath("//label[text()='Sort on Date']//following-sibling::input").click();
		// To enter the source
		WebElement elsSource = driver.findElementById("txtStationFrom");
		elsSource.clear();
		elsSource.sendKeys("MAS",Keys.TAB);
		//To enter the destination
		WebElement elsDestiny= driver.findElementById("txtStationTo");
		elsDestiny.clear();
		elsDestiny.sendKeys("SBC",Keys.TAB);
		//To make wait of the browser
		Thread.sleep(3000);
		//To identify the table name click on the first row and traverse top to identify the xpath
		//table - findElement
		WebElement eltable=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");

		List<WebElement> eleRows = eltable.findElements(By.tagName("tr"));
		//using foreach
		for (WebElement eachRow : eleRows) //eleRows - source which stores the values, eachRow - temp variable
		{

			List<WebElement> cols = eachRow.findElements(By.tagName("td"));
			System.out.println(cols.get(1).getText());// table index starts with 0 . to select from column 2 give input as '1'

		}

		//using for 
		for(int i=0;i<eleRows.size();i++)
		{
			List<WebElement> coldata = eleRows.get(i).findElements(By.tagName("td"));
			
			
			System.out.println(coldata.get(1).getText());

		}

	}

}
