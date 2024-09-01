Feature: Shopping cart

  Background: 
    Given User is in shopping cart

  Scenario: Change quantity of the product
    When User is changing the quantity of the product and click on update cart
    Then User can see the updated details in the cart

  Scenario: Remove product from shopping cart
    When User click on the remove button
    Then User is removed product successfully
