package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static constants.FrontendConstants.*;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void iClickOn(String text) {
        waitUntilTheElementIsVisible(new By.ByLinkText(text));
        driver.findElement(new By.ByLinkText(text)).click();
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
        welcome.contains("Welcome, Sprancenatu Claudiu!");
    }

    public void waitUntilTheElementIsVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void iClickOnButton(String xpathLocator) {
        waitUntilTheElementIsVisible(By.xpath(xpathLocator));
        driver.findElement(By.xpath(xpathLocator)).click();
    }

    public void iClickOnDropDowMenu() {
        iClickOnButton("//button[contains(@class, 'action')]");
    }

    public void iCanSeeMyAccountPage() {
        waitUntilTheElementIsVisible(By.xpath("//span[@class='base']"));
        String titleMyAcountPage = driver.findElement(By.xpath("//span[@class='base']")).getText();
        titleMyAcountPage.contains(MY_ACCOUNT_TITLE);
        String titleFirstSection = driver.findElement(By.xpath("//div[@class='block block-dashboard-info']" +
                "/div[@class='block-title']/strong[1]")).getText();
        titleFirstSection.contains(MY_ACCOUNT_TITLE_FIRST_SECTION);
        String titleFirstSubsection = driver.findElement(By.xpath("//div[@class='box box-information']" +
                "/strong[@class='box-title']/span")).getText();
        titleFirstSubsection.contains(MY_ACCOUNT_TITLE_FIRST_SUBSECTION);
        String subsectionOne = driver.findElement(By.xpath("//div[@class='box box-information']" +
                "/div[@class='box-content']")).getText();
        subsectionOne.contains(MY_ACCOUNT_FIRST_SUBSECTION_1);
        String titleSecondSubsection = driver.findElement(By.xpath("//div[@class='box box-newsletter']" +
                "/strong")).getText();
        titleSecondSubsection.contains(MY_ACCOUNT_TITLE_SECOND_SUBSECTION);
        String subsectionTwo = driver.findElement(By.xpath("//div[@class='box box-newsletter']/div[1]")).getText();
        subsectionTwo.contains(MY_ACCOUNT_SECOND_SUBSECTION);
        String titleSecondSection = driver.findElement(By.xpath("//div[@class='block block-" +
                "dashboard-addresses']/div/strong")).getText();
        titleSecondSection.contains(MY_ACCOUNT_TITLE_SECOND_SECTION);
        String titleFirstSectionOne = driver.findElement(By.xpath("//div[@class='box box-billing-address']/strong")).getText();
        titleFirstSectionOne.contains(MY_ACCOUNT_TITLE_FIRST_SUBSECTION_1);
        String secondSubsectionOne = driver.findElement(By.xpath("//div[@class='box box-billing-address']" +
                "/div[@class='box-content']/address")).getText();
        secondSubsectionOne.contains(MY_ACCOUNT_SECOND_SUBSECTION_1);
        String titleAccountSubesctionTwo = driver.findElement(By.xpath("//div[@class='box box-shipping-" +
                "address']/div[1]")).getText();
        titleAccountSubesctionTwo.contains(MY_ACCOUNT_SECOND_SUBSECTION_2);
        String secondSubectionTwo = driver.findElement(By.xpath("//div[@class='box box-shipping-address']" +
                "/strong")).getText();
        secondSubectionTwo.contains(MY_ACCOUNT_TITLE_SECOND_SUBSECTION_2);
    }

    public void iNavigateViaMenu(String movePointerTo, String movePointerToCategory, String movePointerToProduct) {
        WebElement moveThePointerToMen = driver.findElement(new By.ByLinkText(movePointerTo));
        iHoverOverElement(moveThePointerToMen);
        waitUntilTheElementIsVisible(new By.ByLinkText(movePointerToCategory));
        WebElement moveThePointerToTops = driver.findElement(new By.ByLinkText(movePointerToCategory));
        iHoverOverElement(moveThePointerToTops);
        waitUntilTheElementIsVisible(new By.ByLinkText(movePointerToProduct));
        WebElement moveThePointerToTees = driver.findElement(new By.ByLinkText(movePointerToProduct));
        iHoverOverElement(moveThePointerToTees);
        moveThePointerToTees.click();
    }

    public void iHoverOverElement(WebElement locator) {
        Actions action = new Actions(driver);
        action.moveToElement(locator).perform();
    }

    public void iCanSeeTeesPage() {
        String titleTeesPage = driver.findElement(By.xpath("//span[@class='base']")).getText();
        titleTeesPage.contains(TITLE_TEES_PAGE);
    }

    public void iChooseTheColor(String color) {
        iClickOnButton("//input[@value='" + color + "']");
    }

    public void iAddToCart() {
        List<WebElement> elements = driver.findElements(By.xpath("//button[contains(@data-indexname, 'magento')]"));
        int sizeElements = elements.size();
        Random random = new Random();
        int int_random = random.nextInt(sizeElements);
        elements.get(int_random).click();
    }
}
