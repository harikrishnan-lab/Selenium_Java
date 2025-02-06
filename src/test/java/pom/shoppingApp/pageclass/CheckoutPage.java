package pom.shoppingApp.pageclass;

import Utility.SeleniumUtils;
import org.openqa.selenium.By;

import static Utility.SeleniumUtils.*;

public class CheckoutPage {
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    public void enterFirstName() {
        enterText(firstName,getPropertyValue("firstName"));
    }
    public void enterLastName() {
        enterText(lastName,getPropertyValue("lastName"));
    }
    public void enterPostalCode() {
        enterText(postalCode,getPropertyValue("postalCode"));
    }
    public void clickContinueButton() {
        clickElement(continueButton);
    }
}
