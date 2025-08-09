package iptTrialClass3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	static WebDriver driver;
	static Integer min;
	static List<Integer> list = new ArrayList<>();
	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
//		Options options = driver.manage();
//		Window window = options.window();
//		window.maximize();						// return type is void
		driver.manage().window().maximize();	//function chaining
		driver.get("https://www.myntra.com/men-sports-shoes");
		
	}

	private static void getAllDiscountPrice() {
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[text()='Brand']//following::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String pri = price.getText();
			String replaceAll = pri.replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(replaceAll);
			list.add(parseInt);
		}
		
		System.out.println(list);
	
		
	}
	private static void getMinPrice() {
		 min = Collections.min(list);
		System.out.println(min);
	}
	
	private static void minProductName() {
		String minPriceBrand = driver.findElement(By.xpath("//li[@class=\"product-base\"]//following::span[text()="+min+"]//ancestor::div[@class='product-productMetaInfo']")).getText();
		System.out.println(minPriceBrand);
	}

 
	public static void main(String[] args) {
		browserLaunch();
		getAllDiscountPrice();
		getMinPrice();
		minProductName();
		
	}
}
