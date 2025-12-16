package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;
import pages.StorePage;

public class HoverTests extends BaseTests {

    @Test
    public void testStoreAddToCartAndHover() {
        StorePage storePage = homepage.clickStoreLink();
        storePage.clickAddToCartButton();

        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        hoverPage.hoverCartIcon();
    }

    @Test
    public void testMenAddToCartAndHover() {
        StorePage storePage = homepage.clickMenLink();
        storePage.clickAddToCartButton();

        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        hoverPage.hoverCartIcon();
    }

    @Test
    public void testWomenAddToCartAndHover() {
        StorePage storePage = homepage.clickWomenLink();
        storePage.clickAddToCartButton();

        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        hoverPage.hoverCartIcon();
    }

    @Test
    public void testAccessoriesAddToCartAndHover() {
        StorePage storePage = homepage.clickAccessoriesLink();
        storePage.clickAddToCartButton();

        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        hoverPage.hoverCartIcon();
    }
}