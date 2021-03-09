package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BaseTest {
    private static final By PRODUCT_LIST_SELECTOR = By.cssSelector(".sg-col-4-of-12.s-result-item");

    public CategoryPage(WebDriver driver) {
        super();
    }

    public static By getProductListSelector() {
        return PRODUCT_LIST_SELECTOR;
    }

}
