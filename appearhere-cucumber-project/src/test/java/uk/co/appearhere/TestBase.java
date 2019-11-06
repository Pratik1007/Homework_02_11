package uk.co.appearhere;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.appearhere.basepage.BasePage;
import uk.co.appearhere.browserselector.BrowserSelector;
import uk.co.appearhere.loadproperty.LoadProperty;

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
