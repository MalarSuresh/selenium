package com.SampleTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Waitexample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("https://www.google.com");
	driver.get("https://www.amazon.in");
	driver.navigate().refresh();

	driver.manage().window().maximize();
	WebElement locationTab = driver.findElement(By.id("nav-logo-sprites"));
	Actions ac=new Actions(driver);
	ac.click(locationTab).build().perform();

	WebElement returns = driver.findElement(By.id("nav-orders"));
	ac.moveToElement(returns).build().perform();
	WebElement location = driver.findElement(By.id("nav-global-location-popover-link"));
	ac.moveToElement(location).build().perform();
	WebElement dragThis = driver.findElement(By.xpath("//a[contains(text(),' Deals')]"));
	WebElement dropHere = driver.findElement(By.id("twotabsearchtextbox"));
	ac.dragAndDrop(dragThis, dropHere).build().perform();
	driver.navigate().to("https://demoqa.com/buttons");
	WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
	ac.contextClick(rightClick).build().perform();
	WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
	ac.doubleClick(doubleClick).build().perform();
	System.out.println("All 5 mouseActions done!!!");
}
}
