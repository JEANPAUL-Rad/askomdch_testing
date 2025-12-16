package login;

import base.BaseTests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.Dashboardpage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);

    @Test

    public void successfullTest(){
        LoginPage login = homepage.ClickAccountLinkButtonToLogin();
        login.loginUsernameOrEmail("paul");
        login.loginPassword("123");
        Dashboardpage dashboardpage = login.loginButton();

       System.out.println("The paragraph text is: [" + dashboardpage.getDashboardParagraph() + "]" );

       assertTrue(dashboardpage.getDashboardParagraph()
               .contains("From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details."), "message incorrect");
    }
}
