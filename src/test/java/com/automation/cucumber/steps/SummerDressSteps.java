package com.automation.cucumber.steps;

import com.automation.pages.SummerDressDisplay;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SummerDressSteps {

    @And("^I am on summer dress page$")
    public void iAmOnSummerDressPage() {
        new SummerDressDisplay().verifyUserOnSummerDressPage();
    }

    @When("^I mouse hover to Women$")
    public void iMouseHoverToWomen() {
        new SummerDressDisplay().setMouseHoverToWomen();

    }

    @And("^I click on Summer Dresses$")
    public void iClickOnSummerDresses() {
        new SummerDressDisplay().clickOnSummerDress();

    }
}
