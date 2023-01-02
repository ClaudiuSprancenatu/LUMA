package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PageObjectManager;

public class BaseTests {

    private WebDriver driver;

    public PageObjectManager pages;
@BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento2.algolia.com/");
        pages = new PageObjectManager(driver);
    }
//@AfterMethod
//    public void TearDown() {
//        driver.quit();
//    }

}
