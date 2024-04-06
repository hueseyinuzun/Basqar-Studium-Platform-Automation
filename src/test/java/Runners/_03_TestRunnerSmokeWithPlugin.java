package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target//cucumber-reports.html"}
)
public class _03_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {

}
