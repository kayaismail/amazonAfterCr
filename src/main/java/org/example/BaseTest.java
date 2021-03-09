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
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

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

   public WebElement waitVisibility(By locator) {
        WebDriverWait pageWait= new WebDriverWait(this.driver, 5);
        return  pageWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }
    // find locator and click it
    public void findAndClick(By locator){
       waitVisibility(locator);
        driver.findElement(locator).click();
    }
    // text input and search area
    public void writeText(By locator,String words){

        driver.findElement(locator).sendKeys(words);
    }

    public static void setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ismail.kaya/IdeaProjects/amazon/chrome driver/chromedriver.exe");
    }
    public void ramdomClick(By locator) {
        List<WebElement> webElements = driver.findElements(locator);
        Random rand = new Random();
        int randomSelected= rand.nextInt(webElements.size()-1);
        webElements.get(randomSelected).click();
    }
    public void backToPage(){
        driver.navigate().back();
    }

}
