package com.example.pages;

import com.seleniumboot.locator.Locator;
import com.seleniumboot.locator.Role;
import com.seleniumboot.test.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * A page object: locators live here, tests stay readable.
 * Locators find elements by role and name, the way a screen reader does, and assertions on them
 * (assertThat(...).isVisible()) retry until the timeout instead of failing on the first miss.
 */
public class ExamplePage extends BasePage {

    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public Locator heading() {
        return getByRole(Role.HEADING, "Example Domain");
    }

    public Locator moreInfoLink() {
        return getByRole(Role.LINK, "Learn more");
    }
}
