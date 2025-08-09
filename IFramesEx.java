package com.SampleTesting;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesEx {
	static WebDriver driver;
	static TakesScreenshot ts;
	public static void singleFrame() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
//		already clicked
//		WebElement singleFrame=driver.findElement(By.xpath("//a[@href='#Single']"));
//		singleFrame.click();
		WebDriver frameInsideFrame = driver.switchTo().frame("singleframe");
		WebElement textArea = frameInsideFrame.findElement(By.xpath("(//input[@type='text'])[1]"));
		textArea.sendKeys("This is a text box");
		Thread.sleep(3000);
		System.out.println("Value has been sent to text box inside single frame");
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//singleFrame.png");
		FileUtils.copyFile(source, destination);
		driver.switchTo().defaultContent();
	}
	
	public static void multipleFrames() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();
		WebElement multiFrame=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multiFrame.click();
		WebElement multipleFrame1stLayer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multipleFrame1stLayer);
		WebElement multipleFrame2ndLayer = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(multipleFrame2ndLayer);
		WebElement textOfInnerFrame=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textOfInnerFrame.sendKeys("This is a frame inside a frame");
		Thread.sleep(3000);
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//multipleFrame.png");
		FileUtils.copyFile(source, destination);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent(); only one time to come out of all frames	
		System.out.println("Value has been sent to text box inside multiple frames");
	}
	public static void videoDropdown() throws Throwable {	
		WebElement videoElement = driver.findElement(By.xpath("//a[text()='Video']"));
		videoElement.click();
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//ElementOutsideFrame.png");
		FileUtils.copyFile(source, destination);
		System.out.println("The element outside the frame is clicked");
		Thread.sleep(2000);
		driver.close();
	}
	public static void main(String[] args) throws Throwable {
		singleFrame();
		multipleFrames();
		videoDropdown();
	}

}
