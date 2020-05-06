
package com.capgemini.snapdealproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capgemini.snapdealproject.test.PropertiesFile;

public class SearchBarPage extends PropertiesFile {

	@FindBy(id = "inputValEnter")
	WebElement searchBar;

	@FindBy(xpath = "//span[@class=\"searchTextSpan\"]")
	WebElement searchSubmit;

	// initializing page objects
	public SearchBarPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void searchBoxChecking() {
		boolean box = searchBar.isEnabled();
		Assert.assertTrue(box, "Search box is not present");
	}

	public void searchingProduct(String testData) throws InterruptedException {

		searchBar.sendKeys(testData);
		searchSubmit.click();
	}

	public void gettingProductTitle() {
		String actualTitle = "Snapdeal.com - Online shopping India- Discounts - shop Online Perfumes, Watches, sunglasses etc";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "UnexpectedTitle");

	}

}

