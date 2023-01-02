package tests;

import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;


public class LumaTests extends BaseTests {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @BeforeMethod
    public void setPages() {
        homePage = pages.getHomePage();
        loginPage = pages.getLoginPage();
        myAccountPage = pages.getMyAccountPage();
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
    }
}
