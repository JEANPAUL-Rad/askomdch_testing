package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private By firstName = By.id("billing_first_name");
    private By lastName = By.id("billing_last_name");
    private By companyName = By.id("billing_company");
    private By streetAddress = By.id("billing_address_1");
    private By town = By.id("billing_city");
    private By state = By.id("billing_state");
    private By postCode = By.id("billing_postcode");
    private By phone = By.id("billing_phone");
    private By email = By.id("billing_email");
    private By orderNotes = By.id("order_comments");


    private By countryDropdown = By.id("select2-billing_country-container");
    private By countrySearchInput = By.className("select2-search__field");


    private By cashOnDeliveryRadio = By.id("payment_method_cod");
    private By placeOrderButton = By.id("place_order");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isOnCheckoutPage() {
        return driver.getCurrentUrl().contains("checkout");
    }

    public void setFirstName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(name);
    }

    public void setLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void setCompanyName(String company) {
        driver.findElement(companyName).sendKeys(company);
    }

    public void setStreetAddress(String address) {
        driver.findElement(streetAddress).sendKeys(address);
    }

    public void setTown(String townName) {
        driver.findElement(town).sendKeys(townName);
    }

    public void setState(String stateName) {
        driver.findElement(state).sendKeys(stateName);
    }

    public void setPostCode(String zip) {
        driver.findElement(postCode).sendKeys(zip);
    }

    public void setPhone(String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
    }

    public void setEmail(String emailAddress) {
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void setOrderNotes(String notes) {
        driver.findElement(orderNotes).sendKeys(notes);
    }


    public void selectCountry(String country) {
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(countrySearchInput))
                .sendKeys(country + Keys.ENTER);
    }


    public void selectCashOnDelivery() {
        WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(cashOnDeliveryRadio));
        if (!radio.isSelected()) {
            radio.click();
        }
    }

    public void clickPlaceOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
    }
}
