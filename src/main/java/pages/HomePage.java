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

    public void iCheckTheSuccessLogin() {
        browser.iCheckTheSuccessLogin();
    }

}
