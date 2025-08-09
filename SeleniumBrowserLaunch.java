package com.SampleTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class SeleniumBrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Browser launched successfully");
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/");
		System.out.println("Navigation successful");
		Thread.sleep(2000);
			driver.navigate().back();
		System.out.println("Browser went back successfully");
			driver.navigate().forward();
		System.out.println("Browser moved forward successfully");
			driver.navigate().refresh();
		String str=driver.getTitle();
		System.out.println("The title of current webpage is : "+str);
		String url=driver.getCurrentUrl();
		System.out.println("Current url is "+url);
			driver.close();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\msedgedriver.exe");
		WebDriver driverEdge=new EdgeDriver();
			driverEdge.get("https://www.amazon.in/");
		System.out.println(driverEdge.getTitle());
	}
}
