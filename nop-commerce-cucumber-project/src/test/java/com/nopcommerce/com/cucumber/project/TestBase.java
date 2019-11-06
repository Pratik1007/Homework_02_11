package com.nopcommerce.com.cucumber.project;

import com.nopcommerce.com.cucumber.project.basepage.BasePage;
import com.nopcommerce.com.cucumber.project.browserselector.BrowserSelector;
import com.nopcommerce.com.cucumber.project.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

/* Created by Pratik */

public class TestBase extends BasePage {


        BrowserSelector browserSelector = new BrowserSelector();
        LoadProperty loadProperty = new LoadProperty();

        String browser = loadProperty.getProperty("browser");


        @Before
        public void setUp() {
            browserSelector.selectBrowser(browser);

        }

        @After
        public void tearDown() {
            driver.quit();
        }
}
