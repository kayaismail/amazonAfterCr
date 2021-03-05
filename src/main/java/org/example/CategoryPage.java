package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BaseTest {
    private static final By secondPageLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[26]/span/div/div/ul/li[3]/a");
    private static final By thirdProductLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }
    // open and click selected page
    public void selectPage(){
        findAndClick(secondPageLocator);
    }
    // select products
    public void selectProduct()  {
        findAndClick(thirdProductLocator);
    }
}
