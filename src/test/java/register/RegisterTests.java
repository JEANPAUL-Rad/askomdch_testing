package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Dashboardpage;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {
    @Test
    public void testSuccessfulRegister(){
        RegisterPage register = homepage.ClickAccountLinkButton();
        register.setUsername("paul");
        register.setEmail("uy60@gmail.com");
        register.setPassword("123");
        Dashboardpage dashboardpage = register.clickRegisterButton();
        System.out.println("The output is:" + dashboardpage);
    }
}
