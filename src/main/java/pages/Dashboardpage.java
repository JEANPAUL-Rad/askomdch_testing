package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
    private WebDriver driver;
    private By getDashboardPage = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]/div/p[2]");


    public Dashboardpage(WebDriver driver){
        this.driver = driver;
    }

    public String getDashboardParagraph(){
        return driver.findElement(getDashboardPage).getText();
    }
}
