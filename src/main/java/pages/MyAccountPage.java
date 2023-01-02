package pages;

import framework.BasePage;

public class MyAccountPage {

    private BasePage browser;

    public MyAccountPage(BasePage browser){
        this.browser = browser;
    }

    public void iCanSeeMyAccountPage() {
        browser.iCanSeeMyAccountPage();
    }

}
