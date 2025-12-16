package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By searchInput = By.id("woocommerce-product-search-field-0");
    private By searchButton = By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button");

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void setSearchInput(String searchWords){
        driver.findElement(searchInput).sendKeys(searchWords);
    }

    public ProductPage getSearchButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        driver.findElement(searchButton).click();
        return new ProductPage(driver);
    }
}
