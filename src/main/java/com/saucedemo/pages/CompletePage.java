package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(CompletePage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page

    public CompletePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Thank you for your order!')]")
    WebElement message;


    public String verifyThankUMessage() {
        log.info("Verifying text message : " + message.toString());
        return getTextFromElement(message);
    }
}
