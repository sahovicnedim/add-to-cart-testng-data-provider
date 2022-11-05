package org.selenium.pom.test;


import org.selenium.pom.base.BaseTest;
import org.selenium.pom.dataprovider.MyDataProvider;
import org.selenium.pom.objects.Product;
import org.selenium.pom.pages.CartPage;
import org.selenium.pom.pages.HomePage;

import org.testng.Assert;

import org.testng.annotations.Test;



public class AddToCartTest extends BaseTest {

   @Test(dataProvider = "getFeaturedProducts", dataProviderClass = MyDataProvider.class)
    public void addToCart(Product product) {

       CartPage cartPage = new HomePage(driver).load().clickAddToCartButton(product.getName()).clickViewCart();
       Assert.assertEquals(cartPage.getProductName(), product.getName());

    }

}
