package org.example.testng;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.DriverProvider;

//TODO: rename to *Test.java to run via surefire plugin via console
@CucumberOptions(
        features = "src/test/resources/org/example/",
        glue = "org.example.stepDefinitions"
)
public class RunCucumberWithTestNg extends AbstractTestNGCucumberTests {
}
