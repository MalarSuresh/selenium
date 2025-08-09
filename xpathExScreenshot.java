package com.SampleTesting;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExScreenshot {
	static TakesScreenshot ts;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailId=driver.findElement(By.xpath("//input[@id='email']"));
		emailId.sendKeys("myUsername@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy ')]"));
		password.sendKeys("malar");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));
		
		ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//screenshot1.png");
		FileUtils.copyFile(source, destination);

		
		loginButton.click();
		System.out.println("Login button clicked successfully");
		Thread.sleep(5000);

		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C://Users//malar//eclipse-workspace//SeleniumTesting//Screenshot//screenshot2.png");
		FileUtils.copyFile(source1, destination1);
		
		
		driver.get("https://www.google.com");
		WebElement tamilLang=driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		tamilLang.click();
		WebElement englishLang=driver.findElement(By.xpath("//a[contains(text(),'English')]"));
		englishLang.click();
		WebElement XpathFifth=driver.findElement(By.xpath("//div[contains(@class,'o3j99')])[2])"));
		System.out.println(XpathFifth);
		
		driver.close();

	}
}
