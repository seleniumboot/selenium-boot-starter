package com.example.tests;

import com.example.pages.ExamplePage;
import com.seleniumboot.locator.Role;
import com.seleniumboot.test.BaseTest;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    // A bundled page, so the smoke test needs no network. For your own tests, call open()
    // (it navigates to execution.baseUrl in selenium-boot.yml) or open("/path").
    private void openFixture() {
        getDriver().get(getClass().getResource("/example.html").toString());
    }

    @Test
    public void opensThePage() {
        openFixture();
        assertThat(getByRole(Role.HEADING, "Example Domain")).isVisible();
    }

    @Test
    public void pageObjectExposesTheLocators() {
        openFixture();
        ExamplePage page = new ExamplePage(getDriver());
        assertThat(page.heading()).isVisible();
        assertThat(page.moreInfoLink()).isVisible();
    }
}
