package checkout;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductPage;
import pages.SearchPage;

public class CheckOutTests extends BaseTests {

    @Test
    public void successfulCheckout() {


        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Anchor Bracelet");

        ProductPage productPage = searchPage.clickSearchButton();
        productPage.clickAddToCartButton();


        CartPage cartPage = searchPage.clickOnCartIcon();
        CheckoutPage checkoutPage = cartPage.clickProceedToCheckout();


        Assert.assertTrue(checkoutPage.isOnCheckoutPage(), "Not on checkout page");


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
        checkoutPage.clickPlaceOrder();

    }
}
