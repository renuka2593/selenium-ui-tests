package com.renuka.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementFinder {

    public static WebElement getElement(WebDriver driver, By elementLocator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            // return wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            // condition based wait
            wait.ignoring(NoSuchElementException.class);
            return wait.until(d -> {
                WebElement element = d.findElement(elementLocator);
                if (element.isDisplayed() && element.isEnabled()) {
                    return element;
                }
                throw new NoSuchElementException("WebElement with locator " + elementLocator + " is not Found.");
            });
        } catch (Exception e) {
            System.out.println("Could not found element due to " + e.getMessage());
            throw e;
        }
    }
}



