package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productLable;

    public void enterUserName(String name) {
        log.info("Enter username :" + userName.toString());
        sendTextToElement(userName, name);
    }

    public void enterPassword(String password1) {
        log.info("Enter password :" + password.toString());
        sendTextToElement(password, password1);

    }

    public void clickOnLoginButton() {
        log.info("Clicking on login button : " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getProductLable() {
        log.info("Verifying product text : " + productLable.toString());
        return getTextFromElement(productLable);

    }

}
