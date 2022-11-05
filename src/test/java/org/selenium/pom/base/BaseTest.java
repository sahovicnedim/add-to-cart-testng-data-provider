package org.selenium.pom.base;


import org.junit.jupiter.api.AfterEach;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;

import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected WebDriver driver;




    @BeforeMethod
    public void startDriver() {
        String browser ="CHROME";
        driver = new DriverManager().initializeDriver(browser);
    }



    @AfterEach
    public void quitDriver() {
        driver.quit();
    }

}
