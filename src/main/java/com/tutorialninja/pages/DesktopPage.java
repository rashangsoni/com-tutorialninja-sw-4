package com.tutorialninja.pages;

import com.tutorialninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By desktop = By.xpath("//a[normalize-space()='Desktops']");

    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");

    By laptopAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");

    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    By components = By.xpath("//a[normalize-space()='Components']");

    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    By hpLP3065=By.xpath("//a[contains(text(),'HP LP3065')]");
    By hpLP3065text=By.xpath("//h1[contains(text(),'HP LP3065')]");

    By orderQty = By.xpath("//input[@id='input-quantity']");

    By addToCartButton = By.xpath("//button[@id='button-cart']");

    By successAddToCartText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//span[contains(text(),'Shopping Cart')]");

    By addedProductName = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By deliveryDate = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");

    By productModel=By.xpath("//td[contains(text(),'Product 21')]");
    By total = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]");

    public void mouseHoverDesktops(){
        mouseHoverToElementAndClick(desktop);
    }
    public void mouseHoverLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopAndNotebooks);
    }
    public void mouseHoverComponents(){
        mouseHoverToElementAndClick(components);
    }
    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }
    public String getLaptopsAndNotebooksText(){
        return getTextFromElement(laptopsAndNotebooksText);
    }
    public String getComponentsText(){
        return getTextFromElement(componentsText);
    }
    public void selectHPLP3065(){
        clickOnElement(hpLP3065);
    }
    public String getTextOfHPLP3065(){
        return getTextFromElement(hpLP3065text);
    }
    public void clearAndEnterQty(){
        clearTextFromField(orderQty);
        sendTextToElement(orderQty,"1");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getSuccessAddToCartText(){
        return getTextFromElement(successAddToCartText);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getAddedProductText(){
        return getTextFromElement(addedProductName);
    }
    public String getDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }
    public String getProductModelText(){
        return getTextFromElement(productModel);
    }
    public String getTotalText(){
        return getTextFromElement(total);
    }

}
