Feature: Search a product

  Background: 
    Given User is in the pet store home page

  Scenario: User can search for products
    When User enter "fish" in the search field
    Then User see a list of search results contain fish

  Scenario: Search without entering a product
    When The user clicks the search button without entering a product name
    Then an error message should display
