package uk.org.redcross.cucumber.project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Pratik
 */


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "C:\\Users\\MISARI\\IdeaProjects\\red-cross-cucumber-project\\src\\test\\java\\resources\\featurefiles\\homepage.feature",
            plugin = {"pretty","html:target/cucumber-report"},
            dryRun = false
//            tags = "@Sanity"
    )
    public class TestRunner {
    }
