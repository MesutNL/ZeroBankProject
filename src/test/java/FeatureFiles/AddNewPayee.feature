Feature: My Feature

  Background:
    Given Navigate to Website
    And Write to your username and your password
    Then click to Sign In

  @Group1
  Scenario: My Scenario
    And  Click to Pay Bills
    Then Click to Add New Payee
    And fill who are you paying's page
    And Click to Add Button
    Then  succesfully message should be displayed

  @Group1
  Scenario: My Scenario2
    And  Click to Pay Bills
    Then Click to Add New Payee
    And fill who are you paying's pages
    And Click to Add Button
   Then error message sould be displayed



