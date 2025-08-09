package org.selenium.virtusa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestBase {
	WebDriver driver;
	@Parameters({"Browser","URL"})
	@Test
	public void setup(@Optional String Browser,@Optional String URL) throws Exception{
		System.out.println("Browser from XML "+Browser);
		if(Browser==null) {
			System.out.println("Default Browser");
			Browser="Chrome";
			System.out.println("Defaulting  browser to : "+Browser);
			URL="https://parabank.parasoft.com/parabank/index.htm";
		}
		   if (Browser.equalsIgnoreCase("chrome")) {
	              // Set path to ChromeDriver executable
	              System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe"); 
	              driver = new ChromeDriver();
	      		driver.manage().window().maximize();
	    		driver.get(URL);

	          }
		   else if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\.exe");
			driver=new EdgeDriver();
		}
			LoginPage login=new LoginPage(driver);
			ParaLoginBase paraLgnBase=new ParaLoginBase(driver);
		paraLgnBase.f();
		System.out.println("Success");
	}
	

	
	
}
