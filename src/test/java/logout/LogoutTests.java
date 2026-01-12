package logout;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Dashboardpage;
import pages.LoginPage;
import pages.LogoutPage;

import static org.testng.Assert.assertTrue;

public class LogoutTests extends BaseTests {
    @Test
    public void successfulLogout(){
        LoginPage loginPage = homepage.ClickAccountLinkButtonToLogin();
        loginPage.loginUsernameOrEmail("paul");
        loginPage.loginPassword("123");
        Dashboardpage dashboardpage = loginPage.loginButton();

        LogoutPage logoutPage = dashboardpage.logout();
        logoutPage.clickLogoutButtons();


        assertTrue(driver.getCurrentUrl().contains("account"), "User is not directed to login page after logout");

    }

}
