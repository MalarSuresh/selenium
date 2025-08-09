package org.selenium.virtusa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 {
	static Select sdd;
	
	
	public static void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
		driver.manage().window().maximize();
		WebElement registerLink=driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		
		Thread.sleep(3000);
		
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
	
	public static void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/login.php");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("Malar");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("1234");
		driver.findElement(By.name("submit")).click();
	}

		public static void main(String[] args) throws InterruptedException {
			 register();
			 login();
			 
		}
	}


