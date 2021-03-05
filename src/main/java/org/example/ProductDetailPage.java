package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BaseTest {
    private static final By btnAddToListLocator =By.cssSelector("#add-to-wishlist-button-submit");
    private static final By btnviewLocator =By.cssSelector("#WLHUC_viewlist > span > span");
    private static final By ProductimgLocator=By.cssSelector("#itemImage_I1TNO7PQX2LOG1 > a > img"); // will use isonpage

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addCrateSelectList()  {
        findAndClick(btnAddToListLocator);
        findAndClick(btnviewLocator);

    }


}
