package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeTest
    public void setUp() {
        try {
            setProperty();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            driver = new ChromeDriver(capabilities);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        // driver.quit();
    }

    // find locator and click it
    public void findAndClick(By locator){
        driver.findElement(locator).click();
    }

    // text input and seach area
    public void waitAndSend(By locator,String words){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement anyField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
        anyField.sendKeys(words);
    }

    public static void setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ismail.kaya/IdeaProjects/amazon/chrome driver/chromedriver.exe");
    }

    public void navigateUrl(String url) {
        driver.get(url);

    }

}
