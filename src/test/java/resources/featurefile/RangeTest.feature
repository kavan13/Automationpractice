Feature: Price Range Test Display

  @Sanity
  Scenario: As user i want to navigate to summer dress page
    When I mouse hover to Women
    And I click on Summer Dresses
    And I am on summer dress page
    And I select slider to change price
    Then I verify price range