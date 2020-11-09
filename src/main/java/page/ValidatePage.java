package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatePage {
	WebDriver driver;

	public ValidatePage(WebDriver driver) {

	
		this.driver = driver;

	}
// Element Library
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement TOGGLE_ALL_CHECK_BUTTON;
	@FindBy(how = How.NAME, using = "todo[5]")
	WebElement SINGLE_CHECKBOX_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement SINGLE_CHECKBOX_REMOVE_BUTTON;
	
	// Intractive Methods
	///html/body/div[3]/input[1]
	
	public void clickoncheckboxbutton() {
		TOGGLE_ALL_CHECK_BUTTON.click();
		CheckBoxAll();

	}

	public void CheckBoxAll() {
		String cssSelectorForNotCheck = ("[name='todo'] input[type='checkbox']");
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		checkBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		for (WebElement checkBox : checkBoxList) {
			if (!checkBox.isSelected()) {
				Assert.fail("Checkbox not selected");
			} else {
				Assert.assertTrue(true);
			}

		}

	}

	public void clickonsinglecheckboxbutton() {
		SINGLE_CHECKBOX_BUTTON.click();
		
		//CheckBoxOneRemove();
	}

	public void CheckBoxOneRemove() {
		String cssSelectorForNotCheck = ("[name='todo'] input[type='checkbox']");
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		int size = checkBoxList.size();
		SINGLE_CHECKBOX_BUTTON.click();
		//Please comment out if u want to remove the down one
		//SINGLE_CHECKBOX_REMOVE_BUTTON.click();
		// if click remove
		List<WebElement> newCheckBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		int newSize = newCheckBoxList.size();
		if (size - 1 == newSize) {
			Assert.assertTrue(true);

		} else {
			Assert.fail("Fail because did not remove");
		}

	}
	public void CheckBoxAllForRemove() {
		String cssSelectorForNotCheck = ("[name='todo'] input[type='checkbox']");
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		checkBoxList = driver.findElements(By.cssSelector(cssSelectorForNotCheck));
		for (WebElement checkBox : checkBoxList) {
			//if (!checkBox.isSelected())
				if (!checkBox.isDisplayed()){
				SINGLE_CHECKBOX_REMOVE_BUTTON.click();
			
				Assert.fail("Checkbox not selected");
			} else {
				Assert.assertTrue(true);
			}

		}

	}


}