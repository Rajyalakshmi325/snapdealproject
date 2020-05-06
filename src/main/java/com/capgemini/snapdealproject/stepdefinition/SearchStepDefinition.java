package com.capgemini.snapdealproject.stepdefinition;

import org.testng.annotations.Test;

import com.capgemini.snapdealproject.pageobject.HomePage;
//import com.capgemini.snapdealproject.pageobject.ProductsPage;
import com.capgemini.snapdealproject.pageobject.SearchBarPage;
import com.capgemini.snapdealproject.test.PropertiesFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefinition  extends PropertiesFile {
	SearchBarPage s;
	HomePage home;

	@Test
	@Given("^open the browser$")
	public void open_the_browser()  {
		openbrowser();
	}

	@Test
	@When("^enter the url$")
	public void enter_the_url() {
		setUp();
	}
	@Test(dependsOnMethods = " get_the_title_of_the_page()")
	@Then("^get the title of the page$")
	public void get_the_title_of_the_page()  {
		home = new HomePage();
		home.title();
	}
	@Test
	@Then("^search bar should enabled$")
	public void search_bar_should_enabled()  {
		 s= new SearchBarPage(driver);
		s.searchBoxChecking();
	}
	@Test(dependsOnMethods = "user_search_for_a_product()")
	@Then("^User search for a product$")
	public void user_search_for_a_product() throws InterruptedException  {
		 s = new SearchBarPage(driver);
		s.searchingProduct(p.getProperty("productName"));
	}
	
	@Test(dependsOnMethods = "user_search_for_a_product()")
	@Then("^User is on that product page$")
	public void user_is_on_that_product_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s = new SearchBarPage(driver);
		s.gettingProductTitle();
	}
	@Test
	@Then("^close the browser$")
	public void close_the_browser()  {
	   closebrowser();
	}
}
