package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralSteps {
    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            leftNav.findAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("Click on the element in the Dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            dialogContent.findAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("User sending the keys in the Dialog content")
    public void userSendingTheKeysInTheDialogContent(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            dialogContent.findAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findAndVerifyContainsText("successMessage","success");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findAndVerifyContainsText("errorMessage","Could not delete from the specified record");
    }

    @When("User edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            dialogContent.searchAndEditFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @When("User delete the {string} in the Dialog content")
    public void userDeleteTheInTheDialogContent(String nameOfElementToDelete) {
        dialogContent.editAndDeleteFunction(nameOfElementToDelete,"delete");
    }

    @When("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            dialogContent.searchAndDeleteFunction(elementsToClick.get(i));
        }
    }

    @And("Click escape")
    public void clickEscape() {
        dialogContent.clickEscape();
    }


    @And("Selecting on the element in the Form Content")
    public void selectingOnTheElementInTheFormContent(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            dialogContent.selectUserType(elementsToClick.get(i));
        }
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dialogContent.findAndVerifyContainsText("alreadyExist","already exists");
    }
}
