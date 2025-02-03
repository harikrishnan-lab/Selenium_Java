package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class utils {
    WebDriver driver;
    String thankyouText;
    Properties p;
    public void initBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        try {
            FileInputStream f = new FileInputStream("D:/Hari/Selenium_Java/src/test/resources/config.properties");
            p = new Properties();
            p.load(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void launchUrl(String url){
        driver.get(url);
    }
    public WebElement elementLocator(String locatorType,String locator) {
        switch (locatorType) {
            case "id":
                return driver.findElement(By.id(locator));
            case "class":
                return driver.findElement(By.className(locator));
            case "xpath":
                return driver.findElement(By.xpath(locator));
            default:
                return driver.findElement(By.cssSelector(locator));
        }
    }
    public void enterText(WebElement elementLocator, String text){
        elementLocator.sendKeys(text);
    }
}
