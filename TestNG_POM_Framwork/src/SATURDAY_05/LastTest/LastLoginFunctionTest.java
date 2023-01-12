package SATURDAY_05.LastTest;

import SATURDAY_05.LastDriverClass;
import SATURDAY_05.LastPom.LastLoginPageElementesClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LastLoginFunctionTest extends LastDriverClass {


    LastLoginPageElementesClass lastLoginPageElementesClass;

    @Test(groups = "Positive Test")
    @Parameters({"email","password"})
    public void lastLoginPosiveTest(String email, String password){

        lastLoginPageElementesClass =new LastLoginPageElementesClass(driver);

        lastLoginPageElementesClass.loginButton.click();
        lastLoginPageElementesClass.emailSpace.sendKeys(email);
        lastLoginPageElementesClass.passwordSpace.sendKeys(password);
        lastLoginPageElementesClass.submitCredentials.click();

        String actualAccountAfterLogin= lastLoginPageElementesClass.validationAccountText.getText();
        System.out.println("Actual Account Email Validation: "+ actualAccountAfterLogin);
        String expectedAccount= "e-mail@gmail.com";

        Assert.assertEquals(actualAccountAfterLogin,expectedAccount);
    }

        @Test(groups = "Negative Test")
        @Parameters({"invalidEmail","password"})
        public void lastLoginNegativeTest(String invalidEmail,String password ){

        lastLoginPageElementesClass =new LastLoginPageElementesClass(driver);

        lastLoginPageElementesClass.loginButton.click();
        lastLoginPageElementesClass.emailSpace.sendKeys(invalidEmail);
        lastLoginPageElementesClass.passwordSpace.sendKeys(password);
        lastLoginPageElementesClass.submitCredentials.click();

        String actualInvalidCredentialsText= lastLoginPageElementesClass.invalidCredentialsText.getText();
            System.out.println("actual invalid text: "+ actualInvalidCredentialsText);

            String expectedInvalidCredentialsText="Login was unsuccessful. Please correct the errors and try again.\n" +
                    "No customer account found";

            Assert.assertTrue(lastLoginPageElementesClass.invalidCredentialsText.isDisplayed());
            Assert.assertEquals(actualInvalidCredentialsText,expectedInvalidCredentialsText);








        }







}
