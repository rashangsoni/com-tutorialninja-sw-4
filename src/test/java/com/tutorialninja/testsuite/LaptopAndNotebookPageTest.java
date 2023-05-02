package com.tutorialninja.testsuite;

import com.tutorialninja.pages.LaptopsAndNotebookPage;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class LaptopAndNotebookPageTest extends BaseTest {

    LaptopsAndNotebookPage laptopsAndNotebookPage = new LaptopsAndNotebookPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopsAndNotebookPage.mouseHooverToLaptopsAndNotebooks();
        //1.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNotebookPage.clickOnShowAllLaptopsAndNotebooks();
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebookPage.sortByPriceHighToLow();
        //    1.4 Verify the Product price will arrange in High to Low order.
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        //1.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals("Product not sorted by price High to Low",
                originalProductsPrice, String.valueOf(afterSortByPrice));

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopsAndNotebookPage.mouseHooverToLaptopsAndNotebooks();
        //2.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNotebookPage.clickOnShowAllLaptopsAndNotebooks();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebookPage.sortByPriceHighToLow();
        //2.4 Select Product “MacBook”
        laptopsAndNotebookPage.clickOnProductMacbook();
        //2.5 Verify the text “MacBook
        String expectedMacBookText = "MacBook";
        String actualMacBookText = laptopsAndNotebookPage.macBookText();
        assertEquals(expectedMacBookText, actualMacBookText, "Product name wrong");
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebookPage.clickOnAddToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!×”
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!\n×";
        String actualSuccessMessage = laptopsAndNotebookPage.successMessageText();
        assertEquals(actualSuccessMessage, expectedSuccessMessage, "Product not added to cart");
        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebookPage.clickOnShoppingCartMessage();
        //2.9 Verify the text "Shopping Cart"
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = laptopsAndNotebookPage.shoppingCartText();
        assertEquals(actualShoppingCartText, expectedShoppingCartText, "Shopping Cart empty");
        //2.10 Verify the Product name "MacBook"
        String expectedProductNameMacBookText = "MacBook";
        String actualProductMacBookText = laptopsAndNotebookPage.productNameMacBookText();
        assertEquals(actualProductMacBookText, expectedProductNameMacBookText, "Product name not found");
        //2.11 Change Quantity "2"
        laptopsAndNotebookPage.clearQuantity2FromField();
        laptopsAndNotebookPage.enterQuantity2();
        //2.12 Click on “Update” Tab
        laptopsAndNotebookPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedSuccessMessage1 = "Success: You have modified your shopping cart!\n×";
        String actualSuccessMessage1 = laptopsAndNotebookPage.successMessageText1();
        assertEquals(actualSuccessMessage1, expectedSuccessMessage1, "Shopping cart not updated");
        //2.14 Verify the Total £737.45 or $1,204.00
        String expectedTotalPrice = "$1,204.00";
        String actualTotalPrice = laptopsAndNotebookPage.totalPrice();
        assertEquals(actualTotalPrice, expectedTotalPrice, "Price not shown");
        laptopsAndNotebookPage.clickOnCheckoutButton();
        //2.16 Verify the text “Checkout”
        String expectedCheckoutText = "Checkout";
        String actualCheckoutText = laptopsAndNotebookPage.checkoutText();
        assertEquals(actualCheckoutText, expectedCheckoutText, "Checkout page not found");
        //2.17 Verify the Text “New Customer”
        String expectedNewCustomerText = "New Customer";
        String actualNewCustomerText = laptopsAndNotebookPage.newCustomerText();
        assertEquals(actualCheckoutText, expectedCheckoutText, "New Customer not found");
        //2.18 Click on “Guest Checkout” radio button
        laptopsAndNotebookPage.clickOnGuestCheckoutButton();
        //2.19 Click on “Continue” tab
        laptopsAndNotebookPage.clickOnContinueTab();
        //2.20 Fill the mandatory fields, enter email into email field
        laptopsAndNotebookPage.enterFirstName("Prime");
        laptopsAndNotebookPage.enterLastName("Testing");
        laptopsAndNotebookPage.enterEmail("prime0088@gmail.com");
        laptopsAndNotebookPage.enterPassword("Prime123456");
        laptopsAndNotebookPage.enterAddress("101,keats court, Wembley");
        laptopsAndNotebookPage.enterCity("London");
        laptopsAndNotebookPage.enterPostcode("HA0 3NZ");
        laptopsAndNotebookPage.sortByDropDownCountry("United Kingdom");
        laptopsAndNotebookPage.sortByDropDownRegion("Greater London");
        laptopsAndNotebookPage.clickOnContinueButton();
        laptopsAndNotebookPage.enterComments();
        laptopsAndNotebookPage.clickOnCheckBox();
        laptopsAndNotebookPage.clickOnContinue();
        //2.25 Verify the message Warning: Payment method required!
        String expectedWarningMessageText = "Warning: Payment method required!\n×";
        String actualWarningMessageText = laptopsAndNotebookPage.warningMessageText();
        assertEquals(actualWarningMessageText, expectedWarningMessageText, "Warning message not found");

    }

}
