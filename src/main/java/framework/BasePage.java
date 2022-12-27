package framework;

import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private String baseUrl = System.getProperty("baseUrl", "System baseUrl is not defined");
}
