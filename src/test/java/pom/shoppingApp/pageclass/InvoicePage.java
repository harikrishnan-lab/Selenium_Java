package pom.shoppingApp.pageclass;

import org.openqa.selenium.By;

import static Utility.SeleniumUtils.*;

public class InvoicePage {
    private final By finishButton = By.id("finish");
    private final By thankyouText = By.className("complete-header");
    public void clickFinishButton() {
        clickElement(finishButton);
    }
    public void getThankyouText(){
        System.out.println(getElement(thankyouText).getText());

    }
}
