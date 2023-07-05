package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
	 
	   System.setProperty("webdriver.chrome.driver", "/home/mangesh/Surekha_Testing/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("//select[contains(@id,'Day')]")).click();
         Thread.sleep(1000);
         WebElement day=driver.findElement(By.id("Day"));
	}

}
