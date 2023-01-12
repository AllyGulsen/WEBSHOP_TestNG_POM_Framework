package SATURDAY_05.LastTest;

import SATURDAY_05.LastDriverClass;
import SATURDAY_05.LastPom.LastHomePageElements;
import SATURDAY_05.LastPom.LastLoginPageElementesClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LastPlaceOrderTest extends LastDriverClass {

    LastLoginPageElementesClass lastLoginPageElementesClass;
    LastHomePageElements lastHomePageElements;



    @Test
    @Parameters({"email","password","city","address1","zipcode","phonenumber"})
    public void placeOrderTest(String email, String password,String city, String address1,String zipcode,String phonenumber) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        lastHomePageElements = new LastHomePageElements(driver);
        lastLoginPageElementesClass= new LastLoginPageElementesClass(driver);

        lastLoginPageElementesClass.loginButton.click();
        lastLoginPageElementesClass.emailSpace.sendKeys(email);
        lastLoginPageElementesClass.passwordSpace.sendKeys(password);
        lastLoginPageElementesClass.submitCredentials.click();



        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        lastHomePageElements.addtoCartButton.click();

        //js.executeScript("window.scrollBy(0,500)");


        lastHomePageElements.slowRadioButton.click();
        lastHomePageElements.addToCart2.click();

        //js.executeScript("window.scrollBy(0,-500)");
        lastHomePageElements.shoppingCart.click();


        //js.executeScript("arguments[0].scrollIntoView();",lastHomePageElements.termsOfServiceCheckBox);
        lastHomePageElements.termsOfServiceCheckBox.click();


        lastHomePageElements.checkoutButton.click();

        //Select select= new Select(lastHomePageElements.countryDropdownBox);
        //select.selectByValue("0");

        //wait.until(ExpectedConditions.elementToBeClickable(lastHomePageElements.countryDropdownBox));


        //Select select2= new Select(lastHomePageElements.stateDropdownBox);
        //select2.selectByValue("1");

        //lastHomePageElements.cityInput.sendKeys(city);

        //lastHomePageElements.adress1Input.sendKeys(address1);

        //lastHomePageElements.zipCode.sendKeys(zipcode);

        //lastHomePageElements.phoneNumber.sendKeys(phonenumber);

        //lastHomePageElements.continueButton.click();

        Select select3=new Select(lastHomePageElements.billingAddressDropdown);
        select3.selectByValue("2663883");

        lastHomePageElements.billingcontinueButton.click();

        lastHomePageElements.saveShippingContinue.click();

        lastHomePageElements.shippingOption1CheckBox.click();

        lastHomePageElements.shippingContinue2.click();

        lastHomePageElements.paymentMethod1.click();

        lastHomePageElements.paymentContinue.click();

        lastHomePageElements.paymentInfoSaveButton.click();

        lastHomePageElements.confirmButton.click();

        String actualOrderSuccessMessage= lastHomePageElements.orderSuccessMessage.getText();
        String expectedOrderSuccessMessage="Your order has been successfully processed!";
        System.out.println("actual order success message: "+ actualOrderSuccessMessage);
        System.out.println("expected order success message: "+ expectedOrderSuccessMessage);

        Assert.assertTrue( lastHomePageElements.orderSuccessMessage.isDisplayed());
        Assert.assertEquals(actualOrderSuccessMessage,expectedOrderSuccessMessage);
    }

}
