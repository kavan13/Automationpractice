Feature: Our Store Page
  @Regression
  Scenario: User should verify store map
    Given I am on home page
    When I click on our store
    And I clear popup mgs
    And I drag map
    And click on zoom
    Then I am able to take a screenshoot