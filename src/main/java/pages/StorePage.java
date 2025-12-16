package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By getAddToCartButton = By.cssSelector(".add_to_cart_button");

    public StorePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickAddToCartButton(){
        driver.findElement(getAddToCartButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
