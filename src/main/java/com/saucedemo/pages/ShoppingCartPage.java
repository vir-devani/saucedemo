package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    WebElement productName;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public String verifyProductName(){
        return getTextFromElement(productName);

    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }
}
