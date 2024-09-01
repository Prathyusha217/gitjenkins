Feature: Icons

  Background: Icons testing
    Given User is in the mainpage

  Scenario: Verify the presence and functionality of Fish icon
    When User click on the Fish icon
    Then User reaches the fish products page.

  Scenario: Verify the presence and functionality of Dogs icon
    When User click on the Dogs icon
    Then User reaches the Dogs products page.

  Scenario: Verify the presence and functionality of Cats icon
    When User click on the Cats icon
    Then User reaches the Cats products page.

  Scenario: Verify the presence and functionality of Reptiles icon
    When User click on the Reptiles icon
    Then User reaches the Reptiles products page.

  Scenario: Verify the presence and functionality of Birds icon
    When User click on the Birds icon
    Then User reaches the Birds products page.
