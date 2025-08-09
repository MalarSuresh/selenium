package com.SampleTesting;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement value = driver.findElement(By.xpath("//table//tr[6]//td[2]"));
		System.out.println("The value in [6][2] is "+value.getText());
		List<WebElement> valueOfEntireRow = driver.findElements(By.xpath("//table//tr[7]"));
		System.out.println("The values of 7th row are ");
		for(WebElement wb:valueOfEntireRow) {
			System.out.print(wb.getText());
		}
		driver.close();
	}
}
