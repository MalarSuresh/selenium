package com.Amazon;

import org.openqa.selenium.By;
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

public class SimpleAnnotations extends BaseclassNew{
	
	@BeforeSuite
	public void launchBrowser() {
		browserLaunch("chrome");
	}
	@BeforeTest
	public void openUrl() {
		launchUrl("https://www.amazon.in/");
	}
	
	@BeforeClass
	public void waitForPage() {
		implicitWait();
		System.out.println("Implicit wait");
	}
	
	@BeforeMethod
	public void refreshPage() {
		pageRefresh();
		System.out.println("Page refreshed");
	}
	
	@Test
	public void searchForPage() {
		HomePage hp=new HomePage(driver);
		clickElement(hp.mobiles);
		System.out.println("search using sendkeys");
		System.out.println("click on search btn");
	}
	
	@Test
	public void selectForProduct() {
		ProductPage pp=new ProductPage(driver);
		clickElement(pp.apple);
		clickElement(pp.blueAppleMobile);
//		System.out.println(driver.getCurrentUrl());
//		System.out.println("Click on any product");
		switchWindow();
//		System.out.println(driver.getTitle());
//		clickElement(pp.electronic);
		clickElement(pp.addToCart);
//		driver.findElement(By.id("sellerProfileTriggerId")).click();
//		driver.findElement(By.id("buy-now-button")).click();
//		driver.findElement(By.id("add-to-cart-button")).click();
//		driver.findElement(By.name("submit.add-to-cart")).click();
		System.out.println("add the product to the cart");
		System.out.println("select the quantity");

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
		driver.manage().deleteAllCookies();
		System.out.println("Cookies deleted");
	}
	
	@AfterSuite
	public void closeBrowser() {
	//	driver.quit();
		System.out.println("Quit the browser");

	}
}
