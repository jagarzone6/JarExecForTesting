Feature: Amazon test

  Scenario: Amazon home page should have a search box
    Given that I am on amazon.com
    And I should see the title Amazon.com
    When I want to search "headphones" in Amazon



  Scenario: When I search for headphones, amazon should show me AmazonsChoice
    Given I searched for headphones at amazon.com
    Then Amazon search results should includes Amazons choice