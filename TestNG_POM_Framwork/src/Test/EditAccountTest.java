package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditAccountTest extends BaseDriverClass {
//driver ve before method  çekmek için extends class yaptım
    //Önce Class declare ettim!  ki diğer classlardan veri çekebileyim
    HomePageElementsClass homePageElements;
    LoginPageElementsClass loginPageElements;
    MyAccountPageElements myAccountPageElements;

    String expectedMessage= "Success: Your account has been successfully updated.";



    @Test
    public void editAccountTest(){

        //yukarıda isim verdiğim classlar için NEW Object create ettim ki metodla kullanabileyim

        homePageElements = new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements= new MyAccountPageElements(driver);


        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
        loginPageElements.loginButton.click();

        //header text'i doğru mu check etmek için test ediyorum
        String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
        System.out.println(myAccountHeaderText);
        String expected="My Account";
        Assert.assertEquals(myAccountHeaderText,expected);

        myAccountPageElements.editAccountButton.click();

        myAccountPageElements.firstNameInput.clear();
        myAccountPageElements.firstNameInput.sendKeys("Kevin");


        myAccountPageElements.lastNameInput.clear();
        myAccountPageElements.lastNameInput.sendKeys("Lastname");

        myAccountPageElements.continueButton.click();

        Assert.assertTrue(myAccountPageElements.successMessage.isDisplayed());
        Assert.assertEquals(myAccountPageElements.successMessage.getText(),expectedMessage);



    }

    }





