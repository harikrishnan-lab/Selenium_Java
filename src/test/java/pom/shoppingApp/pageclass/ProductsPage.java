package pom.shoppingApp.pageclass;

import org.openqa.selenium.By;

import static Utility.SeleniumUtils.clickElement;

public class ProductsPage {
    private final By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private final By boltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By cartLink = By.className("shopping_cart_link");
    private final By fleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public void clickBikeLight() {
        clickElement(bikeLight);
    }
    public void clickBoltTShirt() {
        clickElement(boltTShirt);
    }
    public void clickCartLink() {
        clickElement(cartLink);
    }
    public void clickFleeceJacket() {
        clickElement(fleeceJacket);
    }
}
