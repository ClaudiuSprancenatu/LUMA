package pages;

import framework.BasePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private BasePage basePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private TeesPage teesPage;

    private ProductPage productPage;

    public PageObjectManager(WebDriver driver) {
        basePage = new BasePage(driver);
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(basePage) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(basePage) : loginPage;
    }
    public MyAccountPage getMyAccountPage() {
        return (myAccountPage == null) ? myAccountPage = new MyAccountPage(basePage) : myAccountPage;
    }

    public TeesPage getTeesPage() {
        return (teesPage == null) ? teesPage = new TeesPage(basePage) : teesPage;
    }
    public ProductPage getProductPage () {
        return (productPage == null) ? productPage = new ProductPage(basePage) : productPage;
    }
}
