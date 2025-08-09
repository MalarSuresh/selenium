package org.selenium.virtusa;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class LoginTest {

	    @Test(dataProvider = "loginCredentials", dataProviderClass = LoginData.class)
	    public void testLogin(String username, String password) {
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your ChromeDriver path
			System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");

	    	WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
//	        driver.get("https://www.example.com/login"); // Replace with the login page URL
	        driver.get("https://practicetestautomation.com/practice-test-login/"); // Replace with the login page URL

	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
//	        driver.findElement(By.id("loginButton")).click();
	        driver.findElement(By.id("submit")).click();

	        // Add assertions to verify login success or failure based on expected outcome
//	        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed for " + username); 

	      driver.quit();
	    }
	}

