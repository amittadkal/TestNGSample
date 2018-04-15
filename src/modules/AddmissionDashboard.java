package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.AssertionConstant;
import pages.AddmissionDashboardPages;
import pages.SearchPage;
import utils.RandomUtils;
import utils.SleepUtil;

public class AddmissionDashboard{
	
	public void searchAnyString(WebDriver driver) {
		driver.findElement(AddmissionDashboardPages.searchText).sendKeys(RandomUtils.randomString(5));
		driver.findElement(AddmissionDashboardPages.searchButton).click();
	}
	
	public void assertSearchResult(WebDriver driver) {
		SleepUtil.waitForSeconds(2);
		String searchLeadLabel = driver.findElement(By.id(SearchPage.SEARCH_LEAD_LABEL)).getText();
		Assert.assertEquals(searchLeadLabel,AssertionConstant.EXPECTED_HEADING_LABEL);
		String actualText = driver.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdsrchlead']/tbody/tr/td")).getText();
		Assert.assertEquals(actualText, AssertionConstant.EXPECTED_RESULT);;
	}

}
