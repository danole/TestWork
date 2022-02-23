package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementHeaderSearch extends BasePage {

    private final String headerSearch = "//input[@id='header-search']";
    private final String findBtn = "//button[@data-r='search-button']";

    public ElementHeaderSearch(WebDriver driver) {
        super(driver);
    }

    public void sendKeysSearch(String keys) {
        driver.findElement(By.xpath(headerSearch)).sendKeys(keys);
    }

    public void clickFind() {
        driver.findElement(By.xpath(findBtn)).click();
    }

}
