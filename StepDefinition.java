package com.cucumberPJT.stepDefinition;

import com.cucumberPJT.BaseClass;
import com.cucumberPJT.pom.HomePage;
import com.cucumberPJT.pom.LoginPage;
import com.cucumberPJT.pom.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	@Given("I am able to view the homePage")
	public void i_am_able_to_view_the_home_page() {
		browserLaunch("chrome");
		launchUrl("https://www.amazon.in");
		pageRefresh();
	}
	@Given("I am able to view loginPage")
	public void i_am_able_to_view_login_page() {
	  HomePage home=new HomePage(driver);
	  clickElement(home.signInBtn);
	}
	@When("I enter the username {string}")
	public void i_enter_the_username(String emailValue) {
		LoginPage lp=new LoginPage(driver);
		if(lp.elementDisplayed(lp.checkLoginPage)) {
		inputToElement(lp.email, emailValue);
//		System.out.println("Value Entered "+emailValue);
		}
	}
	@When("I click continue button")
	public void i_click_continue_button() {
		LoginPage lp=new LoginPage(driver);
		clickElement(lp.continueBtn);
	}
	@When("I enter the password {string}")
	public void i_enter_the_password(String passwordValue) {
		LoginPage lp=new LoginPage(driver);
		if(lp.elementDisplayed(lp.signInBtn)) {
			inputToElement(lp.password,passwordValue);
		}else {
			driver.navigate().back();
		}
	}
	@When("I click login button")
	public void i_click_login_button() {
		LoginPage lp=new LoginPage(driver);
		clickElement(lp.signInBtn);
		System.out.println("lp "+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	@Then("I able to view user homepage {string}")
	public void i_able_to_view_user_homepage(String name) {
		ProductPage pp=new ProductPage(driver);
//		Assert.assertEquals(pp.profileName,name);		
//		System.out.println(name);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(elementDisplayed(pp.profileName))
			System.out.println("hurray "+name);
		}

	
	@When("I able to enter {string} in search box")
	public void i_able_to_enter_in_search_box(String string) {
		ProductPage pp=new ProductPage(driver);
		
		System.out.println("pp "+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	
	@When("I click on search button")
	public void i_click_on_search_button() {
//		ProductPage pp=new ProductPage(driver);
//		clickElement(pp.searchBtn);
	}
	@Then("I able to view the samsung result page  {string}")
	public void i_able_to_view_the_samsung_result_page(String string) {

	}

	@Then("I able to view samsung related products")
	public void i_able_to_view_samsung_related_products() {
	}
	
	@When("I able to view the samsung result page")
	public void i_able_to_view_the_samsung_result_page() {

	}

	@Then("select the mobile with maximum amount")
	public void select_the_mobile_with_maximum_amount() {

	}
	@Then("select the quantity")
	public void select_the_quantity() {
    }
	@Then("add to cart")
	public void add_to_cart() {

	}
	
}
