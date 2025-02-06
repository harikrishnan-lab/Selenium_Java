package pom.shoppingApp;

import Utility.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import pom.shoppingApp.pageclass.*;

public class BaseTest extends SeleniumUtils {
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    InvoicePage invoicePage;
    public void setUp(){
    loginPage = new LoginPage();
    productsPage = new ProductsPage();
    cartPage = new CartPage();
    checkoutPage = new CheckoutPage();
    invoicePage = new InvoicePage();
    initialiseDriver();
    launchUrl();
}
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
