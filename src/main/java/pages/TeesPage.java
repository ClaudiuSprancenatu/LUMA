package pages;

import framework.BasePage;

public class TeesPage {

    private BasePage browser;

    public TeesPage(BasePage browser) {
        this.browser = browser;
    }

    public void iCanSeeTeesPage() {
        browser.iCanSeeTeesPage();
    }

    public void iChooseTheColorFromFilter(String color) {
        browser.iChooseTheColorFromFilter(color);
    }

    public void iChooseAProduct() {
        browser.iChooseAProduct();
    }
}
