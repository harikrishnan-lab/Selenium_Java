package org.example.pageClass;

import org.example.utils;
import org.openqa.selenium.WebElement;

public class LoginPage extends utils {
    public void element(){
        WebElement username = elementLocator("id", "user-name");
    }
}
