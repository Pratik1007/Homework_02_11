package com.gmx;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Pratik
 */


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = ".",
            plugin = {"pretty","html:target/cucumber-report"},
            dryRun = false
//            tags = "@Sanity"
    )
    public class TestRunner {
    }
