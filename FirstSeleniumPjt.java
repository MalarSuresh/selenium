package org.selenium.virtusa;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSeleniumPjt  {
	public static void main(String[] args) {
		System.out.println("Selenium starts here");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malar\\eclipse-workspace\\eclipse-workspaceNew\\SeleniumVirtusa\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	
		String datestamp=new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(datestamp);
		
	}
}
