package pom.shoppingApp.pageclass;

import Utility.SeleniumUtils;
import org.openqa.selenium.By;

import static Utility.SeleniumUtils.*;

public class LoginPage{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

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
