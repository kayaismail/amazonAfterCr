package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BaseTest{
    private static final By BTN_DELETE =By.cssSelector("input[value='Delete']");
    private static final By BTN_CHECKOUT =By.cssSelector("input[name='proceedToRetailCheckout']");

    public CartPage(WebDriver driver) {
        super();
    }

    public static By getBtnCheckout() {
        return BTN_CHECKOUT;
    }

    public static By getBtnDelete() {
        return BTN_DELETE;
    }

}
