package com.renuka.test;

import com.renuka.selenium.ElementFinder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTest {
    @Test
    public void handleAlerts() {
        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            WebElement element = ElementFinder.getElement(driver, By.xpath("//button[@onclick='jsAlert()']"));
            element.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement result = ElementFinder.getElement(driver, By.id("result"));
            String Actual = result.getText();
            Assert.assertEquals(Actual, "You successfully clicked an alert");
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
