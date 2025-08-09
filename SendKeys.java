package com.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");

		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			signin.click();
		WebElement findEmail=driver.findElement(By.id("ap_email"));
			findEmail.sendKeys("malar@gmail.com");	
		WebElement clickButton = driver.findElement(By.id("continue"));
			clickButton.click();
		WebElement password=driver.findElement(By.id("ap_password"));
			password.sendKeys("malar");
		WebElement signinButton = driver.findElement(By.id("signInSubmit"));
			signinButton.click();
			driver.close();
		System.out.println("Signedin successfully");
		/*	We can use 2 get in same program	
		 *	 driver.get("https://www.google.com");
				driver.navigate().back();		*/
	}
}
