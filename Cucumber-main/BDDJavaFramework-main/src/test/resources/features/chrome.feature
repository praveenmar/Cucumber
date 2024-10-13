@chrome

Feature: Commercial property validation
  Scenario Outline:Validate the user is able to new submission for Excess and Surplus in Commercial Property
    Given user open chrome and load the url "<string>"
    And user search and get results
    Examples:
      | string |
      | batman |