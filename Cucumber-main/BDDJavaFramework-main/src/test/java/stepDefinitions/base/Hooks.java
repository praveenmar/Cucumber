package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    @Before
    public void setup() {
        getDriver();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {

        //validate if scenario has failed
        if (scenario.isFailed()) {
            try {
                final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "image");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    @After
    public void tearDown() {
        cleanupDriver();
    }
}
