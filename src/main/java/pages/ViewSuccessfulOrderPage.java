package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewSuccessfulOrderPage {

private WebDriver driver;
private WebDriverWait wait;

private By thankYOuparagraph = By.cssSelector(".woocommerce-notice.woocommerce-notice--success");

public ViewSuccessfulOrderPage(WebDriver driver){
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

public boolean isOrderSuccessful(){
     WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(thankYOuparagraph));
    return element.isDisplayed();
}


}
