package pom.shoppingApp;


import pom.shoppingApp.pageclass.LoginPage;

public class Test extends BaseTest{
    public void testMethod(){
       setUp();
       loginPage.enterUsername();
       loginPage.enterPassword();
       loginPage.clickLogin();
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.testMethod();
    }
}
