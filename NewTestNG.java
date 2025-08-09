package org.selenium.virtusa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

// testNG with priority and enabled
public class NewTestNG {
  @Test(priority=3,enabled=false)
  public void f() {
	  System.out.println("actual Method");

  }
  @Test(priority=3)
  public void f1() {
	  System.out.println("f1 Method");

  }  
  
  @Test(priority=2)
  public void f2() {
	  System.out.println("f2 Method");

  }  
  
  @Test
  public void f3() {
	  System.out.println("f3 Method");

  }
   
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");

  }

}
