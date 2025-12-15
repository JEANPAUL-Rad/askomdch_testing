package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By regUsernameField = By.id("reg_username");
    private By regEmailAddressField = By.id("reg_email");
    private  By regPasswordField = By.id("reg_password");
    private By registerButton = By.name("register");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String regUsername){
        driver.findElement(regUsernameField).sendKeys(regUsername);

    }

    public void setEmail(String regEmail){
        driver.findElement(regEmailAddressField).sendKeys(regEmail);
    }

    public void setPassword(String regPassword){
        driver.findElement(regPasswordField).sendKeys(regPassword);
    }

    public Dashboardpage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new Dashboardpage(driver);
    }

}
