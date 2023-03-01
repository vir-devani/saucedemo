package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    WebElement backpack;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    WebElement productText;

    @CacheLookup
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;


    public void clickOnBagPack() {
        log.info("Clicking on bagpack : " + backpack.toString());
        clickOnElement(backpack);
    }

    public String getProductLable() {
        return getTextFromElement(productText);
    }

    public void clickOnAddToCartButton() {
        log.info("Clicking on add to cart button : " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void clickOnShoppingCartIcon() {
        log.info("Clicking on shopping cart icon  : " + cartIcon.toString());
        clickOnElement(cartIcon);
    }
}