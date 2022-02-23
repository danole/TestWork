package com.testWork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ElementResultSearch extends BasePage {

    private final String allTitle = "//article[@class='_2vCnw cia-vs cia-cs']/*[4]/*[1]/*[1]";
    private String result;

    public ElementResultSearch(WebDriver driver) {
        super(driver);
    }

    public String searchElementInResults(String title) {


        List<WebElement> titleList = new ArrayList<>();

        titleList = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions
                        .presenceOfAllElementsLocatedBy(By.xpath(allTitle)));

        for (int i = 0; i <= titleList.size() - 1; i++) {
            WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                    .until(ExpectedConditions
                            .visibilityOf(titleList.get(i)));
            if (title.equals(element.getText())) {
                result = "Такой ноутбук есть в поиске";
                break;
            } else {
                result = "Такого ноутбука нет в поиске";
            }
        }
        return result;
    }

}
