package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    private WebDriver driver;
    private By getLoginButton = By.cssSelector(".woocommerce-MyAccount-navigation-link--customer-logout");

    public LogoutPage(WebDriver driver){
        this.driver = driver;
    }


    public LoginPage clickLogoutButtons(){
        WebElement button = driver.findElement(getLoginButton);
        button.click();
        return new LoginPage(driver);
    }

}
