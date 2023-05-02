package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;



public class LaptopsAndNotebookPage extends Utility {
    By laptopsAndNotebooks = By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]");
    By showAllLaptopsAndNotebooks = By.linkText("Show AllLaptops & Notebooks");
    By priceHighToLow = By.id("input-sort");
    By productMacbook = By.linkText("MacBook");
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.id("button-cart");
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//a[contains(text(),'Shopping Cart')]");
    By productNameMacBookText = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By changeQuantity2 = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By quantity2 = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By update = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]");
    By successMessage1 = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By totalPrice = By.xpath("//tbody/tr[1]/td[6]");
    By checkout = By.xpath("//a[contains(text(),'Checkout')]");
    By checkoutText = By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckout = By.xpath("//label[normalize-space()='Guest Checkout']");
    By continueTab = By.xpath("//input[@id='button-account']");
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");
    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");
    By emailField = By.xpath("//input[@id='input-payment-email']");
    By passwordField = By.xpath("//input[@id='input-payment-telephone']");
    By addressField = By.xpath("//input[@id='input-payment-address-1']");
    By cityField = By.xpath("//input[@id='input-payment-city']");
    By postcodeField = By.xpath("//input[@id='input-payment-postcode']");
    By countryField = By.xpath("//select[@id='input-payment-country']");
    By regionField = By.xpath("//select[@name='zone_id']");
    By continueButton = By.xpath("//input[@id='button-guest']");
    By comments = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    By checkBox = By.xpath("//input[@name='agree']");
    By continueBtn = By.xpath("//input[@id='button-payment-method']");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");






    //2.1 Mouse hover on Laptops & Notebooks Tab and click
    public void mouseHooverToLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);

    }
    //2.2 Click on “Show All Laptops & Notebooks
    public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    //2.3 Select Sort By "Price (High > Low)
    public void sortByPriceHighToLow(){
        selectByVisibleTextFromDropDown(priceHighToLow, "Price (High > Low)");
    }
    //1.4 Verify the Product price will arrange in High to Low order.

    //2.4 Select Product “MacBook”
    public void clickOnProductMacbook(){
        clickOnElement(productMacbook);
    }
    //2.5 Verify the text “MacBook
    public String macBookText(){
        return getTextFromElement(macBookText);
    }

    //2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!×”
    public String successMessageText(){
        return getTextFromElement(successMessage);
    }
    //2.8 Click on link “shopping cart” display into success message
    public void clickOnShoppingCartMessage(){
        clickOnElement(shoppingCart);
    }
    //2.9 Verify the text "Shopping Cart"
    public String shoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    //2.10 Verify the Product name "MacBook"
    public String productNameMacBookText(){
        return getTextFromElement(productNameMacBookText);
    }
    //2.11 Clear Quantity "2"
    public void clearQuantity2FromField(){
        clearTextFromField(changeQuantity2);
    }
    //2.11 Change Quantity "2"
    public void enterQuantity2(){
        sendTextToElement(quantity2, "2");
    }
    //2.12 Click on “Update” Tab
    public void clickOnUpdateTab(){
        clickOnElement(update);
    }
    //2.13 Verify the message “Success: You have modified your shopping cart!”
    public String successMessageText1(){
        return getTextFromElement(successMessage1);
    }
    //2.14 Verify the Total £737.45 or $1,204.00
    public String totalPrice(){
        return getTextFromElement(totalPrice);
    }
    //2.15 Click on “Checkout” button
    public void clickOnCheckoutButton(){
        clickOnElement(checkout);
    }
    //2.16 Verify the text “Checkout”
    public String checkoutText(){
        return getTextFromElement(checkoutText);
    }
    //2.17 Verify the Text “New Customer”
    public String newCustomerText(){
        return getTextFromElement(newCustomerText);
    }
    //2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckoutButton(){
        clickOnElement(guestCheckout);
    }

    //2.19 Click on “Continue” tab
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
    //2.20 Fill the mandatory fields, enter email into email field
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void enterAddress(String address){
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city){
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode){
        sendTextToElement(postcodeField, postcode);
    }

    public void sortByDropDownCountry(String country){
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void sortByDropDownRegion(String region){
        selectByVisibleTextFromDropDown(regionField, region);
    }
    //2.21 Click on “Continue” Button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    //2.22 Add Comments About your order into text area
    public void enterComments(){
        sendTextToElement(comments, "Hi I am Prime Testing");
    }
    //2.23 Check the Terms & Conditions check box
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    //2.24 Click on “Continue” button
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
    //2.25 Verify the message “Warning: Payment method required!
    public String warningMessageText(){
        return getTextFromElement(warningMessage);
    }
}
