package seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_upDown_class {
	public static void main(String[] args) throws Exception {		
		  System.setProperty("webdriver.chrome.driver", "/home/mangesh/Surekha_Testing/Selenium/chromedriver_linux64/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'new account')]")).click();
		Thread.sleep(3000);
		//identify the dropdown which need to handle of webelement type		
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		//create object of the action class and pass the parameter web driver
		Actions act = new Actions(driver);
		
		//use action class method.click on element
		act.click(month).perform();
		Thread.sleep(3000);
		//move one option upward
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		//move one option downward
		act.sendKeys(Keys.ARROW_DOWN).perform();		
	}
}
