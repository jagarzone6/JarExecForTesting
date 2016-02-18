Feature: US003 – As a user I can select a returning flight
  Acceptance Criteria:
 The user can see the selected flights
 The user can see the trip summary
 The user can add a car to the trip
# https://www.expedia.com/Flights-Search?mode=search&leg1=from:Bogota,%20Colombia%20%28BOG-El%20Dorado%20Intl.%29,to:San%20Francisco,%20CA,%20United%20States%20%28QSF-All%20Airports%29,departure:05/02/2016TANYT&trip=roundtrip&leg2=from:San%20Francisco,%20CA,%20United%20States%20%28QSF-All%20Airports%29,to:Bogota,%20Colombia%20%28BOG-El%20Dorado%20Intl.%29,departure:05/12/2016TANYT&passengers=children:0,adults:1,infantinlap:Y&options=cabinclass:economy&origref=www.expedia.com%2FFlight-Search-All
  Scenario:
    Given User has selected a departure flight
    And Click on Select button at the cheapest returning flight
    Then Can see review of the trip
    And Can on Add to trip cheapest car at Add a car section