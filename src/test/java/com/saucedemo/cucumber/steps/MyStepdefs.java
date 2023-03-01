package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^User is on the homepage$")
    public void userIsOnTheHomepage() {
    }

    @When("^User enter Username to Userfield$")
    public void userEnterUsernameToUserfield() {
        new HomePage().enterUserName("standard_user");
    }

    @And("^User enter Password to passwordfield$")
    public void userEnterPasswordToPasswordfield() {
        new HomePage().enterPassword("secret_sauce");
    }

    @And("^User click on the login button$")
    public void userClickOnTheLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @Then("^User should navigate to the products page$")
    public void userShouldNavigateToTheProductsPage() {String expectedMessage="Products";
        String actualMessage=new HomePage().getProductLable();
        Assert.assertEquals("Page is not displayed",expectedMessage,actualMessage);
    }

    @Given("^User is on the product page$")
    public void userIsOnTheProductPage() {
    }

    @When("^User click on product \"([^\"]*)\"$")
    public void userClickOnProduct(String pName)  {
        new ProductPage().clickOnBagPack();

    }

    @And("^User navigate to Sauce Labs Backpack product page$")
    public void userNavigateToSauceLabsBackpackProductPage() {
        String expectedMessage="Sauce Labs Backpack";
        String actualMessage=new ProductPage().getProductLable();
        Assert.assertEquals("Page is not displayed",expectedMessage,actualMessage);
    }



    @And("^User click on ADD TO CART button$")
    public void userClickOnADDTOCARTButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^User click on shopping cart icon$")
    public void userClickOnShoppingCartIcon() {
        new ProductPage().clickOnShoppingCartIcon();
    }

    @And("^User should see product sauce Labs Backpack added to the cart$")
    public void userShouldSeeProductSauceLabsBackpackAddedToTheCart() {
        String expectedMessage="Sauce Labs Backpack";
        String actualMessage=new ShoppingCartPage().verifyProductName();
        Assert.assertEquals("Product is not added",expectedMessage,actualMessage);
    }

    @And("^User click on CHECKOUT button$")
    public void userClickOnCHECKOUTButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^User should navigate to CHECKOUT page and see checkout information$")
    public void userShouldNavigateToCHECKOUTPageAndSeeCheckoutInformation() {
        String expectedMessage="Checkout: Your Information";
        String actualMessage=new CheckOutPage().VerfiyCheckOutTitle();
        Assert.assertEquals("Page is not displyed",expectedMessage,actualMessage);
    }

    @And("^User enter firstname to firstname field$")
    public void userEnterFirstnameToFirstnameField() {
        new CheckOutPage().enterFirstName();

    }

    @And("^User enter lastname to lastname field$")
    public void userEnterLastnameToLastnameField() {
        new CheckOutPage().enterLastname();
    }

    @And("^User enter Zip/postal code to zip/postal field$")
    public void userEnterZipPostalCodeToZipPostalField() {
        new CheckOutPage().enterZipCode();
    }

    @And("^User click on continue button$")
    public void userClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("^User navigate to CHECKOUT steps two page$")
    public void userNavigateToCHECKOUTStepsTwoPage() {
        Assert.assertEquals("Page is not displyed","Checkout: Overview",new CheckOutStep2Page().verifyTitle());

    }
    @And("^User can see payment information$")
    public void userCanSeePaymentInformation() {
        Assert.assertEquals("Payment information is not correct","SauceCard #31337",new CheckOutStep2Page().getPaymentInfo());
    }



    @And("^User click on FINISH button$")
    public void userClickOnFINISHButton() {
        new CheckOutStep2Page().clickOnFinishButton();
    }

    @Then("^User should naviagate to checkout complete page and can see Thank you for your order message$")
    public void userShouldNaviagateToCheckoutCompletePageAndCanSeeThankYouForYourOrderMessage() {
        Assert.assertEquals("Order is not successfull","Thank you for your order!",new CompletePage().verifyThankUMessage());
    }


}
