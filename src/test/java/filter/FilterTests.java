package filter;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FilterByPriceRangePage;
import pages.StorePage;

public class FilterTests extends BaseTests {

    @Test
    public void successfullFilter(){
        StorePage storePage = homepage.clickStoreLink();
        FilterByPriceRangePage filterByPriceRangePage = storePage.getFilterPage();
        filterByPriceRangePage.setPriceRange(80,100);

    }
}
