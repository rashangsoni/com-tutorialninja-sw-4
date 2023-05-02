package com.tutorialninja.testsuite;

import com.tutorialninja.pages.AccountLoginPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountLoginPageTest extends BaseTest {
    AccountLoginPage accountLoginPage = new AccountLoginPage();


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        accountLoginPage.clickOnMyAccount();
        selectMyAccountOptions("Login");
        //accountLoginPage.clickOnLogin();
        String expectedText = "Returning Customer";
        String actualText = accountLoginPage.getReturningAccountText();
        Assert.assertEquals(actualText,expectedText,"Returning Customer page note displayed");

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
        accountLoginPage.clickOnMyAccount();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        selectMyAccountOptions("Login");
        //4.3 Enter Email address
        accountLoginPage.typeEmail("prime123@gmail.com");
        //4.5 Enter Password
        accountLoginPage.typePassword("Prime123");
        //4.6 Click on Login button
        accountLoginPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        String expectedGetAccountLoginText = "My Account";
        String actualGetAccountLoginText = accountLoginPage.myAccountText();
        //assertEquals(actualGetAccountLoginText, expectedGetAccountLoginText , "My Account page error");

        //verifyText(driver, By.xpath("//h2[contains(text(),'My Account')]"),"My Account");
        //4.8 Click on My Account Link.
        accountLoginPage.clickOnMyAccount();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        accountLoginPage.selectMyAccountOptions("Logout");
        //4.10 Verify the text “Account Logout”
        String expectedGetAccountLogoutText = "Account Logout";
        String actualGetAccountLogoutText = accountLoginPage.accountLogoutText();
        //assertEquals(actualGetAccountLogoutText, expectedGetAccountLogoutText , "Logout was unsuccessful");
        //verifyText(driver,By.xpath("//h1[contains(text(),'Account Logout')]"),"Account Logout");
        //4.11 Click on Continue button
        accountLoginPage.clickOnContinueButton();
    }

}