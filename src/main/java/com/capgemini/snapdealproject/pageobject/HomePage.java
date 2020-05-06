package com.capgemini.snapdealproject.pageobject;
import org.testng.Assert;

import com.capgemini.snapdealproject.test.PropertiesFile;

public class HomePage extends PropertiesFile {
	
	public  void title() {
		
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected, "UnexpectedTitle");
		//Assert.assertEquals(actualTitle, expectedtitle,"UnexpectedTitle");

	}

}
