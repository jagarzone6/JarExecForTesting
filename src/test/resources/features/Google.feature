Feature: Google test

  Scenario: Google home page should have a search box
    Given that I am on google.com
    Then I should see the search box
    When I want to search "Testing with cucumber" in Google

