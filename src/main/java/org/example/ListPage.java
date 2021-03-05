package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage extends BaseTest {
    private static final By btnRemoveList = By.name("submit.deleteItem");

    public ListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeList()  {
        findAndClick(btnRemoveList);
    }


}
