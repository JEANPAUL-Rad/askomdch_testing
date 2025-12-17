package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By product  = By.xpath("//*[@id=\"product-1205\"]/div[2]/div[1]/p");
    private By quantityInput = By.name("quantity");
    private By cartButton = By.name("add-to-cart");

    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void setQuantityInput(String quantity){
        WebElement qtyInput = driver.findElement(quantityInput);
        qtyInput.clear();
        qtyInput.sendKeys(quantity);
        System.out.println("Set quantity to " + quantity);
    }
    public void increaseQuantity(int times){
        WebElement qtyInput = driver.findElement(quantityInput);
        qtyInput.clear();
        qtyInput.click();
        for(int i =0; i<times; i++){
            qtyInput.sendKeys(Keys.ARROW_UP);
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("The increasing quantity by pressing arrow up " + times + " times");
    }

    public void decreaseQuantity(int times){
        WebElement qtyInput = driver.findElement(quantityInput);
        qtyInput.click();
        for (int i=0; i<times; i++){
            qtyInput.sendKeys(Keys.ARROW_DOWN);
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("The decreasing quantity by pressing arrow down " + times + " times");
    }

    public String getCurrentQuantity(){
        return driver.findElement(quantityInput).getAttribute("value");
    }
    public void clickAddToCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        driver.findElement(cartButton).click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String openProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(product));
        return driver.findElement(product).getText();
    }

}
