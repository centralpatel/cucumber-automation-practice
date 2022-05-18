package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Authentication']")
    WebElement authenticationMsg;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement newAccountEmail;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[1]")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "\"//body/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[1]")
    List<WebElement> topMenuErrorMessage;

    public void clickOnCreateAccountButton() {
        clickOnElement(createAccountButton);
        log.info("Clicking on Create Account link : " + createAccountButton.toString());
    }

    public String verifySignOutLink(){
        log.info("verify sign Out Link "+ signOutLink.toString());
        verifyThatElementIsDisplayed(signOutLink);
        return getTextFromElement(signOutLink);
    }

    public void enterNewAccountEmail(String email) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(newAccountEmail, randomInt + email);
        log.info("Sending text to Email Field : " + newAccountEmail.toString());
    }


    public String verifySignInLink() {
        log.info("Getting link from signin Field : " + signInButton.toString());
        verifyThatElementIsDisplayed(signInButton);
        return getTextFromElement(signInButton);
    }

    public void clickOnSignOut() {
        clickOnElement(signOutLink);
        log.info("Clicking on register link : " + signOutLink.toString());
    }


    public String verifyErrorMessage(String errorMsg) {

        List<WebElement> topMenuNames = driver.findElements(By.xpath("//body/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[1]"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(errorMsg)) {
                break;
            }
        }
        return errorMsg;
    }


    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Sending text to Email Field : " + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Sending text to Password Field : " + passwordField.toString());
    }

    public void clickOnSignInBtn() {
        clickOnElement(signInButton);
        log.info("Clicking on Signin link : " + signInButton.toString());
    }

    public String verifyAuthenticationMsg() {
        String message = getTextFromElement(authenticationMsg);
        log.info("Getting text from : " + authenticationMsg.toString());
        return message;
    }

    public void getRandomEmail(String randomEmail) {
        sendTextToElement(emailField, randomEmail);
        log.info("Getting text from : " + emailField.toString());
    }
}
