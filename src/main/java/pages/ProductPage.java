package pages;

import framework.BasePage;

public class ProductPage {

    private BasePage browser;

    public ProductPage(BasePage browser) {
        this.browser = browser;
    }

    public void iChooseTheSize(String chooseTheSize) {
        browser.iChooseTheSize(chooseTheSize);
    }

    public void iChooseTheColorOfProduct(String color) {
        browser.iChooseTheColorOfProduct(color);
    }

    public void iAddToCart() {
        browser.iAddToCart();
    }
}
