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

    public void iChooseTheColor(String color) {
        browser.iChooseTheColor(color);
    }

    public void iAddToCart(Integer howManyProductsYouWantToAdd) {
        browser.iAddToCart(howManyProductsYouWantToAdd);
    }
}
