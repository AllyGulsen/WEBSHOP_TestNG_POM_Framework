package SATURDAY_01.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElementsClass {

    //Class ile aynı isimli constructor oluştur ve initiliaze et

    public LoginPageElementsClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "input-email")
    public WebElement emailInput;

    @FindBy(id = "input-password")
    public  WebElement passwordInput;

    @FindBy(css="input[value='Login']")
    public WebElement loginButton;

    @FindBy(xpath="//div[text()=' Warning: No match for E-Mail Address and/or Password.']")
    public WebElement warningText;



}
