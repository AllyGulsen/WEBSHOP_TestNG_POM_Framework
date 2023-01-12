package Saturday4.SaturdayProject.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaturdayMyAccountPageElements {

    public SaturdayMyAccountPageElements(WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUsButton;


    @FindBy(xpath="//select[@id='id_contact']")
    public WebElement contactDropdown;

    //Customer service      Webmaster

    @FindBy(css="select[name='id_order']")
    public WebElement orderReferenceDropdown;

    //-- Choose --      value="0"

    @FindBy(id="message")
    public WebElement messageArea;

    @FindBy(id="submitMessage")
    public WebElement submitMessageButton;

    @FindBy(css="p[class='alert alert-success']")
    public WebElement successAlertBox;

    @FindBy(css="a[title='Return to Home']")
    public WebElement returnHomeButton;







}
