package com.renuka.test;

import com.renuka.selenium.ElementFinder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDownTests extends BaseTest {
    @Test
    public void selectByValueTest() {
        try {
            driver.get("https://the-internet.herokuapp.com/dropdown");

            WebElement dropdown = ElementFinder.getElement(driver, By.id("dropdown"));
            Select select = new Select(dropdown);
            select.selectByValue("1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void selectByVisibleText() {
        try {
            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Option 1");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
