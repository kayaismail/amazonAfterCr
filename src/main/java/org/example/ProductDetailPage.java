package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BaseTest {
    private static final By BTN_ADD_TO_CART =By.cssSelector("span[id='submit.add-to-cart']");
    private static final By BTN_GO_TO_CART =By.cssSelector(".huc-v2-view-cart");

    public ProductDetailPage(WebDriver driver) {
        super();
    }

    public static By getBtnGoToCart() {
        return BTN_GO_TO_CART;
    }

    public void setBtnAddToCart()  {
        findAndClick(BTN_ADD_TO_CART);
    }


}
