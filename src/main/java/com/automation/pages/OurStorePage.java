package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurStorePage extends Utility {
    private static final Logger log = LogManager.getLogger(OurStorePage.class.getName());

    public OurStorePage() {                                      //created a constructor for PageFactorySetUp
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Our stores')]")
    WebElement ourstore;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okButton;
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;

    public void clickOnOurStore() {
        clickOnElement(ourstore);
        log.info("clicking on OurStore " + ourstore.toString() + "<br>");
    }

    public void clickokpopup() {
        clickOnElement(okButton);
        log.info("clicking on popup " + okButton.toString() + "<br>");
    }



    public void drag() {

        new Actions(driver).moveToElement(map, 0, 0).clickAndHold().moveByOffset(300, 0).release().build().perform();
        clickOnElement(zoomOut);
        log.info("clicking on zoomout " + zoomOut.toString() + "<br>");
    }

    public void zoom1() {
        clickOnElement(zoomOut);
        log.info("clicking on zoom1 " + zoomOut.toString() + "<br>");
    }


public void getScreenshot(){
        Utility.takeScreenShot();
}
}