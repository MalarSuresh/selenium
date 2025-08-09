package com.SampleTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserLaunch2 {
//	> WebDriverManager.firefoxdriver.setup()
//	> WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("Browser launched successfully");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().back();
		driver.quit();
	}

}
