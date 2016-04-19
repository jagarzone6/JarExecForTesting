Feature: Amazon test

  Scenario: Amazon home page should have a search box
    Given that I am on amazon.com
    And I should see the title Amazon.com
    When I want to search "headphones" in Amazon
    Then Amazon search should includes Amazons choice