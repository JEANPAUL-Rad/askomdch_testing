package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    @Test
    public void successfulSearchAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
//        searchPage.getSearchButton();
        ProductPage productPage = searchPage.getSearchButton();
        productPage.clickAddToCartButton();
        System.out.println(" Test completed: Search and Add to Cart");

    }

    @Test
    public void testSetQuantityAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.getSearchButton();
        productPage.setQuantityInput("5");
        productPage.clickAddToCartButton();
        System.out.println(" Test completed: Search, set and Add to Cart");
    }

    @Test
    public void testIncreaseQuantityAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.getSearchButton();
        productPage.increaseQuantity(8);
        String currentQty = productPage.getCurrentQuantity();
        System.out.println("The current quantity: " + currentQty );
        productPage.clickAddToCartButton();
        System.out.println(" Test completed: Search, increase and Add to Cart");
    }

    @Test
    public void testDecreaseQuantityAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.getSearchButton();
        productPage.setQuantityInput("5");
        productPage.decreaseQuantity(2);
        String currentQty = productPage.getCurrentQuantity();
        System.out.println("The current quantity: " + currentQty );
        productPage.clickAddToCartButton();
        System.out.println(" Test completed: Search, decrease and Add to Cart");
    }

    @Test
    public void testMultipleQuantitiesAndAddToCart(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        ProductPage productPage = searchPage.getSearchButton();
        productPage.setQuantityInput("5");
        productPage.increaseQuantity(5);
        productPage.decreaseQuantity(2);
        String currentQty = productPage.getCurrentQuantity();
        System.out.println("The current quantity: " + currentQty );
        productPage.clickAddToCartButton();
        System.out.println(" Test completed: Search, decrease and Add to Cart");
    }

}
