package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.AssertionConstant;
import pages.Home;

public class LoginModules {
	
	public void login(WebDriver driver) {
		driver.findElement(By.id("btnlogin")).click();
		driver.findElement(By.id("txtuname")).sendKeys("techcanvassuser@techcanvass.co.in");
		driver.findElement(By.id("txtpwd")).sendKeys("user1234");
		driver.findElement(By.id("loginbtn")).click();
	}
	
	public boolean checkLogin(WebDriver driver) {
		String expectedresult = AssertionConstant.CHECK_LOGIN;
		String actualresult = Home.loginButton(driver);
		return expectedresult.equals(actualresult);
	}

}
