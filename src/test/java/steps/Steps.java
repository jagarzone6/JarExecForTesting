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
        System.out.println("New Feature");
        driver = SelectWebDriver.getNewDriver();
    }

    @After
    public void turnDown() throws Exception {
        SelectWebDriver.deleteInstanceBrowser();
    }

    @Given("^user is at expedia.com$")
    public void user_is_at_expedia_com() {

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
        Assert.assertNotNull(driver.findElement(By.id("sort-select")));
    }

    @When("^Click on Sort ComboBox and select Duration-Shortest$")
    public void click_on_Sort_ComboBox_and_select_Duration_Shortest()  {
        // Write code here that turns the phrase above into concrete actions
        new Select(driver.findElement(By.id("sort-select"))).selectByVisibleText("Duration (Shortest)");
    }

    @Then("^“Flights-Search” service should response with a list of departure flights order by  shortest duration$")
    public void flights_Search_service_should_response_with_a_list_of_departure_flights_order_by_shortest_duration()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertNotNull(driver.findElement(By.id("sort-select")));
    }

    @Given("^User has searched a roundtrip$")
    public void user_has_searched_a_roundtrip()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.expedia.com/Flights-Search?trip=roundtrip&leg1=from:Bogota,%20Colombia%20BOG-El%20Dorado%20Intl.%29,to:San%20Francisco%20and%20vicinity%29,%20California,%20United%20States%20of%20America,departure:03/02/2016TANYT&leg2=from:San%20Francisco%20and%20vicinity%29,%20California,%20United%20States%20of%20America,to:Bogota,%20Colombia%20BOG-El%20Dorado%20Intl.%29,departure:03/12/2016TANYT&passengers=children:0,adults:1,seniors:0,infantinlap:Y&mode=search");
    }

    @Given("^Click on Select button at the cheapest departure flight$")
    public void click_on_Select_button_at_the_cheapest_departure_flight()  {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.id("modalCloseButton")).click();
        //driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();



    }

    @Given("^Click on the search icon, change date(\\d+) date(\\d+)  and click on Search$")
    public void click_on_the_search_icon_change_date_date_and_click_on_Search(int arg1, int arg2)  {
        // Write code here that turns the phrase above into concrete actions
        WebElement txtUserName=driver.findElement(By.id("departDate"));
        txtUserName.clear();
        txtUserName.sendKeys("05/02/2016");
        WebElement txtUserName2=driver.findElement(By.id("returnDate"));
        txtUserName2.clear();
        txtUserName2.sendKeys("05/12/2016");

    }

    @Given("^Click on filter and select (\\d+) stop$")
    public void click_on_filter_and_select_stop(int arg1)  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("stopFilter_stops-1")).click();


    }

    @Given("^Click on filter and select American Airlines$")
    public void click_on_filter_and_select_American_Airlines()  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("airlineRowContainer_AA")).click();
    }

    @Given("^Click on filter and select Early Morning$")
    public void click_on_filter_and_select_Early_Morning()  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("todRowContainer_EARLYMORNING")).click();
    }

    @Given("^User has selected a departure flight$")
    public void user_has_selected_a_departure_flight() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.expedia.com/Flights-Search?mode=search&leg1=from:Bogota,%20Colombia%20%28BOG-El%20Dorado%20Intl.%29,to:San%20Francisco,%20CA,%20United%20States%20%28QSF-All%20Airports%29,departure:05/02/2016TANYT&trip=roundtrip&leg2=from:San%20Francisco,%20CA,%20United%20States%20%28QSF-All%20Airports%29,to:Bogota,%20Colombia%20%28BOG-El%20Dorado%20Intl.%29,departure:05/12/2016TANYT&passengers=children:0,adults:1,infantinlap:Y&options=cabinclass:economy&origref=www.expedia.com%2FFlight-Search-All");
       // driver.findElement(By.id("todRowContainer_EARLYMORNING")).click();
       // driver.findElement(By.id("airlineRowContainer_AA")).click();
       // driver.findElement(By.id("stopFilter_stops-1")).click();
       // driver.findElement(By.xpath("(//button[@type='button'])[24]")).click();
    }

    @Given("^Click on Select button at the cheapest returning flight$")
    public void click_on_Select_button_at_the_cheapest_returning_flight() {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.id("stopFilter_stops-1")).click();
        //driver.findElement(By.id("airlineRowContainer_AA")).click();
        //driver.findElement(By.id("todRowContainer_EARLYMORNING")).click();
        //driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();

    }

    @Then("^Can see review of the trip$")
    public void can_see_review_of_the_trip() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Can on Add to trip cheapest car at Add a car section$")
    public void can_on_Add_to_trip_cheapest_car_at_Add_a_car_section() {
        // Write code here that turns the phrase above into concrete actions
       // driver.findElement(By.linkText("Add Economy 2/4Door Car from Alamo to trip")).click();
    }


}
