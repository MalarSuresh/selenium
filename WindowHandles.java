package com.SampleTesting;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {
	static WebDriver driver;
	static Actions ac;
	static Robot r;
	public static void main(String[] args) throws Throwable {
//		WindowHandles wh=new WindowHandles();
//		wh.switchWindow1();
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		ac=new Actions(driver);
		r=new Robot();
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		ac.contextClick(sell).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement deals = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		ac.contextClick(deals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ac.contextClick(electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		Set<String> allWindowsUrl = driver.getWindowHandles();
		
		for (String windowsUrl: allWindowsUrl) {
//			System.out.println(windowsUrl);
//			String s=driver.switchTo().window(windowsUrl).getCurrentUrl();
//			System.out.println(s);
			String elecUrl="https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics";
			if(driver.switchTo().window(windowsUrl).getCurrentUrl().equals(elecUrl)) {
				WebElement HomeAudio = driver.findElement(By.xpath("(//span[text()='Home Audio'])[1]"));
				HomeAudio.click();
				System.out.println("Hurray i moved to Electronics tab");
				break;
			}	
		}	
	}
}
//	public void switchWindow() {
//		String parent_tab_id = driver.getWindowHandle();
//
//		Set<String> all_tab_id = driver.getWindowHandles();
//
//		for (String child_id : all_tab_id) {
//			if (!child_id.equals(parent_tab_id)) {
//				driver.switchTo().window(child_id);
//			}
//		}
//	}
//	public void switchWindow1() {
//		String parent_tab_id = "Hi";
//
//		Set<String> all_tab_id = new HashSet<String>();
//		all_tab_id.add("hello");
//		all_tab_id.add("world");
//		all_tab_id.add("malar");
//		
//
//		for (String child_id : all_tab_id) {
//			if (!child_id.equals(parent_tab_id)) {
//				System.out.println("onnum purila");
//			}
//		}
//	}
