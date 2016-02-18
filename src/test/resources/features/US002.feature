Feature:
US002 – As a user I can select a departure flight
Acceptance Criteria:
 The user can see the selected flight
 The user can continue selecting the returning flight
 The user can search a new flight
 The user can filter the flights by stops
 The user can filter the flights by airline
 The user filter the flights by departure time
  Scenario:
    Given User has searched a roundtrip
    And Click on Select button at the cheapest departure flight
    And Click on the search icon, change date1 date2  and click on Search
    And Click on filter and select 1 stop
    And Click on filter and select American Airlines
    And Click on filter and select Early Morning