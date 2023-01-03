package tests;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class LumaTests extends BaseTests {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private TeesPage teesPage;

    private ProductPage productPage;

    @BeforeMethod
    public void setPages() {
        homePage = pages.getHomePage();
        loginPage = pages.getLoginPage();
        myAccountPage = pages.getMyAccountPage();
        teesPage = pages.getTeesPage();
        productPage = pages.getProductPage();
    }

    @Test
    public void testLuma() {
        homePage.iClickOn("Sign In");
        loginPage.iCanSeeLogInPage();
        loginPage.iLoginIn("sprancenatuc@yahoo.com", "tobatama94C!");
        homePage.iCheckTheSuccessLogin();
        homePage.iClickOnDropDowMenu();
        homePage.iClickOnAccountPage("My Account");
        myAccountPage.iCanSeeMyAccountPage();
        homePage.iNavigateViaMenu("Men", "Tops", "Tees");
        teesPage.iCanSeeTeesPage();
        teesPage.iChooseTheColorFromFilter("Black");
        teesPage.iChooseAProduct();
        productPage.iChooseTheSize("M");
        productPage.iChooseTheColorOfProduct("Blue");
        productPage.iAddToCart();
    }
}
