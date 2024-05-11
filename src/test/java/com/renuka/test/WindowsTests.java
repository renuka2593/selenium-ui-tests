package com.renuka.test;

import com.renuka.selenium.ElementFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTest {

    @Test
    public void windowHandleTests() throws InterruptedException {
        try {
            driver.get("https://the-internet.herokuapp.com/windows");
            // //*[@id="content"]/div/a
            WebElement element = ElementFinder.getElement(driver,
                    By.xpath("//div[@id='content']/div/a"));
            element.click();

            String currentWindow = driver.getWindowHandle();
            for (String window : driver.getWindowHandles()) {
                if (!currentWindow.equals(window)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            Thread.sleep(5000);
            WebElement ele = ElementFinder.getElement(driver, By.xpath("//div[@class='example']/h3"));
            String Actual = ele.getText();
            Assert.assertEquals(Actual, "New Window");
            driver.close();
            driver.switchTo().window(currentWindow);
            driver.navigate().refresh();
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}

