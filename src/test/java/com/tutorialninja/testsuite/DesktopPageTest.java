package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPageTest extends BaseTest {
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        desktopPage.mouseHoverDesktops();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopText();
        Assert.assertEquals(actualText, expectedText, "Show All Desktop page not found");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        desktopPage.mouseHoverLaptopsAndNotebooks();
//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
//        2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = desktopPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText, "Show All Laptops & Notebooks page not found");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
//        3.1 Mouse hover on “Components” Tab and click
        desktopPage.mouseHoverComponents();
//        3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show AllComponents");
//        3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = desktopPage.getComponentsText();
        Assert.assertEquals(actualText, expectedText, "Show All Components page not found");
    }

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Mouse hover on Desktops Tab and click
        desktopPage.mouseHoverDesktops();
        //1.2 Click on “Show All Desktops”
        selectMenu("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        List<WebElement> beforeFilterNameZtoAList = driver.findElements(By.xpath("//h4"));
        List<String> beforeFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : beforeFilterNameZtoAList) {
            beforeFileNameZtoAList.add(nameZtoA.getText());
        }
        Select select = new Select(driver.findElement(By.id("input-sort")));
        select.selectByVisibleText("Name (Z - A)");
        List<WebElement> afterFilterNameZtoAList = driver.findElements(By.xpath("//h4"));
        List<String> afterFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : afterFilterNameZtoAList) {
            afterFileNameZtoAList.add(nameZtoA.getText());
        }
        //1.4 Verify the Product will arrange in Descending order.
        Collections.reverse(beforeFileNameZtoAList);
        System.out.println("Before :-" + beforeFileNameZtoAList);
        System.out.println("After :-" + afterFileNameZtoAList);
        Assert.assertEquals(beforeFileNameZtoAList, afterFileNameZtoAList);
        Thread.sleep(3000);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Desktops Tab. and click
        desktopPage.mouseHoverDesktops();
        //2.2 Click on “Show All Desktops”
        selectMenu("Show AllDesktops");
        //2.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"), "Name (A - Z)");
        // 2.4 Select product “HP LP3065”
        desktopPage.selectHPLP3065();
        //2.5 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = desktopPage.getTextOfHPLP3065();
        Assert.assertEquals(actualText, expectedText, "HP LP3065 Product Not Found");
        //2.6 Select Delivery Date "2022-11-30"
        String year = "2022";
        String month = "November";
        String date = "30";

        clickOnElement(By.xpath("//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/button[1]"));
        while (true) {
            String monthYear = driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]")).getText();
            //System.out.println(monthYear); // November 2022
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("/html/body/div[4]/div/div[1]/table/thead/tr[1]/th[3]")); // /html/body/div[4]/div/div[1]/table/thead/tr[1]/th[3]
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("/html/body/div[4]/div/div[1]/table/tbody/tr[5]/td[3]"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
//        2.7.Enter Qty "1” using Select class.
        desktopPage.clearAndEnterQty();
//        2.8 Click on “Add to Cart” button
        desktopPage.clickOnAddToCartButton();
//        2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String actualTextSuccess = desktopPage.getSuccessAddToCartText();
        String expectedTextSuccess = "Success: You have added HP LP3065 to your shopping cart!\n×";
        Thread.sleep(3000);
        Assert.assertEquals(actualTextSuccess,expectedTextSuccess,"Shopping cart empty");
//        2.10 Click on link “shopping cart” display into success message
        desktopPage.clickOnShoppingCartLink();
//        2.11 Verify the text "Shopping Cart"
        String actualShoppingCartText = desktopPage.getShoppingCartText();
        String expectedTextShoppingCart = "Shopping Cart";
        Assert.assertEquals(actualShoppingCartText,expectedTextShoppingCart,"Shopping Cart Page Not Found");
//        2.12 Verify the Product name "HP LP3065"
        String actualAddedProduct = desktopPage.getAddedProductText();
        String expectedAddedProduct = "HP LP3065";
//        2.13 Verify the Delivery Date "2022-11-30"
        String expShopCartMsg2 = "Delivery Date:2022-11-30";
        String actmsg2 = desktopPage.getDeliveryDate();
        Assert.assertEquals(expShopCartMsg2, actmsg2);
//        2.14 Verify the Model "Product21"
        String expetedProductModelText="Product 21";
        String actualProductModelText=desktopPage.getProductModelText();
        Assert.assertEquals(actualProductModelText,expetedProductModelText, "Product Model not found");
//        2.15 Verify the Todat "£74.73"
        String expectedTotal = "$122.00";
        String actualTotal = desktopPage.getTotalText();
        Assert.assertEquals(actualTotal,expectedTotal, "Total not found");

    }

}
