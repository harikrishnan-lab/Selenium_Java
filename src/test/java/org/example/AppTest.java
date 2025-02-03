package org.example;
import org.openqa.selenium.WebElement;

public class AppTest extends utils{
WebElement element;
    public void bookDress(){
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //driver.findElement(By.id("login-button")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        //driver.findElement(By.className("shopping_cart_link")).click();
        //driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
        //driver.findElement(By.id("continue-shopping")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        //driver.findElement(By.className("shopping_cart_link")).click();
        //driver.findElement(By.id("checkout")).click();
        //driver.findElement(By.id("first-name")).sendKeys("Hari");
        //driver.findElement(By.id("last-name")).sendKeys("Krishnan");
        //driver.findElement(By.id("postal-code")).sendKeys("682001");
        //driver.findElement(By.id("continue")).click();
        //driver.findElement(By.id("finish")).click();
        //thankyouText = driver.findElement(By.className("complete-header")).getText();
        //////////////////////////////
        launchUrl("https://www.saucedemo.com/");

        elementLocator("id","user-name").sendKeys("standard_user");
        elementLocator("id","password").sendKeys("secret_sauce");
        elementLocator("id","login-button").click();
        elementLocator("id","add-to-cart-sauce-labs-bike-light").click();
        elementLocator("id","add-to-cart-sauce-labs-bolt-t-shirt").click();
        elementLocator("class","shopping_cart_link").click();
        elementLocator("id","remove-sauce-labs-bolt-t-shirt").click();
        elementLocator("id","continue-shopping").click();
        elementLocator("id","add-to-cart-sauce-labs-fleece-jacket").click();
        elementLocator("class","shopping_cart_link").click();
        elementLocator("id","checkout").click();
        elementLocator("id","first-name").sendKeys("Hari");
        elementLocator("id","last-name").sendKeys("Krishnan");
        elementLocator("id","postal-code").sendKeys("682001");
        elementLocator("id","continue").click();
        elementLocator("id","finish").click();
        thankyouText = elementLocator("clas","complete-header").getText();
        System.out.println(thankyouText);
        driver.quit();
    }
    public static void main(String[] args) {
        AppTest a = new AppTest();
        a.initBrowser();
        a.bookDress();
    }
}
