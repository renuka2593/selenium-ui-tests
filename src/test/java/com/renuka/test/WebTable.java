package com.renuka.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable extends BaseTest {

    @Test
    public void webTableAccess() {
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        System.out.println(rows.size());
        for (WebElement currentRow : rows) {
            currentRow.findElements(By.xpath(".//td")).forEach(el -> {
                if (el.getText().contains("expected")) {
                    el.click();
                    //Heelo;
                }
            });
        }
    }
}
