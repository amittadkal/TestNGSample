package modules;

import org.openqa.selenium.WebDriver;

import constants.PageConstants;

public class HomePageModule {
	public void navigateBaseURL(WebDriver driver) {
		driver.get(PageConstants.URL);
		
	}

}
