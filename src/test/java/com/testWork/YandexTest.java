package com.testWork;

import com.testWork.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YandexTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({"'20000','35000','DELL'"})
    public void findLaptop(String number1, String number2, String maker) {
        driver.get("https://yandex.ru/");
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        mainPage.goToSectionMarket();
        MarketPage marketPage = new MarketPage(driver);
        marketPage.goToSectionComputers();
        ComputersPage computersPage = new ComputersPage(driver);
        computersPage.goToSectionLaptop();
        LaptopPage laptopPage = new LaptopPage(driver);
        laptopPage.goToAdvancedSearch();
        ElementAdvancedSearch elementAdvancedSearch = new ElementAdvancedSearch(driver);
        elementAdvancedSearch.setPrice(number1, number2);
        elementAdvancedSearch.setMaker(maker);
        elementAdvancedSearch.clickApply();
        String title = laptopPage.saveSecondTitle();
        ElementHeaderSearch elementHeaderSearch = new ElementHeaderSearch(driver);
        elementHeaderSearch.sendKeysSearch(title);
        elementHeaderSearch.clickFind();
        ElementResultSearch elementResultSearch = new ElementResultSearch(driver);
        String result = elementResultSearch.searchElementInResults(title);
        Assertions.assertEquals("Такой ноутбук есть в поиске", result, "Такого ноутбука нет в поиске!");

    }


}
