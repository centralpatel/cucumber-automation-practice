package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    WebElement dresses;
    @CacheLookup
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']")
    WebElement tshirts;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']")
    List<WebElement> topMenuList;


    public void clickOnWomenLink() {
        clickOnElement(women);
        log.info("Clicking on Women link : " + women.toString());
    }

    public void clickOnDressesLink() {
        clickOnElement(dresses);
        log.info("Clicking on Dresses link : " + dresses.toString());
    }

    public void clickOnTshirtsLink() {
        clickOnElement(tshirts);
        log.info("Clicking on Tshirts link : " + tshirts.toString());

    }

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
        log.info("Clicking on Signin link : " + signInLink.toString());
    }

    public String verifyLogo() {
        String message = getTextFromElement(logo);
        log.info("Getting text from : " + logo.toString());
        return message;
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
