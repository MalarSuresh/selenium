package com.SampleTesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	static Select sdd;
	static WebDriver driver;
	static JavascriptExecutor js;
	public static void singleDropDown() {
//		System.setProperty("webdriver.edge.driver", ".//Drivers//msedgedriver.exe");
//		driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		WebElement singleDD = driver.findElement(By.id("searchDropdownBox"));
		sdd=new Select(singleDD);
		//sdd.selectByIndex(4);
		sdd.selectByValue("search-alias=computers");
		sdd.selectByVisibleText("Gift Cards");
			System.out.println("Does this webelement has multiple options: "+sdd.isMultiple());
		//sdd.deselectAll();
		
		List<WebElement> allSelectedOptions = sdd.getAllSelectedOptions();
		for (WebElement wb:allSelectedOptions) {
			System.out.println("List of elements selected: "+wb.getText());
		}
			System.out.println("---------------------------------");
		driver.close();
		}	
	public static void multipleDropDown() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Drivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multipleDD = driver.findElement(By.id("cars"));
		sdd=new Select(multipleDD);
		Thread.sleep(2000);
		
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",multipleDD);
		Thread.sleep(2000);
	
		sdd.selectByVisibleText("Saab");
		sdd.selectByValue("opel");
		sdd.selectByIndex(0);


		Thread.sleep(2000);
		
			System.out.println("Does this webelement has multiple options: "+sdd.isMultiple());
		
		List<WebElement> options = sdd.getOptions();
			System.out.println("Size of the list of webelements is "+options.size());
			System.out.println("--------Values are:--------------");
		for (WebElement wb:options) {
			System.out.println(wb.getText());
		}
			System.out.println("-----------All the selected options are: ----------------------");
		List<WebElement> allSelectedOptions = sdd.getAllSelectedOptions();
		for (WebElement wb:allSelectedOptions) {
			System.out.println(wb.getText());
		}
			System.out.println("--------------------------------");
		WebElement firstSelectedOption = sdd.getFirstSelectedOption();
			System.out.println("First Selected Option: "+firstSelectedOption.getText());
//		sdd.deselectByIndex(1);
//		sdd.deselectByValue("opel");
//		sdd.deselectByVisibleText("Volvo");
		sdd.deselectAll();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		singleDropDown();
		//multipleDropDown();
	}
}
