package Saturday4.SaturdayProject.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaturdayHomePageElementsClass {

    //aynı isimle constructor kurup initialize ettim

    public SaturdayHomePageElementsClass (WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
    public WebElement orderCompleteMessage;

    @FindBy(className = "box")
    public WebElement completedTextWithReferenceCode;

    @FindBy(linkText = "My orders")
    public WebElement myOrdersButton;

    @FindBy(className = "color-myaccount")
    public WebElement referenceCode;

    @FindBy(css = "img[title='Faded Short Sleeve T-shirts']")
    public WebElement firstItem;

    @FindBy(xpath = "(//span[text()='Add to cart'])[1]")
    public WebElement firstAddToCart;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    public WebElement secondProceedToCheckout;

    @FindBy(id = "cgv")
    public WebElement termsOfCond;

    @FindBy(className = "bankwire")
    public WebElement payBankWire;

    @FindBy(xpath = "//span[text()='I confirm my order']")
    public WebElement IConfirmOrder;


    @FindBy(css="a[class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "(//img[@title='Printed Summer Dress'])[1]")
    public WebElement printedDressImage;

    @FindBy(xpath = "(//span[text()='Add to cart'])[5]")
    public WebElement printedAddToCart1;

    @FindBy(id = "index")
    public WebElement index;

    @FindBy(xpath = "(//div[@class='row'])[5]")
    public WebElement row;

    @FindBy(xpath = "(//div[@class='product-container'])[5]")
    public WebElement productContainer;

    @FindBy(xpath = "(//a[@title='Printed Summer Dress'])[1]")
    public WebElement image;

    @FindBy(xpath = "((//a[@data-id-product='5'])[1]")
    public WebElement addToCartButton;


    @FindBy(css="a[title='Proceed to checkout']")
    public WebElement proceedButton;

    @FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
    public WebElement getProceedButton2;

    @FindBy(css="button[name='processAddress']")
    public WebElement proceedAddressButton;

    @FindBy(id="cgv")
    public WebElement checkbox;

    @FindBy(css="button[name='processCarrier']")
    public WebElement processCarrierButton;


    @FindBy(css="a[title='Pay by check.']")
    public WebElement payByCheckButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement confirmOrderButton;

    @FindBy(css="p[class='alert alert-success']")
    public WebElement orderSuccessAlertBox;

    @FindBy(xpath="//div[@class='box order-confirmation']")
    public WebElement textContainer;



    @FindBy(xpath="(//td[@class='history_link bold footable-first-column'])[2]")
    public WebElement myOrderHistoryButton;







}
