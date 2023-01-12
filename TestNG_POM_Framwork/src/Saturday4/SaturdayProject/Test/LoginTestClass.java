package Saturday4.SaturdayProject.Test;

import Saturday4.SaturdayProject.Driver.DriverClass;
import Saturday4.SaturdayProject.POM.SaturdayHomePageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayLoginPageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayMyAccountPageElements;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestClass extends DriverClass {

    SaturdayHomePageElementsClass saturdayHomePageElementsClass;
    SaturdayMyAccountPageElements saturdayMyAccountPageElements;

    SaturdayLoginPageElementsClass saturdayLoginPageElementsClass;

    @Test
    @Parameters({"email","password"})
    public void loginTest(String email, String password){

        saturdayHomePageElementsClass= new SaturdayHomePageElementsClass(driver);
        saturdayMyAccountPageElements= new SaturdayMyAccountPageElements(driver);
        saturdayLoginPageElementsClass=new SaturdayLoginPageElementsClass(driver);

        saturdayHomePageElementsClass.signInButton.click();
        saturdayLoginPageElementsClass.loginEmail.sendKeys(email);
        saturdayLoginPageElementsClass.loginPassword.sendKeys(password);
        saturdayLoginPageElementsClass.loginButton.click();

        String actualURL= driver.getCurrentUrl();
        String expectedURL="http://automationpractice.com/index.php?controller=my-account";

        Assert.assertEquals(actualURL,expectedURL);





    }



}
