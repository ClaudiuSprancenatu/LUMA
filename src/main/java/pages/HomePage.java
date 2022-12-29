package pages;

import framework.BasePage;

public class HomePage {

    private BasePage browser;

    public HomePage(BasePage browser) {
        this.browser = browser;
    }

    public void iClickOnLoginIn() {
        browser.iClickOnLoginIn();
    }

    public void iCanSeeLogInPage() {
        browser.iCanSeeLogInPage();
    }

    public void iLoginIn(String email, String password) {
        browser.iLoginIn(email, password);
    }

    public void iCheckTheSuccessLogin() {
        browser.iCheckTheSuccessLogin();
    }

}
