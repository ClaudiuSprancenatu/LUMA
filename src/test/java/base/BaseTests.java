package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {

    private WebDriver driver;
@BeforeMethod
    public void SetUp() {
        System.setProperty("baseUrl", "https://magento2.algolia.com/");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
@AfterMethod
    public void TearDown() {
        driver.quit();
    }

}
