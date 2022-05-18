package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='category-name']")
    WebElement womenTxt;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Tops'][normalize-space()='Tops']")
    WebElement topsLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']")
    WebElement dressesLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']//li")
    List<WebElement> topMenuList;

    public void clickOnWomen() {
        clickOnElement(women);
        log.info("Clicking on Women link : " +women.toString());
    }

    public String verifyWomenTxt() {
        String message = getTextFromElement(womenTxt);
            log.info("Getting text from : " + womenTxt.toString());
        return message;
    }

    public void selectProduct(String text) {
        clickOnElement(productList);
        log.info("Clicking on Product link : " +productList.toString());

    }

    public void selectMenu(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                log.info("Select Menu : " + topMenuList.toString());
                break;
            }
        }
    }
}
