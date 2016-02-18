Feature: http://expedia.com test
  As a user I can search for a round-trip flight from Bogota to San Francisco
  After user enters data required for the search the results are displayed
  The user can sort the results by the lowest price
  The user can sort the results by the highest price
  The user can sort the results by duration


  Scenario:
    Given user is at expedia.com
    And can see Flights button
    When Click on Flights button
    Then Flight options are shown and Roundtrip is selected as default

    Given user Writes in Flying from text field the name of Bogota
    And user Clicks on first suggestion for Bogota
    And Write in Flying to text field the name of San Francisco
    And Click on first suggestion for San Francisco
    And Click on Departing field
    And Select March 2 2016 from calendar 03/02/2016 flight-departing
    And Click on Returning field
    And Select March 12 2016 from calendar 03/12/2016 flight-returning
    When Click on Search button
    Then “Flights-Search” service should response with a list of departure flights order by lowest price

      When Click on Sort ComboBox and select Price-Highest
      Then “Flights-Search” service should response with a list of departure flights order by  highest price
      When Click on Sort ComboBox and select Duration-Shortest
      Then “Flights-Search” service should response with a list of departure flights order by  shortest duration
