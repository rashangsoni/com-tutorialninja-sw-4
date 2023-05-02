package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountRegisterPage extends Utility {
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By register = By.linkText("Register");
    By registerAccountText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By passwordConfirm = By.id("input-confirm");
    By subscribe = By.xpath("//label[normalize-space()='Yes']");
    By privacyPolicy = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By yourAccountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By logoutText = By.xpath("//h1[normalize-space()='Account Logout']");
    By login = By.xpath("//input[@value='Login']");


    public void clickOnMyAccountLink(){
        clickOnElement(myAccount);
    }
    public void selectMyAccountOptions(){
        clickOnElement(register);
    }
    //1.3 Verify the text “Register Account”
    public String getRegisterAccountText(){
        return getTextFromElement(registerAccountText);
    }

    public void typeFirstName() {
        sendTextToElement(firstName, "Prime");
    }
    public void typeLastName() {
        sendTextToElement(lastName, "Testing");
    }
    public void typeEmail() {
        sendTextToElement(email, "prime1991@gmail.com");
    }
    public void typeTelephone(){
        sendTextToElement(telephone,"01547895656");
    }
    public void typePassword() {
        sendTextToElement(password, "Prime123");
    }
    public void typeConfirmPassword(){
        sendTextToElement(passwordConfirm,"Prime123");
    }
    public void clickSubscribe(){
        clickOnElement(subscribe);
    }
    public void clickOnPrivacy(){
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void clickOnContinue2(){
        clickOnElement(continueButton2);
    }
    public String getYourAccountCreatedText(){
        return getTextFromElement(yourAccountCreatedText);

    }
    public String getLogoutText(){
        return getTextFromElement(logoutText);

    }
    public void clickOnLoginButton(){
        clickOnElement(login);
    }


}
