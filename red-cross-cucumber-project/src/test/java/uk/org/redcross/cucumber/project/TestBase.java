package uk.org.redcross.cucumber.project;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.org.redcross.cucumber.project.basepage.BasePage;
import uk.org.redcross.cucumber.project.browserselector.BrowserSelector;
import uk.org.redcross.cucumber.project.loadproperty.LoadProperty;

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
