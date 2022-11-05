package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {

    private final By viewCartLink = By.cssSelector("a[title='View cart']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }


    private By getAddToCartButtonElement(String productName){

        return By.cssSelector("a[aria-label='Add “"+ productName +"” to your cart']");
    }


    public HomePage clickAddToCartButton(String productName){


        By addToCartButton = getAddToCartButtonElement(productName);
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();

        return this;
    }


    public CartPage clickViewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();

        return new CartPage(driver);
    }


}
