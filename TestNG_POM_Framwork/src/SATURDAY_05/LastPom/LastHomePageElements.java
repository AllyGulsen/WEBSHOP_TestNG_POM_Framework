package SATURDAY_05.LastPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastHomePageElements {

    public LastHomePageElements (WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(css = "div[class='master-wrapper-content']")
    public WebElement productPageContent;

    @FindBy(xpath = "(//input[@value='Add to cart'])[6]")
    public WebElement addtoCartButton;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement slowRadioButton;

    @FindBy(css = "input[id='add-to-cart-button-75']")
    public WebElement addToCart2;

    @FindBy(css = "a[class='ico-cart']")
    public WebElement shoppingCart;

    @FindBy(css = "input[id='termsofservice']")
    public WebElement termsOfServiceCheckBox;

    @FindBy(css = "button[id='checkout']")
    public WebElement checkoutButton;

    @FindBy(css = "select[id='BillingNewAddress_CountryId']")
    public WebElement countryDropdownBox;

    @FindBy(css = "select[id='BillingNewAddress_StateProvinceId']")
    public WebElement stateDropdownBox;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement adress1Input;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumber;

    @FindBy(css = "select[id='billing-address-select']")
    public WebElement billingAddressDropdown;

    @FindBy(xpath = "(//input[@title='Continue'])[1]")
    public WebElement billingcontinueButton;

    @FindBy(css = "select[id='shipping-address-select']")
    public WebElement shippingAddressDropdown;

    @FindBy(css = "input[onclick='Shipping.save()']")
    public WebElement saveShippingContinue;

    @FindBy(id = "shippingoption_0")
    public WebElement shippingOption1CheckBox;

    @FindBy(css = "input[onclick='ShippingMethod.save()']")
    public WebElement shippingContinue2;

    @FindBy(id = "paymentmethod_0")
    public WebElement paymentMethod1;

    @FindBy(css = "input[onclick='PaymentMethod.save()']")
    public WebElement paymentContinue;

    @FindBy(css = "input[onclick='PaymentInfo.save()']")
    public WebElement paymentInfoSaveButton;

    @FindBy(css = "input[onclick='ConfirmOrder.save()']")
    public WebElement confirmButton;

    @FindBy(css = "div[class='title']")
    public WebElement orderSuccessMessage;










}
