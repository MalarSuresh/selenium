package iptTrialClass3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathEx {
	static WebDriver driver;
	static Integer min;
	static List<Integer> list = new ArrayList<>();
	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/men-tshirts");
		
	}
	private static void getAllDiscountPrice() {
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[text()='Categories']//following::span[@class='product-discountedPrice']"));
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
		WebElement minPriceBrandDetails=driver.findElement(By.xpath("//li[@class=\"product-base\"]//following::span[text()="+min+"]//preceding::div[@class=\"product-productMetaInfo\"]"));
		String minPriceBrandDetail = minPriceBrandDetails.getText();
		System.out.println(minPriceBrandDetail);

	}
	public static void main(String[] args) {
		browserLaunch();
		getAllDiscountPrice();
		getMinPrice();
		minProductName();
		
	}
}

