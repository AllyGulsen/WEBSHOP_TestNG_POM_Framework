package Saturday4.SaturdayProject.Test;

import Saturday4.SaturdayProject.Driver.DriverClass;
import Saturday4.SaturdayProject.POM.SaturdayHomePageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayLoginPageElementsClass;
import Saturday4.SaturdayProject.POM.SaturdayMyAccountPageElements;
import Saturday4.SaturdayProject.POM.SaturdayProductImagePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PlaceOrderTestClass extends DriverClass {

    String expectedOrderSuccessMessage="Your order on My Store is complete.";

    String orderReferenceText="EUXOQYXAD";
    SaturdayMyAccountPageElements saturdayMyAccountPageElements;

    SaturdayHomePageElementsClass saturdayHomePageElementsClass;
    SaturdayLoginPageElementsClass saturdayLoginPageElementsClass;

    SaturdayProductImagePage saturdayProductImagePage;

    @Test
    @Parameters({"email","password"})
    public void placeOrderTest(String email, String password) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        saturdayMyAccountPageElements= new SaturdayMyAccountPageElements(driver);
        saturdayHomePageElementsClass=new SaturdayHomePageElementsClass(driver);
        saturdayLoginPageElementsClass= new SaturdayLoginPageElementsClass(driver);

        saturdayHomePageElementsClass.signInButton.click();
        saturdayLoginPageElementsClass.loginEmail.sendKeys(email);
        saturdayLoginPageElementsClass.loginPassword.sendKeys(password);
        saturdayLoginPageElementsClass.loginButton.click();

        saturdayMyAccountPageElements.returnHomeButton.click();

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");


        Actions action= new Actions(driver);
        action.moveToElement(saturdayHomePageElementsClass.printedDressImage).perform();
        saturdayHomePageElementsClass.printedAddToCart1.click();

        saturdayHomePageElementsClass.proceedToCheckout.click();
        //wait.until(ExpectedConditions.urlContains("order"));

        saturdayHomePageElementsClass.secondProceedToCheckout.click();
        //wait.until(ExpectedConditions.urlContains("step=1"));

        saturdayHomePageElementsClass.secondProceedToCheckout.click();
        //wait.until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=order"));

        saturdayHomePageElementsClass.termsOfCond.click();
        saturdayHomePageElementsClass.secondProceedToCheckout.click();
        //wait.until(ExpectedConditions.urlContains("shipping"));

        saturdayHomePageElementsClass.payBankWire.click();
        //wait.until(ExpectedConditions.urlContains("payment"));

        saturdayHomePageElementsClass.IConfirmOrder.click();
        //wait.until(ExpectedConditions.urlContains("order-confirmation"));

        String actualOrderCompleteMessage = saturdayHomePageElementsClass.orderCompleteMessage.getText();
        String expectedOrderCompleteMessage = "Your order on My Store is complete.";
        Assert.assertEquals(actualOrderCompleteMessage, expectedOrderCompleteMessage);

        String referenceCodeAtTheEnd = saturdayHomePageElementsClass.completedTextWithReferenceCode.getText();

        js.executeScript("window.scrollBy(0,300)");
        saturdayHomePageElementsClass.myOrdersButton.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("history"));

        String referenceCodeOnOrdersPage = saturdayHomePageElementsClass.referenceCode.getText();
        System.out.println("Reference code: "+ referenceCodeOnOrdersPage);

        Assert.assertTrue(referenceCodeAtTheEnd.toLowerCase().contains(referenceCodeOnOrdersPage.toLowerCase()));








/*
        action.moveToElement(saturdayHomePageElementsClass.addToCartButton).perform();
        saturdayHomePageElementsClass.addToCartButton.click();


        saturdayHomePageElementsClass.proceedButton.click();
        saturdayHomePageElementsClass.getProceedButton2.click();
        saturdayHomePageElementsClass.proceedAddressButton.click();
        saturdayHomePageElementsClass.checkbox.click();
        saturdayHomePageElementsClass.processCarrierButton.click();
        saturdayHomePageElementsClass.payByCheckButton.click();
        saturdayHomePageElementsClass.confirmOrderButton.click();

        String actualOrderSuccesBoxText= saturdayHomePageElementsClass.orderSuccessAlertBox.getText();
        System.out.println("Actual Order success  box text" + actualOrderSuccesBoxText);
        Assert.assertEquals(actualOrderSuccesBoxText,expectedOrderSuccessMessage);

        String textContainerText= saturdayHomePageElementsClass.textContainer.getText();
        System.out.println("Text container text : "+textContainerText);



        saturdayHomePageElementsClass.myOrdersButton.click();
        String historyText= saturdayHomePageElementsClass.myOrderHistoryButton.getText();
        System.out.println("history text: "+ historyText);

        Assert.assertTrue(historyText.contains(orderReferenceText));

 */







}
}