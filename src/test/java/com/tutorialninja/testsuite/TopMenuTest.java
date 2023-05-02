package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {


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
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        desktopPage.mouseHoverLaptopsAndNotebooks();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = desktopPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText, "Show All Laptops & Notebooks page not found");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        desktopPage.mouseHoverComponents();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = desktopPage.getComponentsText();
        Assert.assertEquals(actualText, expectedText, "Show All Components page not found");
    }

}
