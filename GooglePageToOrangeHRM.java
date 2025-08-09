package com.MiniProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglePageToOrangeHRM {
	static WebDriver driver;
	static Robot robot;
	static Actions actions;
	static TakesScreenshot ts;
	public static void googleHomePage() throws Throwable {
		
//driver launch and open google website and move to next method		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chrome_proxy.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		googleSearch();
		
	}
	public static void googleSearch() throws Throwable {
		
/*search for hrmorange and click on that website,give credentials and login
Click on admin tab and open in new tab		*/
		robot=new Robot();
		actions=new Actions(driver);
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("hrmorange");
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement OrangeHRMClick = driver.findElement(By.xpath("(//span[text()='OrangeHRM'])[3]"));
		OrangeHRMClick.click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login_btn = driver.findElement(By.xpath(" //button[@type='submit']"));
		login_btn.click();
		WebElement admin_btn = driver.findElement(By.xpath("//span[text()='Admin']"));
		actions.contextClick(admin_btn).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	public static void searchUser() throws Throwable {
	
//go to admin tab and give values and search for a particular record.
//once found that record, select it and click edit
		String adminTab="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";

		Set<String> allTabs = driver.getWindowHandles();
		for(String tabUrl:allTabs){
			String currentUrl = driver.switchTo().window(tabUrl).getCurrentUrl();
				if(currentUrl.equals(adminTab)) {
//					System.out.println("Hurray!!!");
					WebElement usernameBox = driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[2]"));
					usernameBox.click();
					usernameBox.sendKeys("admin12");			
				}
		}
		WebElement select= driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		actions.moveToElement(select).build().perform();
		select.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement empName1= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		actions.moveToElement(empName1).build().perform();
		empName1.click();
		empName1.sendKeys("Orange  Test");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement selectStatus= driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		actions.moveToElement(selectStatus).build().perform();
		selectStatus.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement searchBtn = driver.findElement(By.xpath(" //button[text()=' Search '] "));
		searchBtn.click();
		
		Thread.sleep(3000);
		WebElement checkBox= driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]"));
		actions.moveToElement(checkBox).build().perform();

		if(!checkBox.isSelected()) {
		System.out.println("CheckBox status ");
		checkBox.click();
		}
		WebElement editBtn= driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]"));
		actions.moveToElement(editBtn).build().perform();
		editBtn.click();
	}
	public static void editUser() throws Throwable {
//edit the value and save the record		
		WebElement changeUsername= driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		String usernameValue= changeUsername.getText();
		System.out.println("usernameValue : "+usernameValue);
//		changeUsername.clear();
//		usernameValue.replace(usernameValue, "NewUser");
//		actions.click(changeUsername).build().perform();
		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);

//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		changeUsername.sendKeys("NewUser");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		Thread.sleep(2000);
		ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\malar\\eclipse-workspace\\com.MiniProject\\Screenshot\\edited_page.png");
		FileUtils.copyFile(source, Dest);
		
		
		System.out.println("All done!!!");
			}
	
}