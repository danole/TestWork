package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final String marketBtn = "//a[@data-id='market']";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goToSectionMarket() {
        driver.findElement(By.xpath(marketBtn)).click();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

}
