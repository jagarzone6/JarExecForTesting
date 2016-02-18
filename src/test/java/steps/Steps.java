package steps;

/**
 * Created by jagarzone on 18/02/16.
 */import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Steps extends SelectWebDriver {
    WebDriver driver;

    @Before
    public void startup() {
        System.out.println("previous steps");

    }

    @After
    public void turnDown() throws Exception {
        //SelectWebDriver.deleteInstanceBrowser();
    }

    @Given("^user is at expedia.com$")
    public void user_is_at_expedia_com() {
        driver = SelectWebDriver.getNewDriver();
        driver.get("http://expedia.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //String title = driver.getTitle();
        //assertTrue(title.startsWith("Expedia.com"));

    }

    @Given("^can see Flights button$")
    public void can_see_Flights_button() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotNull(driver.findElement(By.id("tab-flight-tab")));
    }
        @When("^Click on Flights button$")
    public void click_on_Flights_button() {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("tab-flight-tab")).click();
    }

    @Then("^Flight options are shown and Roundtrip is selected as default$")
    public void flight_options_are_shown_and_Roundtrip_is_selected_as_default()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotNull(driver.findElement(By.id("flight-type-roundtrip-label")));

    }

    @Given("^user Writes in Flying from text field the name of Bogota$")
    public void user_Writes_in_Flying_from_text_field_the_name_of_Bogota() throws InterruptedException {
        WebElement txtUserName=driver.findElement(By.id("flight-origin"));
        txtUserName.sendKeys("Bogota, Colombia (BOG-El Dorado Intl.)");
    }
    @Given("^user Clicks on first suggestion for Bogota$")
    public void user_Clicks_on_first_suggestion_for_Bogota()  {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.cssSelector("div.option-text-primary")).click();
    }

    @Given("^Write in Flying to text field the name of San Francisco$")
    public void write_in_Flying_to_text_field_the_name_of_the_San_Francisco()  {
        // Write code here that turns the phrase above into concrete actions
        WebElement txtUserName=driver.findElement(By.id("flight-destination"));
        txtUserName.sendKeys("San Francisco (and vicinity), California, United States of America");

    }

    @Given("^Click on first suggestion for San Francisco$")
    public void click_on_first_suggestion_for_San_Francisco()  {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.cssSelector("div.option-text-primary")).click();

    }

    @Given("^Click on Departing field$")
    public void click_on_Departing_field()  {
        // Write code here that turns the phrase above into concrete actions


    }

    @Given("^Select March (\\d+) (\\d+) from calendar (.*) flight-departing$")
    public void select_March_from_calendar_flight_departing(int arg1, int arg2, String input)  {
        // Write code here that turns the phrase above into concrete actions
        WebElement txtUserName=driver.findElement(By.id("flight-departing"));
        txtUserName.sendKeys(input);

    }

    @Given("^Select March (\\d+) (\\d+) from calendar (.*) flight-returning$")
    public void select_March_from_calendar_flight_returning(int arg1, int arg2, String input)  {
        // Write code here that turns the phrase above into concrete actions
        WebElement txtUserName=driver.findElement(By.id("flight-returning"));
        txtUserName.clear();
        txtUserName.sendKeys(input);

    }

    @Given("^Click on Returning field$")
    public void click_on_Returning_field()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Click on Search button$")
    public void click_on_Search_button()  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("search-button")).click();
    }

    @Then("^“Flights-Search” service should response with a list of departure flights order by lowest price$")
    public void flights_Search_service_should_response_with_a_list_of_departure_flights_order_by_lowest_price()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotNull(driver.findElement(By.id("sort-select")));
    }


    @When("^Click on Sort ComboBox and select Price-Highest$")
    public void click_on_Sort_ComboBox_and_select_Price_Highest()  {
        // Write code here that turns the phrase above into concrete actions
        new Select(driver.findElement(By.id("sort-select"))).selectByVisibleText("Price (Highest)");

    }

    @Then("^“Flights-Search” service should response with a list of departure flights order by  highest price$")
    public void flights_Search_service_should_response_with_a_list_of_departure_flights_order_by_highest_price()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Click on Sort ComboBox and select Duration-Shortest$")
    public void click_on_Sort_ComboBox_and_select_Duration_Shortest()  {
        // Write code here that turns the phrase above into concrete actions
        new Select(driver.findElement(By.id("sort-select"))).selectByVisibleText("Duration (Shortest)");
    }

    @Then("^“Flights-Search” service should response with a list of departure flights order by  shortest duration$")
    public void flights_Search_service_should_response_with_a_list_of_departure_flights_order_by_shortest_duration()  {
        // Write code here that turns the phrase above into concrete actions
        
    }



}
