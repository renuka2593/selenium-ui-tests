package com.renuka.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void testInitialization() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void testCleanUp() {
        driver.quit();
        driver.quit();
    }
}

