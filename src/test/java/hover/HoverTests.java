package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;
import pages.StorePage;

import java.util.function.Supplier;

public class HoverTests extends BaseTests {
@Test
public void testAddToCartAndHoverForMultipleSections() {

    Supplier<StorePage>[] storeLinks = new Supplier[]{
            homepage::clickStoreLink,
            homepage::clickMenLink,
            homepage::clickWomenLink,
            homepage::clickAccessoriesLink

    };

    for (Supplier<StorePage> storeLink : storeLinks) {

        StorePage storePage = storeLink.get();
        storePage.clickAddToCartButton();

        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        boolean isHovered = hoverPage.hoverCartIcon();

        Assert.assertTrue(isHovered, "Mini cart was not displayed after hovering");
    }
}
}