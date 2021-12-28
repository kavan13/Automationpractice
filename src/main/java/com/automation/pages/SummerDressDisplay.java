package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SummerDressDisplay extends Utility {
    private static final Logger log = LogManager.getLogger(SummerDressDisplay.class.getName());

    public SummerDressDisplay() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement mouseHoverToWomen;

    @CacheLookup
    @FindBy(linkText = "Summer Dresses")
    WebElement summerDress;

    @CacheLookup
    @FindBy(xpath = "//div[@class='rte']")
    WebElement summerDressPage;


    public void setMouseHoverToWomen(){
        mouseHoverToElement(mouseHoverToWomen);
        log.info("clicking on women " + mouseHoverToWomen.toString() + "<br>");
    }

    public void clickOnSummerDress(){
        clickOnElement(summerDress);
        log.info("clicking on SummerDress " + summerDress.toString() + "<br>");
    }

    public void verifyUserOnSummerDressPage(){
        String expectedmessage = getTextFromElement(summerDressPage);
        String actualmessage ="Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.";
        Assert.assertEquals(expectedmessage,actualmessage,"Wrong Page");
    }


}
