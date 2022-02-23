package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketPage extends BasePage {

    private final String catalogBtn = "//button[@id='catalogPopupButton']";
    private final String computersBtn = "//ul[@class='_2OFlF']/*[4]/*[1]";

    public MarketPage(WebDriver driver) {
        super(driver);
    }

    public void goToSectionComputers() {
        driver.findElement(By.xpath(catalogBtn)).click();
        driver.findElement(By.xpath(computersBtn)).click();
    }


}
