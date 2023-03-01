package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".title")
    WebElement cartTitle;

    @CacheLookup
    @FindBy(id = "first-name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last-name")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "postal-code")
    WebElement zipPostalCode;

    @CacheLookup
    @FindBy(id = "continue")
    WebElement continueButton;


    public String VerfiyCheckOutTitle() {
        log.info("Verifying cart title  : " + cartTitle.toString());
        return getTextFromElement(cartTitle);
    }

    public void enterFirstName() {
        log.info("Enter firstname :" + firstName.toString());
        sendTextToElement(firstName, "vir");
    }

    public void enterLastname() {
        log.info("Enter Lastname :" + lastName.toString());
        sendTextToElement(lastName, "Dev");
    }

    public void enterZipCode() {
        log.info("Enter Zip code :" + zipPostalCode.toString());
        sendTextToElement(zipPostalCode, "Sw1");
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue button :" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
