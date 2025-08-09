package org.selenium.virtusa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment2TestNG {
    public WebDriver driver;
	static Select sdd;


  @BeforeSuite
  public void beforeSuite() {}
  @BeforeTest
  public void beforeTest() {}
  @BeforeClass
  public void setup() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
  }

  @Test(priority=1)
  public void register() throws InterruptedException {	   
/*	   if (driver!=null) {
		   System.out.println("hi");
	   }else {
		   System.out.println("Hurray");
	   }
*/	   
		WebElement registerLink=driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
	  	driver.findElement(By.name("firstName")).sendKeys("Malar");
		driver.findElement(By.name("lastName")).sendKeys("Suresh");
		driver.findElement(By.name("phone")).sendKeys("12345");
		driver.findElement(By.id("userName")).sendKeys("Malar@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("12,34th st");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("600060");
		WebElement country = driver.findElement(By.name("country"));
		sdd=new Select(country);
		sdd.selectByValue("INDIA");
		driver.findElement(By.id("email")).sendKeys("Malar");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");

		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000); 
  
  }
  
  
  @Test(priority=2)
  public void loginTest() throws InterruptedException {
	  
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("Malar");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
  }
@Test(priority=3)
  public void flight() throws InterruptedException {
		driver.findElement(By.linkText("Flights")).click();
		WebElement yesRadio = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
        yesRadio.click();
		WebElement passCount = driver.findElement(By.name("passCount"));
		sdd=new Select(passCount);
		sdd.selectByValue("2");
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		sdd=new Select(fromPort);
		sdd.selectByValue("Paris"); 
		
		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		sdd=new Select(fromMonth);
		sdd.selectByValue("3");  
		WebElement fromDay = driver.findElement(By.name("fromDay"));
		sdd=new Select(fromDay);
		sdd.selectByValue("3");  
		WebElement toPort = driver.findElement(By.name("toPort"));
		sdd=new Select(toPort);
		sdd.selectByValue("London");  
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		sdd=new Select(toMonth);
		sdd.selectByValue("4");  
		WebElement toDay = driver.findElement(By.name("toDay"));
		sdd=new Select(toDay);
		sdd.selectByValue("4");  

		yesRadio = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
        yesRadio.click();
		
        WebElement airline=driver.findElement(By.name("airline"));
        sdd=new Select(airline);
        sdd.selectByVisibleText("Blue Skies Airlines");
        Thread.sleep(3000);
        WebElement cont=driver.findElement(By.name("findFlights"));
        cont.click();

}
  
  
  
  @AfterClass
  public void afterClass() {
//	  if (driver != null) {
 //         driver.quit();
 //     }
  }


  @AfterTest
  public void afterTest() {}

  @AfterSuite
  public void afterSuite() {
  }
}
