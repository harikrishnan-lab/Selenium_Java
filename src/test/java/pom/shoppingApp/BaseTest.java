package pom.shoppingApp;

import Utility.SeleniumUtils;
import pom.shoppingApp.pageclass.LoginPage;


public class BaseTest {
    LoginPage loginPage;
public void setUp(){
    loginPage = new LoginPage();
    SeleniumUtils.initialiseDriver();
    SeleniumUtils.launchUrl();
}
}
