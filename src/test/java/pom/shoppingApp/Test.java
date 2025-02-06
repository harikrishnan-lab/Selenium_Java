package pom.shoppingApp;

public class Test extends BaseTest {
    public void testMethod() {
        setUp();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
        productsPage.clickBikeLight();
        productsPage.clickBoltTShirt();
        productsPage.clickCartLink();
        cartPage.clickRemoveBoltTshirt();
        cartPage.clickContinueShopping();
        productsPage.clickFleeceJacket();
        productsPage.clickCartLink();
        cartPage.clickCheckout();
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterPostalCode();
        checkoutPage.clickContinueButton();
        invoicePage.clickFinishButton();
        invoicePage.getThankyouText();
        closeBrowser();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testMethod();
    }
}
