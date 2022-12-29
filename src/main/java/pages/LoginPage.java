package pages;

import framework.BasePage;

public class LoginPage {
    private BasePage browser;
    public LoginPage(BasePage browser) {
        this.browser = browser;
    }

    public void iCanSeeLogInPage() {
        browser.iCanSeeLogInPage();
    }

    public void iLoginIn(String email, String password) {
        browser.iLoginIn(email, password);
    }
}
