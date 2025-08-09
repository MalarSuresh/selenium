package org.selenium.virtusa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	public LoginPage(WebDriver rdriver) {
		System.out.println("Hi");
		this.driver=rdriver;
		PageFactory.initElements(rdriver,this);	
	}
	
	@FindBy(name="username")
	WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	@FindBy(name="password")
	WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginbutton;
	
	public WebElement getLoginButton() {
		return loginbutton;
	}
	
}
