package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LaptopPage extends BasePage {

    private final String AdvancedSearchBtn = "//a[@class='zsSJk _2sWJL eD98J _36y1j']";
    private final String secondTitle = "//div[@aria-label='Результаты поиска']/*[1]/*/*/*[2]/*[4]/*[1]/*[1]";
    private String title;


    public LaptopPage(WebDriver driver) {
        super(driver);
    }


    public void goToAdvancedSearch() {
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(AdvancedSearchBtn))).click().build().perform();
    }

    public String saveSecondTitle() {
        return title = driver.findElement(By.xpath(secondTitle)).getText();
    }

}
