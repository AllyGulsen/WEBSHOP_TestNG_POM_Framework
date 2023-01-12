package SATURDAY_05.LastPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastLoginPageElementesClass {

    public LastLoginPageElementesClass (WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(css="a[class='ico-login']")
    public WebElement loginButton;


    @FindBy(css = "input[id='Email'")
    public WebElement emailSpace;

    @FindBy(id="Password")
    public WebElement passwordSpace;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement submitCredentials;

    @FindBy(xpath = "(//a[@class='account'])[1]")
    public WebElement validationAccountText;

    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement invalidCredentialsText;






}
