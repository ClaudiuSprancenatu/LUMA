import base.BaseTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class LumaTests extends BaseTests {

    private HomePage homePage;

    @BeforeMethod
    public void setPages() {
        homePage = pages.getHomePage();
    }

    @Test
    public void testLuma() {

    }
}
