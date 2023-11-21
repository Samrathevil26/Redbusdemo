package com.RedBus.Test.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 protected WebDriver driver;

	    @BeforeMethod
	    @Parameters("environment")
	    public void setUp(String environment) {
	        System.out.println("Setting up environment: " + environment);

	        // Add logic to configure WebDriver based on the environment
	        if (environment.equalsIgnoreCase("qa")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (environment.equalsIgnoreCase("prod")) {
	            WebDriverManager.edgedriver().setup();;
	        }

	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
