package org.selenium.virtusa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AssignmentFrames {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    }

    @BeforeTest
    public void beforeTest() {
    }
    @BeforeClass
    public void setup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
    }

    @BeforeMethod
    public void beforeMethod() {  }  
  @Test
  public void f() {

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.applet")).click();
//		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,10)	;	
		WebElement javaappletlink=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("java.applet")));
		javaappletlink.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AppletContext")).click();
//		Thread.sleep(5000);
		driver.switchTo().defaultContent();
  }


  @AfterMethod
  public void afterMethod() {
  }


  @AfterClass
  public void afterClass() {
  }


  @AfterTest
  public void afterTest() {
  }


  @AfterSuite
  public void afterSuite() {
  }

}
