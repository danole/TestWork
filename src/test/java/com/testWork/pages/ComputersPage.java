package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputersPage extends BasePage {

    private final String laptopBtn = "//a[@href='/catalog--noutbuki/54544/list?hid=91013']";

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public void goToSectionLaptop() {
        driver.findElement(By.xpath(laptopBtn)).click();
    }

}
