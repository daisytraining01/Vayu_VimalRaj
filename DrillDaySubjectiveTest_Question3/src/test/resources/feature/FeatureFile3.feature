@All
Feature: Title of your feature

  Background: 
  Given User opens the browser

  @Vimal3
  Scenario: New user registration
    Given navigates to the RegisterPage
    When User enters valid data from excel
    Then User is successfully logged into the system
    And User successfully logout from the application