import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class LumaTests extends BaseTests {

    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setPages() {
        homePage = pages.getHomePage();
        loginPage = pages.getLoginPage();
    }

    @Test
    public void testLuma() {
        homePage.iClickOnLoginIn();
        loginPage.iCanSeeLogInPage();
        loginPage.iLoginIn("sprancenatuc@yahoo.com", "tobatama94C!");
        homePage.iCheckTheSuccessLogin();
    }
}
