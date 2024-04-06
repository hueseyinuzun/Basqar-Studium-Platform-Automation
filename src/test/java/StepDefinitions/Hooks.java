package StepDefinitions;

import Utilities.GeneralWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before(){

    }

    @After
    public void after(Scenario scenario){

        // Screenshot
        if (scenario.isFailed()){
            TakesScreenshot screenshot = (TakesScreenshot) GeneralWebDriver.getDriver();
            byte[] memory= screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(memory, "image/png", "screenshot name");
        }
        GeneralWebDriver.quitDriver();
    }
}
