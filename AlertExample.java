package com.SampleTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	static WebDriver driver;
	static TakesScreenshot ts;
	public static void simpleAlert() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement simpleAlert = driver.findElement(By.xpath("//a[@href='#OKTab']"));
		simpleAlert.click();
		WebElement simpleAlertOk= driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]"));
		simpleAlertOk.click();
		Alert sa = driver.switchTo().alert();
		String simpleAlertText = sa.getText();
		Thread.sleep(2000);
		sa.accept();
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//simpleAlert.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		System.out.println("Simple Alert clicked: "+simpleAlertText);		
	}
	public static void confirmAlert() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement confirmAlert = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		confirmAlert.click();
		WebElement confirmAlertOk= driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]"));
		confirmAlertOk.click();
		Alert ca= driver.switchTo().alert();
		String confirmAlertString = ca.getText();
		Thread.sleep(2000);
		ca.accept();
//		ca.dismiss();
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//confirmAlert.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		System.out.println("confirm Alert clicked: "+confirmAlertString);		
		}
	public static void promptAlert() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement promptAlert = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		promptAlert.click();
		WebElement confirmAlertOk= driver.findElement(By.xpath("//button[contains(@class,'btn-info')]"));
		confirmAlertOk.click();
		Alert pa = driver.switchTo().alert();
		String promptAlertText = pa.getText();
		pa.sendKeys("Malar !!!");
		pa.accept();
//		pa.dismiss();
		ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Screenshot\\PromptAlert.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		System.out.println("Prompt alert clicked: "+promptAlertText);
	}
	
	public static void main(String[] args) throws Throwable {
		simpleAlert();
		confirmAlert();
		promptAlert();
	}
}
