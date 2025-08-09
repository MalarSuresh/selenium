package testCopilot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCopilotEx {
	int a = 10;
	int b = 20;
	int c = 30;
	//method to get sum of 3 numbers and save it in a variable
	//this method returns the sum of three integers
	//it takes three integers as parameters and returns their sum
	public static int getSum(int a, int b, int c) {
		return a + b + c;
	}
	//method to get biggest of 3 numbers
	public static int getBiggest(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}
	//method to get smallest of 3 numbers
	public static int getSmallest(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
	//run the methods	
	public static void runMethods() {
		int sum = getSum(10, 20, 30);
		System.out.println("Sum: " + sum);
		
		int biggest = getBiggest(10, 20, 30);
		System.out.println("Biggest: " + biggest);
		
		int smallest = getSmallest(10, 20, 30);
		System.out.println("Smallest: " + smallest);
	}
	

	public static void main(String[] args) {
		runMethods();
		System.out.println("Selenium 4.0 so no setProperty needed");
		
	//broswer launch	
		String browser = "chrome"; // can be "chrome", "firefox", or "edge"
		WebDriver driver;
		driver=new ChromeDriver();
		
	if(browser.equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver","path/to/chromedriver");
		driver = new ChromeDriver();
	} else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","path/to/geckodriver");
		driver = new FirefoxDriver();
	} else if(browser.equals("edge")) {
		System.setProperty("webdriver.edge.driver","path/to/edgedriver");
		driver = new EdgeDriver();
	} else {
		System.out.println("Unsupported browser!");
		return;
	}

	//maximize
	driver.manage().window().maximize();
	//navigate to a website
	driver.get("https://www.amazon.com");
	//check if browser launch is done
	driver.getTitle();
	driver.getCurrentUrl();
	driver.getPageSource();
	driver.manage().window().getSize();
	driver.manage().window().getPosition();
	//close the browser
			if (driver != null) {
		driver.quit();
		System.out.println("Browser closed successfully.");
	} else {
		System.out.println("No browser to close.");		
	}	
}

	
}
