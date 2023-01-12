package Saturday4.SaturdayProject.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaturdayLoginPageElementsClass {
    public SaturdayLoginPageElementsClass (WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[2]")
    public WebElement loginEmail;

    @FindBy(css = "input[id='passwd']")
    public WebElement loginPassword;

    @FindBy(id="SubmitLogin")
    public WebElement loginButton;
}
