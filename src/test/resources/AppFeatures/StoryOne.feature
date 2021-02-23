@StoryOne
Feature: As an administrator of the EHS system I want to be able to see all the available products so that
  I can make faster decisions

  Background: User is on EHS Home page
    Given launch the application

  @Regression
  Scenario: Get the list of all item from item List
    Given User is on all list item screen
    When User capture all the list info
    Then all item should be visible on the screen

  @Regression
  Scenario: Get the total count of the item
    Given User is on all list item screen
    When User counts the total items
    Then Total counts should be 9

  @Regression
  Scenario: Get the count of open button
    Given User is on all list item screen
    When User counts the total items
    Then Total counts should be 9

  Scenario: Validate the EHS Home Page
    Then home page title should be "EHS - Home"

  Scenario: Validate the EHS All Items page
    Given user on EHS all items page
    Then all item page title should be "EHS - All Items"

  @Regression
  Scenario: validate the EHS WebPage Elements are present on Web page
    When validate the productId label input field Find button and list all items button
    Then productId element should be visible on page
    And user should see the clickable input field
    And find button should be display on the screen
    And find button should be display on the screen
    And list all item button should be clickable on screen
