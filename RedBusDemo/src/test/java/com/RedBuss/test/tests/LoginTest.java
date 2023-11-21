package com.RedBuss.test.tests;

import org.testng.annotations.Test;

import com.RedBus.Test.Base.BaseTest;
import com.RedBuss.test.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
    public void testLogin() {
        driver.get("https://www.redbus.in");
        
        // Perform login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9793477123", "Gaurav27");

        // Add assertions or verifications as needed
    }

}
