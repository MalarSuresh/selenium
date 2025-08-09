package org.selenium.virtusa;

import java.net.URI;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase1 {
	WebDriver driver;
	LoginPage login;		//	same as LoginPageObject
//	PropFileReader prop;
//	String propLoginKey="uname";
//	String propPasswordKey="pass";
//	String propetiesFilePath="";
	
	@Parameters({"Browser","URL"})
	@BeforeClass
	public void setup(@Optional String Browser,@Optional String URL) throws Exception{
//		URI uri=new URI("http://localhost:4444/");
//		DesiredCapabilities capability=new DesiredCapabilities();
		System.out.println("Browser from XML "+Browser);
		if(Browser==null) {
			System.out.println("Default Browser");
			Browser="Chrome";
			System.out.println("Defaulting  browser to : "+Browser);
			URL="https://demo.guru99.com/selenium/newtours/login.php";
		}
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");
//			capability.setBrowserName("chrome");
//			capability.setPlatform(Platform.WINDOWS);	
//			Remote driver
//			driver =new RemoteWebDriver(uri.toURL(),capability);
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
//			System.setProperty("webdriver.edge.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\.exe");
//			capability.setBrowserName("chrome");
//			capability.setPlatform("MicrosoftEdge");	
//			Remote driver
//			driver =new RemoteWebDriver(uri.toURL(),capability);
//			driver=new EdgeDriver();
		}
		login=new LoginPage(driver);
//		String propertiesFilePath="testData//config.properties";
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	public void tearDown()throws InterruptedException{
	//	driver.close();
		sleep(3);
	//	driver.quit();
	}
	
	public static void sleep(int seconds) throws InterruptedException{
		Thread.sleep(seconds*1000);
	}
	public static void waitandclose(WebDriver driver,int seconds) {
//		TestNGBase.sleep(seconds);
	//	driver.close();
	}
	
	
}
