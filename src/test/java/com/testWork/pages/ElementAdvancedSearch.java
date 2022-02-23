package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementAdvancedSearch extends BasePage {

    private final String firstPriceField = "//h4[contains(text(),'Цена')]/../../*/*/*[1]/*[1]";
    private final String secondPriceField = "//h4[contains(text(),'Цена')]/../../*/*/*[2]/*[1]";
    private final String applyBtn = "//div[@class='_1Mk5a']/*[2]";


    public ElementAdvancedSearch(WebDriver driver) {
        super(driver);
    }

    public void setPrice(String leftPriceField, String rightPriceField) {
        driver.findElement(By.xpath(firstPriceField)).sendKeys(leftPriceField);
        driver.findElement(By.xpath(secondPriceField)).sendKeys(rightPriceField);
    }

    public void setMaker(String makerField) {
        driver.findElement(By.xpath("//div[contains(text(),'" + makerField + "') and @class='_1WMsA _1VtMI _176_6']")).click();
    }

    public void clickApply() {
        driver.findElement(By.xpath(applyBtn)).click();
    }


}
