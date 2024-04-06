package Pages;

import Utilities.GeneralWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    WebElement myElement;

    public LeftNav() {
        PageFactory.initElements(GeneralWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement cities;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement educationSetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Salary']")
    private WebElement salary;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResourcesSetup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement salaryTypes;

    @FindBy(xpath = " //span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenship;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Messaging']")
    private WebElement messaging;

    @FindBy(xpath = "//span[text()='Notifications']")
    private WebElement notifications;

    @FindBy(xpath = "//span[text()='Dashboard ']")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement itemCategory;

    @FindBy(xpath = "//span[text()='Notation Keys']")
    private WebElement notationKeys;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Custom Fields']")
    public WebElement customFields;

    public void findAndClickFunction(String elementName) {
        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "countries":
                myElement = countries;
                break;

            case "cities":
                myElement = cities;
                break;

            case "education":
                myElement = education;
                break;

            case "educationSetup":
                myElement = educationSetup;
                break;

            case "subjectCategories":
                myElement = subjectCategories;
                break;

            case "humanResources":
                myElement = humanResources;
                break;

            case "salary":
                myElement = salary;
                break;

            case "positionSalary":
                myElement = positionSalary;
                break;

            case "humanResourcesSetup":
                myElement = humanResourcesSetup;
                break;

            case "positions":
                myElement = positions;
                break;

            case "salaryTypes":
                myElement = salaryTypes;
                break;

            case "bankAccounts":
                myElement = bankAccounts;
                break;

            case "citizenship":
                myElement = citizenship;
                break;

            case "nationalities":
                myElement = nationalities;
                break;

            case "fees":
                myElement = fees;
                break;

            case "discounts":
                myElement = discounts;
                break;

            case "gradeLevels":
                myElement = gradeLevels;
                break;

            case "documentTypes":
                myElement = documentTypes;
                break;

            case "messaging":
                myElement = messaging;
                break;

            case "notifications":
                myElement = notifications;
                break;

            case "dashboard":
                myElement = dashboard;
                break;

            case "inventory":
                myElement = inventory;
                break;

            case "setupButtonUnderInventory":
                myElement = setupButtonUnderInventory;
                break;

            case "itemCategory":
                myElement = itemCategory;
                break;

            case "notationKeys":
                myElement = notationKeys;
                break;

            case "attestations":
                myElement = attestations;
                break;

            case "positionCategories":
                myElement = positionCategories;
                break;

            case "schoolSetup":
                myElement = schoolSetup;
                break;

            case "locations":
                myElement = locations;
                break;

            case "departments":
                myElement = departments;
                break;

            case "customFields":
                myElement = customFields;
                break;
        }
        clickFunction(myElement);
    }
}
