package com.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewProject {
//	static WebDriver driver;
//	static JavascriptExecutor js;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumProjects\\Drivers\\msedge.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		WebElement textBox=driver.findElement(By.id("name"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",textBox);
		textBox.sendKeys("Value");
		//WebElement frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame("frm1");
		WebElement menu1 = driver.findElement(By.id("selectnav2"));
		menu1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		WebElement menu2 = driver.findElement(By.id("selectnav2"));
		menu2.click();

	}

}
