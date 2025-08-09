package com.SampleTesting;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseNKeyboardActions {
	static WebDriver driver;
	static Actions ac;

	public static void mouseActions() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();

		driver.manage().window().maximize();
		WebElement locationTab = driver.findElement(By.id("nav-logo-sprites"));
		ac=new Actions(driver);
		ac.click(locationTab).build().perform();

		WebElement returns = driver.findElement(By.id("nav-orders"));
		ac.moveToElement(returns).build().perform();
//		Thread.sleep(2000);		
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
//		Thread.sleep(2000);
		System.out.println("All 5 mouseActions done!!!");
	}
	public static void keyboardActions() throws Throwable {
		driver.navigate().back();
		Robot r=new Robot();		
		WebElement dropHere = driver.findElement(By.id("twotabsearchtextbox"));
		dropHere.click();
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		dropHere.click();
//		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		System.out.println("Keyboard actions are also done");
	}	
	private static void MouseNKeyboardTogether() throws Throwable {
		driver.navigate().refresh();
		ac=new Actions(driver);
		WebElement rightClick=driver.findElement(By.xpath("//img[@alt='Amazon App']"));
		ac.contextClick(rightClick).build().perform();
//		WebElement rightClick=driver.findElement(By.xpath("//a[text()='New Releases']"));
//		ac.contextClick(rightClick).build().perform();				
//		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);

		driver.close();

	}
	public static void main(String[] args) throws Throwable {
		mouseActions();
		keyboardActions();
		MouseNKeyboardTogether();
	}

}
