package com.example.pages;

import com.seleniumboot.test.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** A page object: locators live here, tests stay readable. */
public class ExamplePage extends BasePage {

    private static final By HEADING = By.cssSelector("h1");
    private static final By MORE_INFO = By.linkText("Learn more");

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public String heading() {
        return getText(HEADING);
    }

    public boolean hasMoreInfoLink() {
        return isDisplayed(MORE_INFO);
    }
}
