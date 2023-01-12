package Saturday4.SaturdayProject.Test;


import Saturday4.SaturdayProject.Driver.DriverClass;
import Saturday4.SaturdayProject.POM.SaturdayHomePageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayLoginPageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayMyAccountPageElements;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactUsTestClass extends DriverClass {

    String expectedSuccessMessage="Your message has been successfully sent to our team.";

    SaturdayMyAccountPageElements saturdayMyAccountPageElements;

    SaturdayHomePageElementsClass saturdayHomePageElementsClass;
    SaturdayLoginPageElementsClass saturdayLoginPageElementsClass;

    @Test(groups="Regression")
    @Parameters({"email","password","messageParameter"})
    public void contactUsTest(String email, String password,String messageParameter){

        saturdayMyAccountPageElements= new SaturdayMyAccountPageElements(driver);
        saturdayHomePageElementsClass=new SaturdayHomePageElementsClass(driver);
        saturdayLoginPageElementsClass= new SaturdayLoginPageElementsClass(driver);

        saturdayHomePageElementsClass.signInButton.click();
        saturdayLoginPageElementsClass.loginEmail.sendKeys(email);
        saturdayLoginPageElementsClass.loginPassword.sendKeys(password);
        saturdayLoginPageElementsClass.loginButton.click();

        saturdayMyAccountPageElements.contactUsButton.click();

        Select select= new Select(saturdayMyAccountPageElements.contactDropdown);
        select.selectByVisibleText("Customer service");

        Select select2=new Select(saturdayMyAccountPageElements.orderReferenceDropdown);
        select2.selectByValue("0");

        saturdayMyAccountPageElements.messageArea.sendKeys(messageParameter);
        saturdayMyAccountPageElements.submitMessageButton.click();

        String actualSuccesAlertBoxText=saturdayMyAccountPageElements.successAlertBox.getText();
        System.out.println("Actual success alert box text: "+actualSuccesAlertBoxText);

        //wait.until(ExpectedConditions.(saturdayMyAccountPageElements.successAlertBox));

        Assert.assertEquals(actualSuccesAlertBoxText,expectedSuccessMessage);





    }




}
