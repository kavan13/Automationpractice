package com.automation.cucumber.steps;

import com.automation.pages.RangePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PriceRangeSteps {
    @And("^I select slider to change price$")
    public void iSelectSliderToChangePrice() {
        new RangePage().selectSliderPriceRange();
    }

    @Then("^I verify price range$")
    public void iVerifyPriceRange() {
        new RangePage().verifyPriceRange();
    }
}
