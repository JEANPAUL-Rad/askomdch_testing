package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductPage;
import pages.SearchPage;

public class CartTests extends BaseTests {
    @Test

    public void testProceedToCheckout(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.clickSearchButton();
        productPage.clickAddToCartButton();
        CartPage cartPage = searchPage.clickOnCartIcon();
        CheckoutPage checkoutPage = cartPage.clickProceedToCheckout();

        Assert.assertTrue(checkoutPage.isOnCheckoutPage(), "The use is not redirected to cart");
    }
}
