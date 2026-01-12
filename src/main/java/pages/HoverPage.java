package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HoverPage {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    private By cartIcon = By.className("count");
    private By viewCartButton = By.linkText("VIEW CART");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public boolean hoverCartIcon() {
        try {
            WebElement cartElement = driver.findElement(cartIcon);
            actions.moveToElement(cartElement).perform();

            Thread.sleep(500);

            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(viewCartButton)
            ).isDisplayed();
        } catch (TimeoutException | InterruptedException e) {
            return false;
        }
    }
}

