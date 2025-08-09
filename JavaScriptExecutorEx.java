package com.SampleTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.meesho.com/");		
			WebElement kidsLunchBox = driver.findElement(By.xpath("//a[text()='Kids Lunch Boxes']"));	
			JavascriptExecutor js=(JavascriptExecutor) driver;	
			js.executeScript("arguments[0].scrollIntoView();",kidsLunchBox);
			Thread.sleep(2000);
			//	js.executeScript("arguments[0].click();", kidsLunchBox);

			js.executeScript("window.scroll(0,-1000)");
			WebElement searchBox=driver.findElement(By.xpath("(//input[@font-weight='book'])[1]"));

			js.executeScript("arguments[0].value='Kids lunch box';",searchBox);
			//js.executeScript("document.getElementByXpath('(//input[@font-weight='book'])[1]').value='sarees'");

			driver.get("https://www.yahoo.com/");
			js.executeScript("document.getElementById('ybar-sbq').value='mails'");
			System.out.println("Task completed");
	}
}
