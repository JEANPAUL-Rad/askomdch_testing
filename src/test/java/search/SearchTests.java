package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTests extends BaseTests {
    @Test
    public void successfulSearch(){
        SearchPage searchPage = homepage.clickOnSearch();
        searchPage.setSearchInput("Basic Blue Je");
        searchPage.getSearchButton();

    }
}
