package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void Setup(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver rawDriver = new ChromeDriver(options);
        driver = new EventFiringDecorator().decorate(rawDriver);
        goHome();
        homepage = new HomePage(driver);

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://askomdch.com/");
    }

    @AfterClass

    public void tearDown(){
        //driver.quit();
    }

}
