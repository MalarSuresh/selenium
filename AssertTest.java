package com.Amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertTest extends BaseclassNew {

	public void hardAssert() {
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com");
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		implicitWait();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sign Up']")).isDisplayed());
		System.out.println(driver.getTitle());
		driver.quit();


	}
	public void softAssert() {
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com");
		SoftAssert s=new SoftAssert();
//		s.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
//		runs even if the value given s partially correct		
		s.assertEquals(driver.getTitle(), "Amazon");
		clickElement(driver.findElement(By.xpath("//a[text()='Create new account']")));
		implicitWait();
		s.assertTrue(driver.findElement(By.xpath("//div[text()='Sign Up']")).isDisplayed());
		System.out.println(driver.getTitle());
		s.assertAll();
		driver.quit();
		/*
		Facebook � log in or sign up
		Exception in thread "main" java.lang.AssertionError: The following asserts failed:
		expected [Amazon] but found [Facebook � log in or sign up]
		 */
	}
	
	public static void main(String[] args) {
		AssertTest a=new AssertTest();
	//	a.hardAssert();
		a.softAssert();
	}
}
