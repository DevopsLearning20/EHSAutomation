@itemPage
Feature: As an administrator of the EHS system I want to se detailed information about a specific product so that I know that the system is up to date

  Background: Page navigation till list all pages
    Given launch the application

    @Regression
  Scenario Outline: validate the item1 details
    Given User is on all list item screen
    When User click on Open button for item
    Then ehs item page should be display
    And Item should have "<Product id>""<Name>""<Material>""<Manufacturer>""<price>"

    Examples:
      | Product id | Name       | Material | Manufacturer    | price  |
      | STD 1      | EHS Item 1 | Bronze   | Boston Item LLC | $53.50 |

    Scenario: Validate the tile of EHS Item screen
      Given User is on all list item screen
      When User click on Open button for item
      When user gets the title of the page
      Then page title should be "find.html?ProductIdField=STD+1"

