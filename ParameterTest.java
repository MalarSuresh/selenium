package com.Amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Parameters({"username","password"})
	@Test
	public void login(String user,String pass) {
		System.out.println("Username is "+user);
		System.out.println("Password is "+pass);
		System.out.println("Logged in scuccessfully");
	}
	@Test(dataProvider="provideData")
	public void loginUsingDP(String user,Object pass) {
		System.out.println("Username is "+user);
		System.out.println("Password is "+pass);
		System.out.println("Logged in scuccessfully");
	}
	
	@DataProvider
	public Object[][] provideData() {
		
		Object[][] credentials= new Object[][]{{"malar","123"},{"Suresh","987"},{"Huvi","567"}};
		return credentials;
	
	}
	
}
