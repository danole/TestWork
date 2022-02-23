package com.testWork.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    protected WebDriver driver;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
