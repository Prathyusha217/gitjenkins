Feature: Login page

  Background: 
    Given User is in the login page


  Scenario: Successful Login
    When User enter the valid credentials
    Then User can see the successful login

  Scenario: Invalid login
    When User enter invalid credentials
    Then User see an error message
