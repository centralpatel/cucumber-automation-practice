package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createEmailAcc;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAcc;
    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Your personal information']")
    WebElement personalInfo;
    @CacheLookup
    @FindBy(xpath = "//input[@name='id_gender']")
    List<WebElement> gender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement secondNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement secondLastField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCodeField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAddField;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement myAccount;

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Sending text to Firstname Field : " + firstNameField.toString());

    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Sending text to Lastname Field : " + lastNameField.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Sending text to Email Field : " + emailField.toString());
    }
    public void enterEmailCreatePage(String email) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(createEmailAcc, randomInt + email);
        log.info("Sending text to Email Field : " + createEmailAcc.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Sending text to password field : " + passwordField.toString());
    }

    public void enterSecondName(String name) {
        sendTextToElement(secondNameField, name);
        log.info("Sending text to Firstname Field : " + secondNameField.toString());
    }

    public void enterSecondLast(String last) {
        sendTextToElement(secondLastField, last);
        log.info("Sending text to Lastname Field : " + secondLastField.toString());
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
        log.info("Sending text to Address Field : " + addressField.toString());
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
        log.info("Sending text to city Field : " + cityField.toString());
    }

    public void enterState(String state) {
        selectByVisibleTextFromDropDown(stateField, state);
        log.info("Selecting text from State Field : " + stateField.toString());
    }

    public void enterZipCode(String zipCode) {
        sendTextToElement(zipCodeField, zipCode);
        log.info("Sending text to Zipcode Field : " + zipCodeField.toString());
    }

    public void enterMobile(String mobile) {
        sendTextToElement(mobileField, mobile);
        log.info("Sending text to Mobile Field : " + mobileField.toString());
    }

    public void enterAssignAdd(String assignAdd) {
        sendTextToElement(assignAddField, assignAdd);
        log.info("Sending text to Assign Field : " + assignAddField.toString());
    }

    public void clickRegister() {
        clickOnElement(register);
        log.info("Clicking on register link : " + register.toString());
    }

    public String verifyMyAccount() {
       String message = getTextFromElement(myAccount);
        log.info("Getting text from : " + myAccount.toString());
        return message;
    }
}
