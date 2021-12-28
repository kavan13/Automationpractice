Feature: Delete Cart
  As a User I should able to delete item
  @Sanity
  Scenario: User should delete item from basket
    Given I am on home page
    When I click on women link
    And I click on fraded short
    And I select add to cart
    And I click on checkout
    And I click on delete
    Then I verify shopping cart empty
