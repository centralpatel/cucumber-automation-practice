package com.automation.cucumber.steps;

import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SignInSteps {
    @Then("^I should see the AUTHENTICATION message displayed$")
    public void iShouldSeeTheAUTHENTICATIONMessageDisplayed() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().verifyAuthenticationMsg();
        Assert.assertEquals("Message not displayed", expectedMessage, actualMessage);
    }

    @Then("^I enter invalid email address \"([^\"]*)\"$")
    public void iEnterInvalidEmailAddress(String username) {
        new SignInPage().enterEmail(username);
    }

    @Then("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterPassword(password);
    }

    @Then("^I click on Signin Button$")
    public void iClickOnSigninButton() {
        new SignInPage().clickOnSignInBtn();
    }


    @And("^I should see an error Message \"([^\"]*)\"$")
    public void iShouldSeeAnErrorMessage(String errormsg) {
        new SignInPage().verifyErrorMessage(errormsg);
    }

    @Then("^I enter valid email address \"([^\"]*)\"$")
    public void iEnterValidEmailAddress(String email) {
        new SignInPage().enterEmail(email);
    }

    @And("^I can see Signout link$")
    public void iCanSeeSignoutLink() {
        String expectedMessage = "Sign out";
        String actualMessage = new SignInPage().verifySignOutLink();
        Assert.assertEquals("message not displayed", expectedMessage, actualMessage);
    }

    @And("^I click on Signout link$")
    public void iClickOnSignoutLink() {
        new SignInPage().clickOnSignOut();
    }

    @And("^I can see Signin link$")
    public void iCanSeeSigninLink() {
        String expectedMessage = "Sign in";
        String actualMessage = new SignInPage().verifySignInLink();
        Assert.assertEquals("message not displayed", expectedMessage, actualMessage);
    }
}
