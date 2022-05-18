package com.automation.cucumber.steps;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WomenCategorySteps {
    @Then("^I click on Women tab$")
    public void iClickOnWomenTab() {
        new WomenCategoryPage().clickOnWomen();
    }

    @And("^I can see the women text$")
    public void iCanSeeTheWomenText() {
        String expectedMessage = "Women";
        String actualMessage = new WomenCategoryPage().verifyWomenTxt();
        Assert.assertEquals("message not displayed", expectedMessage, actualMessage);
    }

    @Then("^I click on Product \"([^\"]*)\"$")
    public void iClickOnProduct(String product) {
        new ProductPage().selectProduct(product);
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String quantity) {
        new ProductPage().enterQtyAdd(quantity);

    }

    @Then("^I can select size \"([^\"]*)\"$")
    public void iCanSelectSize(String size) {
        new ProductPage().selectSize(size);
    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
       new ProductPage().selectColour(colour);
    }

    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickAddCart();
    }

    @Then("^I can see the message \"([^\"]*)\"$")
    public void iCanSeeTheMessage(String message) {
        new ProductPage().getAlertMessage(message);
    }
    @And("^I click on the X button to close the popup window$")
    public void iClickOnTheXButtonToCloseThePopupWindow() {
        new ProductPage().clickOnCloseBtn();
    }


}
