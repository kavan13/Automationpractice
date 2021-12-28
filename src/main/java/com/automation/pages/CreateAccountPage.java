package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {PageFactory.initElements(driver, this);}

    @FindBy(css = "a[title='Log in to your customer account']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailfornewaccount;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Please enter your email address to create an accou')]")
    WebElement createAccountPage;
    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createAccounTAB;

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    @FindBy(css = "#passwd")
    WebElement password;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#id_state")
    WebElement state;

    @FindBy(css = "#postcode")
    WebElement postcode;

    @FindBy(css = "#id_country")
    WebElement country;

    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;

    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement headingOfMyAccount;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header_user_info']//a//span")
    WebElement myAccountName;


    public void clickOnSignIn(){
        clickOnElement(signIn);
        log.info("clicking on signIn " + signIn.toString() + "<br>");

    }
    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccounTAB);
        log.info("clicking on CreateAccount " + createAccounTAB.toString() + "<br>");

    }
    public void enterRandomEmailfornewacountcreation() {
        sendRandomEmailToElement(emailfornewaccount);
        log.info("Enter RandomEmail : " + emailfornewaccount.toString() + "<br>");
    }
    public void enterEmailfornewacountcreation(String email) {
        sendTextToElement(emailfornewaccount,email);
    }
    public void enterYourFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter firstname"   + firstName.toString() + "<br>");
    }

    public void enterYourLastName(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Enter lastname"  + lastName.toString() + "<br>");
    }

    public void enterYourPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter password"  + password.toString() + "<br>");

    }

    public void enterYourAddress(String add) {
        sendTextToElement(address, add);
        log.info("Enter adress"  + address.toString() + "<br>");
    }

    public void enterYourCity(String cityy) {
        sendTextToElement(city, cityy);
        log.info("Enter city" + city.toString() + "<br>");
    }

    public void selectYourState(String st) {
        selectByValueFromDropDown(state, st);
        log.info("Enter State" + state.toString() + "<br>");
    }

    public void enterYourPhoneNumber(String phone) {
        sendTextToElement(phoneNumber, phone);
        log.info("Enter phone number" + phoneNumber.toString() + "<br>");
    }

    public void enterYourPostalCode(String postal) {
        sendTextToElement(postcode, postal);
        log.info("Enter postcode" + postcode.toString() + "<br>");
    }

    public void selectYourCountry(String countryy) {
        selectByValueFromDropDown(country, countryy);
        log.info("Enter Country" + country.toString() + "<br>");
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("clicking on Register Button " + registerButton.toString() + "<br>");
    }




    public void verifyAccountPage(){
        String expectedmsg = "Please enter your email address to create an account.";
        String actualmsg = getTextFromElement(createAccountPage);
        Assert.assertEquals("Page not found",expectedmsg,actualmsg);
    }





    public void myAccountName(){
        String expAccountName = "kavan Patel";
        String actualAccountName = getTextFromElement(myAccountName);
        Assert.assertEquals(expAccountName,actualAccountName);

    }
}
