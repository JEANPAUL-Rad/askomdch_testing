package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By getUsernameToLoginField = By.id("username");
    private By getPasswordToLoginField = By.id("password");
    private By clickLoginButton = By.name("login");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginUsernameOrEmail(String username){
        driver.findElement(getUsernameToLoginField).sendKeys(username);
    }
    public void loginPassword(String password){
        driver.findElement(getPasswordToLoginField).sendKeys(password);
    }

    public Dashboardpage loginButton(){
        driver.findElement(clickLoginButton).click();
        return new Dashboardpage(driver);
    }

}
