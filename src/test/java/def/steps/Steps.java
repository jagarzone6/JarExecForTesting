package def.steps;

/**
 * Created by jagarzone on 16/12/15.
 */

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import def.Pages.AmazonSearchResults;
import def.Pages.InitAmazon;
import def.Pages.InitGoogle;
import def.browser.Driver;
import def.browser.browserType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Steps extends Driver {
    WebDriver driver;
    InitGoogle GoogleMainPage;
    InitAmazon AmazonPage;
    AmazonSearchResults AmazonSearchResults;
    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("Entered setUp in Simple Steps");
        driver = Driver.getNewDriver(browserType.CHROME);
    }

    @After
    public void tearDown() throws Exception {
        Driver.deleteInstanceBrowser();
    }

    @Given("^that I am on google.com$")
    public void that_I_am_on_google_com() {
        GoogleMainPage = new InitGoogle(driver);
        GoogleMainPage.loadPage();
        Assert.assertTrue(GoogleMainPage.getTitle().equals("Google"));
    }

    @Given("^that I am on amazon.com$")
    public void that_I_am_on_amazon_com() {
        AmazonPage = new InitAmazon(driver);
        AmazonPage.loadPage();
        Assert.assertTrue(AmazonPage.getTitle().startsWith("Amazon.com"));
    }

    @Then("^I should see the search box$")
    public void I_should_see_the_search_box() {

        Assert.assertNotNull(GoogleMainPage.getsearchBox());
    }

    @Then("^I should see the title Amazon.com$")
    public void I_should_see_the_title_Amazon_com() {

        System.out.println("The title is: " + AmazonPage.getTitle());
        assertTrue(AmazonPage.getTitle().startsWith("Amazon.com"));
    }
    @When("^I want to search \"([^\"]*)\" in Google$" )
    public void I_want_search_G(String txt) throws Throwable {
        GoogleMainPage.searchText(txt);
        GoogleMainPage.clickBuscar();
    }
    @When("^I want to search \"([^\"]*)\" in Amazon$" )
    public void I_want_search_A(String txt) throws Throwable {
        AmazonPage.searchText(txt);
        AmazonPage.clickBuscar();
    }

    @Then("^Amazon search results should includes bestseller$")
    public void amazonSearchShouldIncludesAmazonsChoice() throws InterruptedException {
        AmazonSearchResults = new AmazonSearchResults(driver);
        Assert.assertNotNull(AmazonSearchResults.getImagelinkcont());
        Assert.assertNotNull(AmazonSearchResults.getImagelinkcont());
        AmazonSearchResults.clickAtImage();
        Thread.sleep(5000);
    }


    @Given("^I searched for headphones at amazon.com$")
    public void iSearchedForHeadphonesAtAmazonCom() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.that_I_am_on_amazon_com();
        this.I_want_search_A("Headphones");

    }
}
