package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By getCartIcon = By.className("count");

    public HoverPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void hoverCartIcon(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(getCartIcon));

        WebElement element = driver.findElement(getCartIcon);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("✅ Hover completed successfully!");
    }



}
