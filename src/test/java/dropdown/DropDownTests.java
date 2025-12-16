package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {

    @Test
    public void successfulDropDown(){
        DropDownPage dropDownPage = homepage.clickOnDropDown();
        dropDownPage.selectFromDropDown(3);
    }
}
