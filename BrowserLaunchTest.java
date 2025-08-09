package org.selenium.virtusa;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class BrowserLaunchTest {

      WebDriver driver;

      @Parameters("browser") // Annotation to receive the "browser" parameter
      @Test
      public void launchBrowser(String browserName) {
          if (browserName.equalsIgnoreCase("chrome")) {
              // Set path to ChromeDriver executable
              System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe"); 
              driver = new ChromeDriver();
          } else if (browserName.equalsIgnoreCase("firefox")) {
              // Set path to GeckoDriver executable
              System.setProperty("webdriver.gecko.driver", "path/to/geckodriver"); 
              driver = new FirefoxDriver();
          } else {
              throw new IllegalArgumentException("Invalid browser name: " + browserName);
          }

          driver.manage().window().maximize();
          driver.get("https://www.example.com"); // Navigate to a URL
          // Perform further test actions
//          driver.quit(); // Close the browser
      }
  }

