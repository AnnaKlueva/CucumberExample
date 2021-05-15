package org.example.junit;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//TODO: rename to *Test.java to run via surefire plugin via console
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/org/example/",
        glue = "org.example.stepDefinitions")
public class RunCucumberWithJunit {
}
