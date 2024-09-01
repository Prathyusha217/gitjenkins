Feature: User registration

  Background: 
    Given User is in registration page

  Scenario: User registering with details
    When User have to enter details in registration page and click on resister button
    Then User can register successfully

  Scenario: User registering with missing details
    When User miss some details to enter and click on register button
    Then User get an error message
