package org.selenium.virtusa;

import org.testng.annotations.Test;
//test-output/testng.xml
public class Groups {
	@Test(groups="smokeTest",priority=1,dependsOnMethods="homePage")
	public void loginPage() {
		System.out.println("ClassName= "+this.getClass().getName());
		System.out.println("LoginPage-smokeTest p=1");
	}
	@Test(groups="smokeTest",priority=2)
	public void homePage() {
		System.out.println("homepage smoke test p=2");
	}
	
	
	@Test(groups="regression1",priority=5)
	public void inboxPage() {
		System.out.println("inbox page-regression1,p=5");
//		assert(false);
//		System.out.println("Assert fails");
	}
	
	@Test(groups="regression1",priority=6)
	public void logout() {
		System.out.println("logout-regression1,p=6");
	}
	
	
	@Test(groups="regression2",priority=3,dependsOnGroups="smokeTest")
	public void sentItems() {
		System.out.println("sentItems-regression2,p=3");
	}	
	@Test(groups="regression2",priority=4)
	public void draft() {
		System.out.println("draft-regression2,p=4");
	}
	
}
