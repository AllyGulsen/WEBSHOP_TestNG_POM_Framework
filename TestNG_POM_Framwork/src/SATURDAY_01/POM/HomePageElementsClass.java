package SATURDAY_01.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElementsClass {

    //Sınıfla aynı isimli bir constructor oluşturup WebDriver parametresiyle initialize ettim

    public HomePageElementsClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css ="a[title='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath="//a[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Your Store']")
    public WebElement yourStoreButton;

    @FindBy(css = "input[name='search']")
    public WebElement searchInput;

    @FindBy(css = "button[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindAll({@FindBy(xpath="//h4")})
    public List<WebElement> searchResultItems;

    @FindBy(xpath = "//a[text='Contact Us']")
    public WebElement contactUsButton;

    @FindBy(id="input-enquiry")
    public WebElement enquiryInput;

    @FindBy(css="input[value='Submit']")
    public WebElement submitButton;







}
