package iptTrialClass4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {
	static String homePage="https://www.amazon.in/";
	static WebDriver driver;
	static String url;
	static HttpURLConnection huc;
	static int responseCode;
	static List<WebElement> links;
	
	private static void browserLaunch() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		option.addArguments("Start-maximized");

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		driver=new ChromeDriver(option);
		driver.get(homePage);
		connectionSetting();
	}
	
	private static void connectionSetting() {
		url="";
		huc=null;
		responseCode=200;
		findingLinks();
	}
	
	private static void findingLinks() {
		 links = driver.findElements(By.tagName("a"));
		 validateBrokenLinks();
	}
	private static void validateBrokenLinks() {
		Iterator<WebElement> iterator = links.iterator();
		while(iterator.hasNext()) {
			url=iterator.next().getAttribute("href");

			if(url==null||url.isEmpty()) {
				System.out.println("anchor tag is empty");
				continue;
			}
			if(!url.startsWith(homePage)) {
				System.out.println("url belongs to another domain ,skipping it");
				continue;
			}
			try {
			huc=(HttpURLConnection)(new URL(url)).openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			huc.getResponseCode();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			if(responseCode>=400) {
				System.out.println(url+"is a broken link");
			}
			else {
				System.out.println(url+"valid link");
			}
		}
	}
	
	public static void main(String[] args) {
		browserLaunch();
	}
	
}

