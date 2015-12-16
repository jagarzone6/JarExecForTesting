package com.steps;

/**
 * Created by jagarzone on 16/12/15.
 */import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import com.Pages.*;

public class Steps extends Driver {
    WebDriver driver;
    InitGoogle GoogleMainPage;
    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("Entered setUp in Simple Steps");
        driver = Driver.getNewDriver();
        GoogleMainPage = new InitGoogle(driver);
    }

    @After
    public void tearDown() throws Exception {
        Driver.deleteInstanceBrowser();
    }

    @Given("^that I am on google.com$")
    public void that_I_am_on_google_com() {
        driver.get("http://www.google.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
    }

    @Given("^that I am on amazon.com$")
    public void that_I_am_on_amazon_com() {

        driver.get("http://www.amazon.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.startsWith("Amazon.com"));
    }

    @Then("^I should see the search box$")
    public void I_should_see_the_search_box() {
        Assert.assertNotNull(driver.findElement(By.id("gs_lc0")));
    }

    @Then("^I should see the title Amazon.com$")
    public void I_should_see_the_title_Amazon_com() {
        String title = driver.getTitle();

        System.out.println("The title is: " + title);
        assertTrue(title.startsWith("Amazon.com"));
    }
    @When("^I want to search \"([^\"]*)\"$")
    public void I_want_search(String txt) throws Throwable {
        GoogleMainPage.searchText(txt);
        GoogleMainPage.clickBuscar();
    }

}
