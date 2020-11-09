package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidatePage;
import util.BrowserFactory;

public class AllListRemoved {
	WebDriver driver;
	@Test
	public void ValidUserShouldBeAbleToAddCustomer() throws InterruptedException {
	driver = BrowserFactory.startBrowser();
	
	ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
	
	validatePage.CheckBoxAllForRemove();
	validatePage.clickoncheckboxbutton();
	BrowserFactory.tearDown();

}
}