package com.WebDrMgr;

//Navinkumar sent this baseclass
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Baseclass {
	public WebDriver driver;
	public Actions a;

	public void browserLaunch(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public boolean elementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void inputToElement(WebElement element, String input) {
		element.sendKeys(input);
	}

	public void screenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Avadi\\workspace\\P026_Maven\\screenshots\\" + fileName + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void scrollUsingJSE(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scollBy(" + x + "," + y + ")");
	}

	public void inputUsingJS(String id_value, String text_value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + id_value + "').value = '" + text_value + "'");
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);

		if (option.equals("value")) {
			s.selectByValue(value);
		} else if (option.equals("text")) {
			s.selectByVisibleText(value);
		} else if (option.equals("index")) {
			int index = Integer.parseInt(value); // "3" --> 3
			s.selectByIndex(index);
		}

	}

	public void switchFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchFrameUsingIdOrName(String NameOrId) {
		driver.switchTo().frame(NameOrId);
	}

	public void switchFrameUsingWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void rightClickUsingMouse(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	public void mouseHover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
		
	}

	public void dragAndDrop(WebElement src, WebElement dest) {
		a = new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	
	
	public void switchWindow() {
		String parent_tab_id = driver.getWindowHandle();

		Set<String> all_tab_id = driver.getWindowHandles();

		for (String child_id : all_tab_id) {
			if (!child_id.equals(parent_tab_id)) {
				driver.switchTo().window(child_id);
			}
		}
	}

	public void switchWindowUsingIndex(int index) {
//		String parent_tab_id = driver.getWindowHandle();

		Set<String> all_tab_id = driver.getWindowHandles();
		
		List<String> all_id_list = new ArrayList<>(all_tab_id);
		
		driver.switchTo().window(all_id_list.get(index));
		
	}
	
	public void switchWindowUsingTitle(String title) {
		
		Set<String> all_tab_id = driver.getWindowHandles();

		for (String child_id : all_tab_id) {
			driver.switchTo().window(child_id);
			if(title.equals(driver.getTitle())) {
				break;
			}
		}
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
}
