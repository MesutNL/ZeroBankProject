Feature: Open Cart Feature


  Background:
    Given Navigate to Website
    And Write to your username and your password
    Then click to Sign In

  @Group1
  Scenario Outline:  Foreign Currency function.
    And  Click to Pay Bills
    And Click to Purchase Foreign Currency
    And Select one Currency
    And Send to Amount "<amount>"
    And Click to Dollar
    And Click To calculate
    And Click to purchase
    Then succesfully message should be displayed


    Examples:
      | amount |
      | 70     |
      | 80     |
      | 110    |

  @Group1
  Scenario Outline:  Foreign Currency function.
    And  Click to Pay Bills
    And Click to Purchase Foreign Currency
    And Select one Currency
    And Send to Amount "<amount2>"
    And Click to Selected Currency
    And Click To calculate
    And Click to purchase
    Then succesfully message should be displayed

    Examples:
      | amount2 |
      | 50      |
      | 100     |
      | 150     |
