package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

public class MainPage extends BaseTest {
    private static final By searchFieldLocator= By.cssSelector(" #twotabsearchtextbox");
    private static final By btnSearchLocator =By.cssSelector("#nav-search-submit-button");
    private static final By btnLogin = By.cssSelector("#nav-signin-tooltip > a > span");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage()  {
        String loginUrl = "https://www.amazon.com";
        driver.get(loginUrl);
    }

    public void loginButtonClick()  {
        driver.findElement(btnLogin).click();
    }

    public void search(String searchWords){
        waitAndSend(searchFieldLocator,searchWords);
        findAndClick(btnSearchLocator);
    }

}
