package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By getCartIcon = By.className("count");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverCartIcon(){
        WebElement element = driver.findElement(getCartIcon);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }



}
