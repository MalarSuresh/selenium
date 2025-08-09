package com.Amazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Amazon.pom.HomePage;
import com.Amazon.pom.ProductPage;

public class Priority extends BaseclassNew{
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("browserLaunch");
	}
	@BeforeTest
	public void openUrl() {
		System.out.println("launchUrl");
	}
	
	@BeforeClass
	public void waitForPage() {
		System.out.println("Implicit wait");
	}
	
	@BeforeMethod
	public void refreshPage() {
		System.out.println("Page refreshed");
	}
	
	@Test(priority =2)
	public void searchForPage() {
		System.out.println("search using sendkeys");
		System.out.println("click on search btn");
	}
	
	@Test
	public void selectForProduct() {

		System.out.println("driver.getCurrentUrl()");
		System.out.println("Click on any product");

		System.out.println("add the product to the cart");
		System.out.println("select the quantity");

	}
	@Test(priority =-2,invocationCount=2)
	public void payment() {
		System.out.println("Payment needs to be done...");
	}
	
	@Test(priority =-1)
	public void RemoveFromCart() {
		System.out.println("Remove from cart.");
	}
	
	@AfterMethod
	public void screenshot() {
		System.out.println("screenshot");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("click on logout btn");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Cookies deleted");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Quit the browser");

	}
}
