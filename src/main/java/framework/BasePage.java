package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.FrontendConstants.*;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void iClickOnLoginIn() {
        driver.findElement(new By.ByLinkText("Sign In")).click();
    }

    public void iCanSeeLogInPage() {
        String customerLogin = driver.findElement(By.xpath("//span[@class='base']")).getText();
        customerLogin.contains(LOGIN_PAGE_TITLE);
        String loginParagraphOne = driver.findElement(By.xpath("//strong[@id='block-customer-login-heading'][1]")).getText();
        loginParagraphOne.contains(LOGIN_PAGE_PARAGRAPH_ONE);
        String loginParagraphTwo = driver.findElement(By.xpath("//div[@class='field note']")).getText();
        loginParagraphTwo.contains(LOGIN_PAGE_PARAGRAPH_TWO);
        String newCustomers = driver.findElement(By.xpath("//strong[contains(text(),'New Customers')]")).getText();
        newCustomers.contains(LOGIN_PAGE_NEW_CUSTOMERS);
        String newCustomersParagraph = driver.findElement(By.xpath("//div[@class='block-content']/p[1]")).getText();
        newCustomersParagraph.contains(LOGIN_PAGE_NEW_CUSTOMERS_PARAGRAPH);
    }

    public void iLoginIn(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }

    public void iCheckTheSuccessLogin() {
        waitUntilTheElementIsVisible(By.xpath("//span[@class='logged-in'][1]"));
        String welcome = driver.findElement(By.xpath("//span[@class='logged-in'][1]")).getText();
        // #TODO The verification will be done when the MyAccount page will be done
//        welcome.contains(String.format(HOME_PAGE_WELCOME));
    }

    public void waitUntilTheElementIsVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
