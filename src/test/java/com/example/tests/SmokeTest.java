package com.example.tests;

import com.example.pages.ExamplePage;
import com.seleniumboot.locator.Role;
import com.seleniumboot.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void opensThePage() {
        open();  // navigates to execution.baseUrl
        assertThat(getByRole(Role.HEADING, "Example Domain")).isVisible();
    }

    @Test
    public void pageObjectReadsTheHeading() {
        open();
        ExamplePage page = new ExamplePage(getDriver());
        Assert.assertEquals(page.heading(), "Example Domain");
        Assert.assertTrue(page.hasMoreInfoLink());
    }
}
