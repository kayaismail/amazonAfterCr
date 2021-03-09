package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class MainPage extends BaseTest {
    private static final By BTN_LOGIN = By.cssSelector("#nav-signin-tooltip > a > span");
    private static final By BTN_HAMBURGER_LOCATOR = By.cssSelector(".hm-icon.nav-sprite");
    private static final By FULL_STORE_DIRECTORY = By.cssSelector("li:nth-child(21) > a");
    private static final By CATEGORIES_LIST_LOCATOR = By.cssSelector(".fsdDeptLink");

    public MainPage(WebDriver driver) {
        super();
    }

    public static By getFullStoreDirectory() {
        return FULL_STORE_DIRECTORY;
    }

    public static By getCategoriesListLocator() {
        return CATEGORIES_LIST_LOCATOR;
    }

    public static By getBtnHamburgerLocator() {
        return BTN_HAMBURGER_LOCATOR;
    }

    public void openMainPage()  {
        String loginUrl = "https://www.amazon.com";
        driver.get(loginUrl);
    }

    public void loginButtonClick()  {
        findAndClick(BTN_LOGIN);
    }

    public void ramdomClick(By locator) {
        List<WebElement> webElements = driver.findElements(locator);
        Random rand = new Random();
        int randomSelected= rand.nextInt(webElements.size()-1);
        webElements.get(randomSelected).click();
    }

}
