Feature: Adding multiple products to cart

  Scenario: User can add a multiple products to cart
    Given User is in Cats page
    When User click on product and add to cart next click on Birds add a product
    Then User can see the products is added to cart successfully
