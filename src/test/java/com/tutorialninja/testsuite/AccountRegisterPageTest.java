package com.tutorialninja.testsuite;

import com.tutorialninja.pages.AccountRegisterPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountRegisterPageTest extends BaseTest {
    AccountRegisterPage accountRegisterPage=new AccountRegisterPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        accountRegisterPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");
        //1.3  Verify the text “Register Account”
        String expectedText = "Register Account";
        String actualText = accountRegisterPage.getRegisterAccountText();
        Assert.assertEquals(actualText, expectedText,"Register page not displayed");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Click on My Account Link.
        accountRegisterPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");
        //3.3 Enter First Name
        accountRegisterPage.typeFirstName();
        //3.4 Enter Last Name
        accountRegisterPage.typeLastName();
        //3.5 Enter Email
        accountRegisterPage.typeEmail();
        //3.6 Enter Telephone
        accountRegisterPage.typeTelephone();
        //3.7 Enter Password
        accountRegisterPage.typePassword();
        //3.8 Enter Password Confirm
        accountRegisterPage.typeConfirmPassword();
        //3.9 Select Subscribe Yes radio button
        accountRegisterPage.clickSubscribe();
        //3.10 Click on Privacy Policy check box
        accountRegisterPage.clickOnPrivacy();
        //3.11 Click on Continue button
        accountRegisterPage.clickOnContinue();
        //3.12 Verify the message “Your Account Has Been Created!”
        String expectedYourAccountCreatedText = "Your Account Has Been Created!";
        String actualYourAccountCreatedText = accountRegisterPage.getYourAccountCreatedText();
        assertEquals(actualYourAccountCreatedText, expectedYourAccountCreatedText, "My Account page error");
        Thread.sleep(2000);
//        verifyText(driver, By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"),"Your Account Has Been Created!");
        //3.13 Click on Continue button
        accountRegisterPage.clickOnContinue2();
        //3.14 Click on My Account Link.
        accountRegisterPage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        String expectedLogoutText = "Account Logout";
        String actualLogoutText = accountRegisterPage.getLogoutText();
        assertEquals(actualLogoutText, expectedLogoutText, "Logout message not displayed");
        //verifyText(driver,By.xpath("//h1[normalize-space()='Account Logout']"),"Account Logout");
        //3.17 Click on Continue button
        accountRegisterPage.clickOnContinue2();
    }

}

