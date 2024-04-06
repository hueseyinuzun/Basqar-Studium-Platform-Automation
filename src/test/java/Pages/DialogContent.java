package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {
    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'NAME')]/input[@aria-required='true']")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[contains(@class, 'control-full')]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement countrySelect;

    @FindBy(xpath = "//mat-select[@role='combobox'][@aria-haspopup='true']")
    private WebElement searchSelect;

    @FindBy(xpath = "//span[@class='mat-option-text'][text()=' Türkei ']")
    private WebElement countryOption;

    @FindBy(xpath = "//span[@class='mat-option-text'][text()=' NewTurkey ']")
    private WebElement countryOption2;

    @FindBy(css = "mat-expansion-panel-header[role='button'] mat-panel-description")
    private WebElement errorMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//input[@matchipinputaddonblur='false']")
    private WebElement salaryUserType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement option;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    private WebElement ibanInput;

    @FindBy(xpath = "(//mat-select[@role='combobox']//span)[4]")
    private WebElement currency;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'INTEGRATION_CODE')][contains(@formcontrolname, 'ode')]/input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'DESCRIPTION')]/input[@aria-required='true']")
    private WebElement description;

    @FindBy (css = "ms-text-field[formcontrolname='order']>input")
    private WebElement order;

    @FindBy (xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    private WebElement active;

    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })
    private List<WebElement> deleteButtonList;

    @FindAll({@FindBy(css="ms-edit-button.ng-star-inserted")})
    private List<WebElement> editButtonList;

    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })
    private List<WebElement> nameList;

    @FindBy(xpath = "//mat-select[@role='combobox']/div")
    private WebElement role;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[8]")
    private WebElement roleOption;

    @FindBy(xpath = "//ms-button[@icon='refresh']/button")
    private WebElement refresh;

    @FindBy(xpath = "//mat-select[@role='combobox'][@formcontrolname='attachmentStages']")
    private WebElement stageSelect;

    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles']//input")
    private WebElement userTypeDropdown;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement notationName;

    @FindBy(xpath = "//input[@name='shortName']")
    private WebElement notationShortName;

    @FindBy(xpath = "//input[@name='multiplier']")
    private WebElement notationMultiplier;

    @FindBy(xpath = "//span[text()='Apply']")
    private WebElement applyButton;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath = "//ms-save-button[@caption='GENERAL.BUTTON.SAVE_AND_CLOSE']//button")
    private WebElement saveCloseButton;

    public void findAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "searchInput":
                myElement = searchInput;
                break;

            case "shortNameInput":
                myElement = shortNameInput;
                break;

            case "ibanInput":
                myElement = ibanInput;
                break;

            case "integrationCode":
                myElement = integrationCode;
                break;

            case "priorityCode":
                myElement = priorityCode;
                break;

            case "description":
                myElement = description;
                break;

            case "order":
                myElement = order;
                break;

            case "notationName":
                myElement = notationName;
                break;

            case "notationShortName":
                myElement = notationShortName;
                break;

            case "notationMultiplier":
                myElement = notationMultiplier;
                break;

            case "capacity":
                myElement = capacity;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClickFunction(String elementName) {
        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "editButton":
                myElement = editButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;

            case "countrySelect":
                myElement = countrySelect;
                break;

            case "searchSelect":
                myElement = searchSelect;
                break;

            case "countryOption":
                myElement = countryOption;
                break;

            case "countryOption2":
                myElement = countryOption2;
                break;

            case "salaryUserType":
                myElement = salaryUserType;
                break;

            case "option":
                myElement = option;
                break;

            case "currency":
                myElement = currency;
                break;

            case "active":
                myElement = active;
                break;

            case "role":
                myElement = role;
                break;

            case "roleOption":
                myElement = roleOption;
                break;

            case "refresh":
                myElement = refresh;
                break;

            case "stageSelect":
                myElement = stageSelect;
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "applyButton":
                myElement = applyButton;
                break;

            case "toggleBar":
                myElement = toggleBar;
                break;

            case "saveCloseButton":
                myElement = saveCloseButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndVerifyContainsText(String elementName, String message) {
        switch (elementName) {
            case "dashboard":
                myElement = dashboard;
                break;

            case "successMessage":
                myElement = successMessage;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;

            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }
        verifyContainsText(myElement, message);
    }

    public void searchAndEditFunction(String searchText, String newText) {
        findAndSendKeysFunction("searchInput", searchText);
        findAndClickFunction("searchButton");

        waitUntilButtonClickable(searchButton);

        findAndClickFunction("editButton");
        findAndSendKeysFunction("nameInput", newText);
        findAndClickFunction("saveButton");
    }

    public void searchAndDeleteFunction(String searchText) {
        findAndSendKeysFunction("searchInput", searchText);
        findAndClickFunction("searchButton");

        waitUntilButtonClickable(searchButton);

        findAndClickFunction("deleteButton");
        findAndClickFunction("deleteDialogButton");
    }

    public void editAndDeleteFunction(String subjectName, String editorDelete){
/*
        if (successMessage.isDisplayed()){
            WebDriverWait wait = new WebDriverWait(GeneralWebDriver.getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.invisibilityOf(successMessage));
        }
 */
        List<WebElement> btnList;

        if (editorDelete.equalsIgnoreCase("delete"))
            btnList = waitUntilVisibleListAllElement(deleteButtonList);
        else
            btnList = waitUntilVisibleListAllElement(editButtonList);


        List<WebElement> newNameList = waitUntilVisibleListAllElement(nameList);

        for (int i = 0; i < newNameList.size(); i++) {

            if (newNameList.get(i).getText().equalsIgnoreCase(subjectName)){
                clickFunction(btnList.get(i));
                clickFunction(deleteDialogButton);
                break;
            }
        }
    }

    public void clickEscape(){
        Actions actions = new Actions(GeneralWebDriver.getDriver());
        Action action = actions
                .keyDown(Keys.ESCAPE)
                .keyUp(Keys.ESCAPE)
                .build();
        action.perform();
    }

    public void selectUserType(String userType){
        for (WebElement option: userTypeAllOptions) {
            if (option.getText().contains(userType)){
                clickFunction(option);
                break;
            }
        }
    }
}
