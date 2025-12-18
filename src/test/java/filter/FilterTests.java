package filter;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FilterByPriceRangePage;
import pages.StorePage;

import java.util.List;

public class FilterTests extends BaseTests {

    @Test
    public void successfullFilter(){
        StorePage storePage = homepage.clickStoreLink();
        FilterByPriceRangePage filterPage = storePage.getFilterPage();

        int min = 100;
        int max = 150;
        filterPage.setPriceRange(min,max);

        List<Double> prices = filterPage.getDisplayedProductPrices();
        System.out.println("Displayed prices: " + prices);

        for (double price : prices) {
            Assert.assertTrue(
                    price >= min && price <= max,
                    "Price out of range found: " + price
            );
        }

        System.out.println("Filter works as expected");


    }
}
