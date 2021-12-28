package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateAccountSteps {
    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new CreateAccountPage().clickOnSignIn();
    }

    @And("^I enter email  \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new CreateAccountPage().enterRandomEmailfornewacountcreation();

    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new CreateAccountPage().clickOnCreateAnAccountButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
        new CreateAccountPage().enterYourFirstName(name);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last)  {
     new CreateAccountPage().enterYourLastName(last);
    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String pass)  {
      new CreateAccountPage().enterYourPassword(pass);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String addres)  {
        new CreateAccountPage().enterYourAddress(addres);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
      new CreateAccountPage().enterYourCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state)  {
     new CreateAccountPage().selectYourState(state);
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String code)  {
       new CreateAccountPage().enterYourPostalCode(code);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)  {
       new CreateAccountPage().selectYourCountry(country);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone)  {
     new CreateAccountPage().enterYourPhoneNumber(phone);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }
}
