package store;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.StorePage;

public class StoreTests extends BaseTests {
    @Test
    public void successfulStore(){
        StorePage storePage = homepage.clickStoreLink();
        storePage.clickAddToCartButton();
    }
    @Test
    public void successfulMen(){
        StorePage storePage = homepage.clickMenLink();
        storePage.clickAddToCartButton();
    }
    @Test
    public void successfulWomen(){
        StorePage storePage = homepage.clickWomenLink();
        storePage.clickAddToCartButton();
    }
    @Test
    public void successfulAccessories(){
        StorePage storePage = homepage.clickAccessoriesLink();
        storePage.clickAddToCartButton();
    }



}
