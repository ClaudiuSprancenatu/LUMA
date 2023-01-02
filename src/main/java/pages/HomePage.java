package pages;

import framework.BasePage;

public class HomePage {

    private BasePage browser;

    public HomePage(BasePage browser) {
        this.browser = browser;
    }

    public void iClickOn(String text) {
        browser.iClickOn(text);
    }

    public void iCheckTheSuccessLogin() {
        browser.iCheckTheSuccessLogin();
    }

    public void iClickOnAccountPage(String text) {
        browser.iClickOn(text);
    }

    public void iClickOnDropDowMenu() {
        browser.iClickOnDropDowMenu();
    }

    public void iNavigateViaMenu(String movePointerTo, String movePointerToCategory, String movePointerToProduct) {
        browser.iNavigateViaMenu(movePointerTo, movePointerToCategory, movePointerToProduct);
    }

}
