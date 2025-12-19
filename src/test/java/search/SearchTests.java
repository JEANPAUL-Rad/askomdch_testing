package search;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    @Test
    public void testMultipleQuantitiesAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.getSearchButton();
        productPage.setQuantityInput("5");
        productPage.increaseQuantity(5);
        productPage.decreaseQuantity(2);
        productPage.clickAddToCartButton();
        Assert.assertEquals(
                productPage.getCurrentQuantity(),
                "3",
                "Quantity behavior after arrow operations is incorrect"
        );

    }

}
