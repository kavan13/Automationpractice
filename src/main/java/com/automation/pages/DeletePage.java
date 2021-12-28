package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage extends Utility {
    private static final Logger log = LogManager.getLogger(DeletePage.class.getName());

    public DeletePage() {                                      //created a constructor for PageFactorySetUp
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbutton;

    @FindBy(xpath = "//a[normalize-space()='Faded Short Sleeve T-shirts']")
    WebElement fadedShort;
    @FindBy(css = "button[name='Submit'] span")
    WebElement addToCartButton;
    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement checkout;
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement delete;
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement verifyText;


    public void clickOnWomen() {
        clickOnElement(womenbutton);
        log.info("clicking on women " + womenbutton.toString() + "<br>");
    }

    public void clickOnFadedShort() {
        clickOnElement(fadedShort);
        log.info("clicking on FadedShort " + fadedShort.toString() + "<br>");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("clicking on AddCart " + addToCartButton.toString() + "<br>");
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);
//        log.info("clicking on checkout " + checkout.toString() + "<br>");
    }

    public void clickOnDelete() {
        clickOnElement(delete);
        log.info("clicking on Delete " + delete.toString() + "<br>");
    }

    public String getTextShoppingcartEmpty() {
        return getTextFromElement(verifyText);

    }


}
