package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsUtils {

	public static WebDriver setBrowserDriverAndLaunch(String Browser) {
		WebDriver driver;
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Incorrect Browser Name. NPE will be Thrown");
			driver = null;
		}
		return driver;
	}
	
	public static void close(WebDriver driver) {
		driver.close();
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
	
	

}
