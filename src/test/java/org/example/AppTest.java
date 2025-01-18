package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest{
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

        } finally {
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.close();
        }

    }

}
