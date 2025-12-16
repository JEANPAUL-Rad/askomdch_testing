package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
private WebDriver driver;

public HomePage(WebDriver driver){
    this.driver = driver;
}

public void clickLinks(String linkText){
    driver.findElement(By.linkText(linkText)).click();
}

public RegisterPage ClickAccountLinkButton(){
    clickLinks("Account");
    return new RegisterPage(driver);
}

public LoginPage ClickAccountLinkButtonToLogin(){
    clickLinks("Account");
    return new LoginPage(driver);
}

public StorePage clickStoreLink(){
    clickLinks("Store");
    return new StorePage(driver);
}
    public StorePage clickMenLink(){
        clickLinks("Men");
        return new StorePage(driver);
    }
    public StorePage clickWomenLink(){
        clickLinks("Women");
        return new StorePage(driver);
    }
    public StorePage clickAccessoriesLink(){
        clickLinks("Accessories");
        return new StorePage(driver);
    }

public HoverPage hoveringOnCartIcon(){
return new HoverPage(driver);
}

}
