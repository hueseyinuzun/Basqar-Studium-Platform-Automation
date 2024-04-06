package StepDefinitions;

import Pages.DialogContent;
import Utilities.GeneralWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GeneralWebDriver.getDriver().get("https://test.mersys.io/");
        GeneralWebDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click Login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndSendKeysFunction("username","turkeyts");
        dc.findAndSendKeysFunction("password","TechnoStudy123");
        dc.findAndClickFunction("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndVerifyContainsText("dashboard","Dashboard");
    }
}
