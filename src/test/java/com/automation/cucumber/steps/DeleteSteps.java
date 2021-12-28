package com.automation.cucumber.steps;

import com.automation.pages.DeletePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on women link$")
    public void iClickOnWomenLink() {
        new DeletePage().clickOnWomen();
    }

    @And("^I click on fraded short$")
    public void iClickOnFradedShort() {
        new DeletePage().clickOnFadedShort();
    }

    @And("^I select add to cart$")
    public void iSelectAddToCart() {
        new DeletePage().clickOnAddToCartButton();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new DeletePage().clickOnCheckout();
    }

    @And("^I click on delete$")
    public void iClickOnDelete() {
        new DeletePage().clickOnDelete();
    }

    @Then("^I verify shopping cart empty$")
    public void iVerifyShoppingCartEmpty() {
        new DeletePage().getTextShoppingcartEmpty();
    }
}
