package day3.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class buttonActivies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		// To get the size (width and height)
		System.out.println(driver.findElementById("position").getSize()); 
		// To get the position( x and y co-ordinate)
		System.out.println(driver.findElementById("position").getLocation()); 
		// To get the color 
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		//To get the size
		System.out.println(driver.findElementById("size").getSize()); 
		
	}

}
