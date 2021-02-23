@Find
Feature: As an administrator of the EHS system I want to be able to search for a specific product so that
  I can get faster access to its product details.

  Background: launch the application
    Given launch the application

  Scenario: Find the valid Item id
    When user enters the valid product id "2"
    Then user should get the product id "2"

  Scenario: Find Invalid Item id
    When user enters the Invalid product id "25"
    Then user should get warning "Not Found!"

  Scenario: Find with Blank Item
    When user click on find button without enter product id
    Then user should get warning "Not Found!"

