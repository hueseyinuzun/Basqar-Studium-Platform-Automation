package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _04_TestRunnerExtendReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name","Hüseyin Uzun");
        ExtentService.getInstance().setSystemInfo("Application Name", "Basqar Studium Platform");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satir", "Açıklama");
    }
}
