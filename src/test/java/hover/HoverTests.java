package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTests extends BaseTests {

    @Test

    public void successfulHover(){
        HoverPage hoverPage = homepage.hoveringOnCartIcon();
        hoverPage.hoverCartIcon();
    }
}
