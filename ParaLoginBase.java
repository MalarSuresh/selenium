package org.selenium.virtusa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ParaLoginBase extends TestBase {

	WebDriver driver;

  public ParaLoginBase(WebDriver rdriver) {
	  System.out.println("ParaLoginBase Hi");
		this.driver=rdriver;
		PageFactory.initElements(rdriver,this);	
		driver.findElement(By.name("username")).sendKeys("test");
		  driver.findElement(By.name("password")).sendKeys("test");
		  driver.findElement(By.xpath("//input[@value='Log In']")).click();
		  System.out.println("Working");
		}

  @Test
  public void f() {
//	  login.getUsername().sendKeys("testuser");
	  
//	  driver.findElement(By.name("username")).sendKeys("test");
//	  driver.findElement(By.name("password")).sendKeys("test");
//	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		 System.out.println("Working");

  
  }
  
}
