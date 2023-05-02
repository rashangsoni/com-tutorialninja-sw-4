package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountLoginPage extends Utility {
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By login = By.linkText("Login");
    By returningCustomerText = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By emailField = By.xpath("//input[@id='input-email']");
    By passwordField = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
    By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By logout = By.linkText("Logout");
    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    //2.1 Click on My Account Link.
    public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }
    //2.2 Call the method “selectMyAccountOptions” method and pass the parameter ““Login”
    public String getLoginText(){
        return getTextFromElement(login);
    }
    //2.3 Verify the text “Returning Customer”
    public String getReturningAccountText(){
        return getTextFromElement(returningCustomerText);
    }
    //4.3 Enter Email address
    public void typeEmail(String email){
        sendTextToElement(emailField, email);
    }
    //4.5 Enter Password
    public void typePassword(String password){
        sendTextToElement(passwordField, password);
    }
    //4.6 Click on Login button
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    //4.7 Verify text “My Account”
    public String myAccountText(){
        return getTextFromElement(myAccountText);
    }
    //4.8 Click on My Account Link.
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    public void logoutText(){

        getTextFromElement(logout);
    }
    //4.10 Verify the text “Account Logout”
    public String accountLogoutText(){
        return getTextFromElement(accountLogoutText);
    }
    //4.11 Click on Continue button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}

