package iptTrialClass4;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotEx {
	static WebDriver driver;
	public static void FullScreenshot() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/men-tshirts");
//		String dest=new File("C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Screenshot\\"+name+".png");
		Screenshot capture=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);
		ImageIO.write(capture.getImage(),"png",new File("C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Screenshot\\FullScreenshot.png"));
				
	}
	public static void FullScreenshot(String name) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		File dest=new File("C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Screenshot\\"+name+".png");
		Screenshot capture=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
//		ImageIO.write(capture.getImage(),"png",new File("C:\\Users\\malar\\eclipse-workspace\\SeleniumTesting\\Screenshot\\"+name+".png"));
		ImageIO.write(capture.getImage(),"png",dest);
				
	}
	public static void main(String[] args) throws Exception {
//		FullScreenshot();
//		FullScreenshot("fullSS");
		FullScreenshot("fullScreen1");

	}
}
