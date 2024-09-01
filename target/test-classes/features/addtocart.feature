Feature: Adding product to the cart

  Scenario: Add a product to the cart
    Given User is in Dogs page
    When User click on Product id and click on add to cart
    Then User can see a product in cart page
