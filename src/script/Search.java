package script;

import org.openqa.selenium.WebDriver;

import modules.AddmissionDashboard;
import modules.HomePageModule;
import modules.LoginModules;
import utils.WebElementsUtils;

public class Search {
	public void search() {
		LoginModules lm = new LoginModules();
		AddmissionDashboard am = new AddmissionDashboard();
		HomePageModule hm = new HomePageModule();
		WebDriver driver = WebElementsUtils.setBrowserDriverAndLaunch("Chrome");
		hm.navigateBaseURL(driver);
		lm.login(driver);
		lm.checkLogin(driver);
		am.searchAnyString(driver);
		am.assertSearchResult(driver);
		WebElementsUtils.close(driver);
		WebElementsUtils.quit(driver);
	}
}
