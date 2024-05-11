package com.renuka.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void testInitialization() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("headless");
        driver = new ChromeDriver(option);
    }

    @AfterClass
    public void testCleanUp() {
        driver.quit();
    }
}

