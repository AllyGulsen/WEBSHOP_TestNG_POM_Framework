package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactUsFunctionTest extends BaseDriverClass {

    HomePageElementsClass homePageElements;
    LoginPageElementsClass loginPageElements;
    MyAccountPageElements myAccountPageElements;

    @Test
    @Parameters({"enquiry"})
    public void contactUsFuntionTest(String enquiry){
        //DİKKAT YUKARIDA STRING ENQUIRY İLE PARAMETERIZE ETTIM METODU VE @PARAMETERS'A AYNI ŞEYİ YAZDIM!

        homePageElements = new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements=new MyAccountPageElements(driver);

        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
        loginPageElements.loginButton.click();

        String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
        System.out.println(myAccountHeaderText);
        Assert.assertEquals(myAccountHeaderText,"My Account");

        homePageElements.contactUsButton.click();
        //YUKARIDA METOD İÇİNDE TANIMLADIĞIM PARAMETREYİ BURADA KULLANIYORUM
        homePageElements.enquiryInput.sendKeys(enquiry );
        homePageElements.submitButton.click();

        //şimdi current URL alıp içinde success ibaresi var mı test edicez
        String currentURL= driver.getCurrentUrl();

        Assert.assertTrue(currentURL.contains("success"));


}
}