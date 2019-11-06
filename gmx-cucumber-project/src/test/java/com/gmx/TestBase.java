package com.gmx;

import com.gmx.basepage.BasePage;
import com.gmx.browserselector.BrowserSelector;
import com.gmx.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

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
