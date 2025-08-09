package org.selenium.virtusa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AssignmentMnyCtrl {
    public WebDriver driver;

  @Test
  public void  readTableData() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement table=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table"));
	  System.out.println("good");
		
	  List<WebElement> rows = table.findElements(By.tagName("tr"));
	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.tagName("td"));
	        for (WebElement cell : cells) {
	            String cellText = cell.getText(); 
	            System.out.println("Cell content: " + cellText);
	        }
	    }
	    System.out.println("Success");
	    
	    
	    
/*	  String getFullUrl=driver.getCurrentUrl();
	  System.out.println(getFullUrl);
//	  if(getFullUrl!="https://www.moneycontrol.com/") {
		if(getFullUrl=="https://www.moneycontrol.com/promo/mc_interstitial_dfp.php?size=1280x540") {

		  System.out.println("click money control");

		  WebElement mnyctrl=driver.findElement(By.linkText("moneycontrol.com"));
		  mnyctrl.click();
		  
	  }
//	  System.out.println("//*[@id="mc_mainWrapper"]/section/div/div[5]/div[2]/table");
	  WebElement table=driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/section/div/div[5]/div[2]/table"));
	  System.out.println("good");
		
	  List<WebElement> rows = table.findElements(By.tagName("tr"));
	    for (WebElement row : rows) {
	        List<WebElement> cells = row.findElements(By.tagName("td"));
	        for (WebElement cell : cells) {
	            String cellText = cell.getText(); 
	            System.out.println("Cell content: " + cellText);
	        }
	    }
	    
	    
	    Money control website is slow, we can get the table data using the below xpaths
	    
	    //a[contains(text(),'USDINR')]/parent::td/following-sibling::td[1]
		//a[contains(text(),'USDINR')]/ancestor::tr/child::td[2]
		//a[contains(text(),'USDINR')]/ancestor::tr/descendant::td[2]
 		//a[contains(text(),'USDINR')]/ancestor::tr/td[2]

	  */
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void setup() {
  	System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.moneycontrol.com/");
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
