package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressBookFunctionTest extends BaseDriverClass {
/*
    Please automate following scenarios:
    Scenario 1 - Add New Address
    Scenario 2 - Edit Address
    Scenario 3 - Delete Address
    
 */
    String expectedMessage="Your address has been successfully added";
    String expectedMessageEdittext= "Your address has been successfully updated";

    String expectedMessageDeleteText="Your address has been successfully deleted";


    HomePageElementsClass homePageElements;
    LoginPageElementsClass loginPageElements;
    MyAccountPageElements myAccountPageElements;


    @Test
    public void addNewAddressTest(){
        homePageElements= new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements=new MyAccountPageElements(driver);

        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
        loginPageElements.loginButton.click();

        String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
        System.out.println(myAccountHeaderText);
        String expected="My Account";

        Assert.assertEquals(myAccountHeaderText,expected);

        myAccountPageElements.addressBookButton.click();
        myAccountPageElements.newAddressButton.click();

        myAccountPageElements.firstNameInput.sendKeys("Katia");
        myAccountPageElements.lastNameInput.sendKeys("Stark");
        myAccountPageElements.address1Input.sendKeys("300 wallstreet avenue");
        myAccountPageElements.cityInput.sendKeys("North");
        myAccountPageElements.postalCodeInput.sendKeys("1222222");

        Select selectCounrty= new Select(myAccountPageElements.countryDropdown);
        selectCounrty.selectByVisibleText("United States");

        Select selectState= new Select(myAccountPageElements.stateDropdown);
        selectState.selectByVisibleText("New York");

        myAccountPageElements.continueButton.click();

        Assert.assertTrue(myAccountPageElements.successMessage.isDisplayed());
        Assert.assertEquals(myAccountPageElements.successMessage.getText(),expectedMessage);
    }
        @Test
        public void editAddressTest() throws InterruptedException {
            homePageElements = new HomePageElementsClass(driver);
            loginPageElements=new LoginPageElementsClass(driver);
            myAccountPageElements= new MyAccountPageElements(driver);


            homePageElements.myAccountButton.click();
            homePageElements.loginButton.click();
            loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
            loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
            loginPageElements.loginButton.click();

            //header text'i do??ru mu check etmek i??in test ediyorum
            String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
            System.out.println(myAccountHeaderText);
            String expected="My Account";
            Assert.assertEquals(myAccountHeaderText,expected);


            myAccountPageElements.addressBookButton.click();
            //listemdeki son elementi istiyorum diyelim, size-1 ile ula????r??m(last index)

            int editButtonlistSize=myAccountPageElements.editButtonsList.size();
            System.out.println("SIZE : "+editButtonlistSize);

            myAccountPageElements.editButtonsList.get(editButtonlistSize-1).click();
            Thread.sleep(3000);

            //??u inputu de??i??tirmek i??in ??nce clear sonra g??ncelle
            myAccountPageElements.address1Input.clear();
            myAccountPageElements.address1Input.sendKeys("ALASKA STREET");
            myAccountPageElements.continueButton.click();


            // neden t??m adresbook mesajlar??nda ayn?? successMessage locator'?? kullan??yorum? ????nk?? hepsi ayn?? yerde ????k??yor sadece mesaj i??eri??i de??i??iyor
            Assert.assertTrue(myAccountPageElements.successMessage.isDisplayed());
            Assert.assertEquals(myAccountPageElements.successMessage.getText(),expectedMessageEdittext);

    }

    @Test
    public void deleteAddressTest(){
        homePageElements = new HomePageElementsClass(driver);
        loginPageElements=new LoginPageElementsClass(driver);
        myAccountPageElements= new MyAccountPageElements(driver);


        homePageElements.myAccountButton.click();
        homePageElements.loginButton.click();
        loginPageElements.emailInput.sendKeys("e-mail@gmail.com");
        loginPageElements.passwordInput.sendKeys("ZAQxsw169cde");
        loginPageElements.loginButton.click();

        //header text'i do??ru mu check etmek i??in test ediyorum
        String myAccountHeaderText= myAccountPageElements.MyAccountHeader.getText();
        System.out.println(myAccountHeaderText);
        String expected="My Account";
        Assert.assertEquals(myAccountHeaderText,expected);

        myAccountPageElements.addressBookButton.click();
        myAccountPageElements.deleteButtonsList.get(myAccountPageElements.deleteButtonsList.size()-1).click();

        Assert.assertTrue(myAccountPageElements.successMessage.isDisplayed());
        Assert.assertEquals(myAccountPageElements.successMessage.getText(), expectedMessageDeleteText);

    }



}