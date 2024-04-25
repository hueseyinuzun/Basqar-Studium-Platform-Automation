package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class ApachePOISteps {

    DialogContent dialogContent = new DialogContent();

    @When("User create citizenship with ApachePOI")
    public void user_create_citizenship_with_apache_poi() {
        // Read from Excel and create citizenship i
        // path --> src/test/java/ApachePOI/resource/Apache_Excel_Citizen.xlsx
        // sheetName --> testCitizen

        ArrayList<ArrayList<String>> tablo = ExcelUtility.getListData("src/test/java/ApachePOI/resource/Apache_Excel_Citizen.xlsx","testCitizen",2);

        for (ArrayList<String> satir:tablo) {
            dialogContent.findAndClickFunction("addButton");
            dialogContent.findAndSendKeysFunction("nameInput", satir.get(0));
            dialogContent.findAndSendKeysFunction("shortNameInput", satir.get(1));
            dialogContent.findAndClickFunction("saveButton");
            dialogContent.findAndVerifyContainsText("successMessage","success");
        }
    }

    @Then("User delete citizenship with ApachePOI")
    public void user_delete_citizenship_with_apache_poi() {
        // delete what you saved by reading it again from Excel

        ArrayList<ArrayList<String>> tablo = ExcelUtility.getListData("src/test/java/ApachePOI/resource/Apache_Excel_Citizen.xlsx","testCitizen",1);

        for (ArrayList<String> satir:tablo) {
            dialogContent.searchAndDeleteFunction(satir.get(0));
            dialogContent.findAndVerifyContainsText("successMessage","success");
        }
    }
}
