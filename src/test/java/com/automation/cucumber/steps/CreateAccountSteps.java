package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CreateAccountSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on signin link$")
    public void iClickOnSigninLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new SignInPage().enterNewAccountEmail(email);
    }

    @And("^I click on create and account button$")
    public void iClickOnCreateAndAccountButton() {
        new SignInPage().clickOnCreateAccountButton();
    }

    @Then("^I fill out all mandetory fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iFillOutAllMandetoryFields(String firstName, String lastName, String password, String name, String last, String address, String city, String state, String zipCode, String mobile, String assignAdd) {
        new CreateAccountPage().enterFirstName(firstName);
        new CreateAccountPage().enterLastName(lastName);
        new CreateAccountPage().enterPassword(password);
        new CreateAccountPage().enterSecondName(name);
        new CreateAccountPage().enterSecondLast(last);
        new CreateAccountPage().enterAddress(address);
        new CreateAccountPage().enterCity(city);
        new CreateAccountPage().enterState(state);
        new CreateAccountPage().enterZipCode(zipCode);
        new CreateAccountPage().enterMobile(mobile);
        new CreateAccountPage().enterAssignAdd(assignAdd);

    }

    @And("^I click on Register$")
    public void iClickOnRegister() {
        new CreateAccountPage().clickRegister();
    }

    @And("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String myaccount) {
        String expectedMessage = myaccount;
        String actualMessage = new CreateAccountPage().verifyMyAccount();
        Assert.assertEquals("My account not displayed", expectedMessage, actualMessage);
    }
}
