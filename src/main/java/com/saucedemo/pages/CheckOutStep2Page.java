package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStep2Page extends Utility {
    //logger defined to print logs

    private static final Logger log = LogManager.getLogger(CheckOutStep2Page.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page

    public CheckOutStep2Page() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Checkout: Overview')]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'SauceCard #31337')]")
    WebElement paymentInfo;

    @CacheLookup
    @FindBy(id = "finish")
    WebElement finishButton;

    public String verifyTitle() {
        return getTextFromElement(pageTitle);

    }

    public String getPaymentInfo() {
        log.info("Verify payment inforamtion" + paymentInfo.toString());
        return getTextFromElement(paymentInfo);

    }

    public void clickOnFinishButton() {
        clickOnElement(finishButton);
    }
}