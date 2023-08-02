Feature: Test the Sauce_Demo Application

  Scenario: Test Login Functionality
    Given User is on Sauce Demo Application
    When Enter Valid username and password
    Then Click on Login button

  Scenario: Check the product
    When Select the product and click on Add To Cart button
    Then Click on container

  Scenario: Overview the product
    Then Click On checkout button

  Scenario: Checkout your information
    When User enter their Firstname Lastname and zipcode
    Then Click on Continue button

  Scenario: Checkout overview
    Then Click on finish button
