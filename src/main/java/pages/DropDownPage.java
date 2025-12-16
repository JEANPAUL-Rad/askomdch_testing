package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By dropDown = By.id("product_cat");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectFromDropDown( int option){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDown));
        findDropDownElement().selectByIndex(5);
    }
    // this the helper function for selectin element in dropdown above
    public Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }
}
