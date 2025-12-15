package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Dashboardpage;
import pages.RegisterPage;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BaseTests {
    @Test
    public void testSuccessfulRegister(){
        RegisterPage register = homepage.ClickAccountLinkButton();
        register.setUsername("umui");
        register.setEmail("umusa0@gmail.com");
        register.setPassword("123");
        Dashboardpage dashboardpage = register.clickRegisterButton();
        System.out.println("The text paragraph is: [" + dashboardpage.getDashboardParagraph() +"]");

        assertTrue(dashboardpage.getDashboardParagraph()
                .contains("From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details."),"message incorrect");
    }
}
