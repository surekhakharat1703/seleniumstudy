package seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumUse {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/home/mangesh/Surekha_Testing/Selenium/chromedriver_linux64/chromedriver");
	WebDriver wd =new ChromeDriver();
	wd.get("https://www.google.com/");
	}
}

