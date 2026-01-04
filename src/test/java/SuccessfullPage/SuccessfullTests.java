package SuccessfullPage;

import base.BaseTests;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class SuccessfullTests extends BaseTests {
    @Test
    public void CheckSuccessCheckout(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Anchor Bracelet");

        ProductPage productPage = searchPage.clickSearchButton();
        productPage.clickAddToCartButton();


        CartPage cartPage = searchPage.clickOnCartIcon();
        CheckoutPage checkoutPage = cartPage.clickProceedToCheckout();


        assertTrue(checkoutPage.isOnCheckoutPage(), "Not on checkout page");


        checkoutPage.selectCountry("Rwanda");
        checkoutPage.setFirstName("Paul");
        checkoutPage.setLastName("Musa");
        checkoutPage.setCompanyName("Nkusi Ltd");
        checkoutPage.setStreetAddress("KN 45 Street");
        checkoutPage.setTown("Kigali");
        checkoutPage.setState("Kigali");
        checkoutPage.setPostCode("00000");
        checkoutPage.setPhone("+250780097403");
        checkoutPage.setEmail("musa@gmail.com");

        checkoutPage.selectCashOnDelivery();
        //checkoutPage.clickPlaceOrder();
        ViewSuccessfulOrderPage viewSuccessfulOrderPage = checkoutPage.clickPlaceOrder();
        assertTrue(viewSuccessfulOrderPage.isOrderSuccessful(),
                "Thank you. Your order has been received.");

    }

}
