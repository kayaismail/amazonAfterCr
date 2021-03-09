package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BaseTest {
    private static final By mailAdressFiledLocator = By.cssSelector(" #ap_email");
    private static final By btnContineLocator =By.cssSelector("#continue");
    private static final By btnSubmitLocator =By.cssSelector("#signInSubmit");
    private static final By passwordFieldLocator = By.cssSelector("#ap_password");

    public LoginPage(WebDriver driver) {
        super();
    }

    public void signIn(String mailAdress, String password){

        writeText(mailAdressFiledLocator, mailAdress);

        findAndClick(btnContineLocator);

        writeText(passwordFieldLocator,password);

        findAndClick(btnSubmitLocator);

    }
}
