package pom.shoppingApp.pageclass;

import org.openqa.selenium.By;

import static Utility.SeleniumUtils.clickElement;

public class CartPage {
    private final By removeBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By continueShopping = By.id("continue-shopping");
    private final By checkout = By.id("checkout");
    public void clickRemoveBoltTshirt() {
        clickElement(removeBoltTshirt);
    }
    public void clickContinueShopping() {
        clickElement(continueShopping);
    }
    public void clickCheckout() {
        clickElement(checkout);
    }
}
