package com.automation.cucumber;

import com.automation.propertyreader.PropertyReader;
import com.automation.utility.Utility;


import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("kavan");
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace("","_"));
            Reporter.addScreenCaptureFromPath(screenShotPath);
        }
       closeBrowser();
    }

}
