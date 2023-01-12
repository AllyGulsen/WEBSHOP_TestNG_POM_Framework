package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscribeTestClass extends BaseDriverClass {

    String expectedMessage="Success: Your newsletter subscription has been successfully updated!";

    HomePageElementsClass homePageElements;
    LoginPageElementsClass loginPageElements;
    MyAccountPageElements myAccountPageElements;

    @Test
    public void subscribeTest(){

        homePageElements= new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements=new MyAccountPageElements(driver);


        // yarattığım objectler ile onun altındaki webElementleri çağırırak işlem yapıcam

        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
        loginPageElements.loginButton.click();

        //header text'i doğru mu check etmek için test ediyorum
        String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
        System.out.println(myAccountHeaderText);
        String expected="My Account";

        myAccountPageElements.newsletterButton.click();
        myAccountPageElements.subscribeYesRadioButton.click();
        myAccountPageElements.continueButton.click();


        Assert.assertTrue(myAccountPageElements.successMessage.isDisplayed());
        Assert.assertEquals(myAccountPageElements.successMessage.getText(), expectedMessage);







    }



}
