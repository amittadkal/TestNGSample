package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	public static String loginButton(WebDriver driver) {
		String loginBut = driver.findElement(By.id("ctl00_Label23")).getText();
		return loginBut;
	}

}
