package Test;

import SATURDAY_01.POM.HomePageElementsClass;
import SATURDAY_01.POM.LoginPageElementsClass;
import SATURDAY_01.POM.MyAccountPageElements;
import SATURDAY_01.UTILS.BaseDriverClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SearchFunctionality extends BaseDriverClass {
          HomePageElementsClass homePageElements;
          LoginPageElementsClass loginPageElements;
          MyAccountPageElements myAccountPageElements;

    @Test
    @Parameters({"searchItem"})
    public void searchFuntionTest(String searchItem){
        //DİKKAT YUKARIDA STRING SEARCHITEM İLE PARAMETERIZE ETTIM METODU VE @PARAMETERS'A AYNI ŞEYİ YAZDIM!

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


    homePageElements.yourStoreButton.click();
    //Burada searchItem parametresi YAZIYORUM, xml file altında bunu initiliaze edicem!
    homePageElements.searchInput.sendKeys(searchItem);
    homePageElements.searchButton.click();

    //for loop ile SearchResultItems ların textleri alıp bunlar Mac ibaresini içeriyor mu diye containe method ile test ediyorum.

    for(int i=0; i<homePageElements.searchResultItems.size(); i++){
        String elementText=homePageElements.searchResultItems.get(i).getText().toLowerCase();
        Assert.assertTrue(elementText.contains(searchItem.toLowerCase()));
        }


    }





    }


