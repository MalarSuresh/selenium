package com.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.yahoo.com/");
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl+(driver.getTitle()));
			WebElement findSearchbox = driver.findElement(By.id("ybar-sbq"));
			System.out.println(findSearchbox.isDisplayed());
			System.out.println(findSearchbox.isEnabled());
			System.out.println(findSearchbox.isSelected());

			
	}

}
