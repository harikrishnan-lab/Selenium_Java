package pom.shoppingApp.pageclass;

import Utility.SeleniumUtils;
import org.openqa.selenium.By;

import static Utility.SeleniumUtils.*;

public class LoginPage{
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public void enterUsername() {
        enterText(usernameField, getPropertyValue("username"));
    }

    public void enterPassword() {
        enterText(passwordField, getPropertyValue("password"));
    }

    public void clickLogin() {
        clickElement(loginButton);
    }
}
