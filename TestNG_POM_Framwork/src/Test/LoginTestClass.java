package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestClass extends BaseDriverClass {

    //Basedriver class tan bilgi çekebilmek için yukarıda extends yaptım, bunu çekmezsem driver bile kullanamam

    //şimdi sınıflara ait web elementleri declare edip öyle test metodumu başlatıcam ve test metodum içinde yeni object yaratıcam

    HomePageElementsClass homePageElements;
    LoginPageElementsClass loginPageElements;
    MyAccountPageElements   myAccountPageElements;



    @Test
    public void loginPositiveTest(){
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

        Assert.assertEquals(myAccountHeaderText,expected);
    }

    @Test
    public void loginNegativeTest(){
        homePageElements=new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements= new MyAccountPageElements(driver);

        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("0");
        loginPageElements.loginButton.click();

        String expected= "Warning: No match for E-Mail Address and/or Password.";

        String actual= loginPageElements.warningText.getText();
        boolean isDisplayed= loginPageElements.warningText.isDisplayed();


        Assert.assertTrue(isDisplayed);
        Assert.assertEquals(actual,expected);







    }






}
