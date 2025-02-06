package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class SeleniumUtils {
    public static WebDriver driver;
    private static Properties properties;
    public static void initialiseDriver() {
        String browser = getPropertyValue("browser");
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")){
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            driver = new ChromeDriver();
        }
        else {
            throw new IllegalArgumentException("Browser type not supported");
        }
    }

    public static String getPropertyValue(String key) {
        initialiseProperty();
        return properties.getProperty(key);
    }
    public static void initialiseProperty(){
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void launchUrl(){
        driver.get(getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    public static void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public static void clickElement(By locator) {
        driver.findElement(locator).click();
    }
    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

}
