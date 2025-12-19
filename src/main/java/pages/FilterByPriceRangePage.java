package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class FilterByPriceRangePage {
    private WebDriver driver;
    private JavascriptExecutor js;

    private By filterButton = By.className("button");
    private By priceSliderForm = By.className("price_slider_wrapper");
    private By minPriceInput = By.id("min_price");
    private By maxPriceInput = By.id("max_price");
    private By productPrices = By.cssSelector("ul.products li.product .woocommerce-Price-amount");

    public FilterByPriceRangePage(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public int [] setPriceRange(int minPrice, int maxPrice){
        WebElement priceRangeForm = driver.findElement(priceSliderForm);
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});"
                +"document.getElementById('min_price').value=arguments[1];"
                +"document.getElementById('max_price').value=arguments[2]",priceRangeForm,minPrice,maxPrice

        );

        int min = Integer.parseInt(driver.findElement(minPriceInput).getAttribute("value"));
        int max = Integer.parseInt(driver.findElement(maxPriceInput).getAttribute("value"));

        driver.findElement(filterButton).click();
        return new int []{min, max};

    }


    public List<Double> getDisplayedProductPrices() {
        List<WebElement> priceElements =
                driver.findElements(productPrices);

        List<Double> prices = new ArrayList<>();

        for (WebElement price : priceElements) {
            String text = price.getText().replace("$", "").trim();
            prices.add(Double.parseDouble(text));
        }

        return prices;
    }




}
