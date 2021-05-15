package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.DriverProvider;

public class Hook  {
    @Before
    public void beforeEachTest(){
        System.out.println("Before each test...");
        DriverProvider.INSTANCE.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) DriverProvider.INSTANCE.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            // attach it in the report.
            scenario.attach(screenshot, "image/png", "Page screenshot");
        }
        DriverProvider.INSTANCE.removeDriver();
    }
}
