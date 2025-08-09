package org.selenium.virtusa;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "loginCredentials")
    public Object[][] getLoginData() {
        return new Object[][]{
        	{"student","Password123"},
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"invalidUser", "wrongPass"}
        };
    }
}
