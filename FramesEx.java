package org.selenium.virtusa;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FramesEx {

	public static void main(String[] args) throws Exception {
		System.out.println("Selenium starts here");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.io")).click();
//		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,10)	;	
		WebElement javaiolink=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("java.io")));
		javaiolink.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("File")).click();
//		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		String pagetitle=driver.findElement(By.xpath("//*[@class='title']")).getText();
		System.out.println("Page title is "+pagetitle);
		
		
		if(pagetitle.contains("Class")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		System.out.println("Before soft assertion");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(pagetitle, "Class File");
		System.out.println("After soft assertion");
		System.out.println("Before soft boolean assertion");
		sa.assertEquals(false,true, "---boolean----");
		System.out.println("After soft boolean assertion");
		System.out.println("Before soft assert all");
		sa.assertAll();
		System.out.println("After soft assert all");
		
		
//		System.out.println("Before hard assertion");
//		Assert.assertEquals(pagetitle, "Class File");

//		System.out.println("Before hard assertion");

	}

}
