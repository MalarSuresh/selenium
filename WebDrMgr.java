package com.WebDrMgr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrMgr {
	public static void main(String[] args) throws InterruptedException {
	
// Using webdriver manager instead of system.setProperty by downloading webdrivermanager 5.6.4 jar		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Success");
	}
}
