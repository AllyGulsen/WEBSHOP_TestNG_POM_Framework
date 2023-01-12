package Saturday4.SaturdayProject.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaturdayProductImagePage {

    public SaturdayProductImagePage(WebDriver driver){PageFactory.initElements(driver,this);}



    @FindBy(id = "thumb_12")
    public  WebElement thumbimage;

    @FindBy(id = "group_1")
    public  WebElement sizeDropdownBox;

    @FindBy(id = "product")
    public  WebElement bodyIframePage ;

    @FindBy(css = "iframe[id='fancybox-frame1661868781126']")
    public WebElement fancyBoxIframe;

    @FindBy(css = "div[class='primary_block row']")
    public WebElement primaryRowBlock;

    @FindBy(css="div[class='columns-container']")
    public  WebElement columnsContainer ;

    @FindBy(xpath = "(//div[@class='row'])[5]")
    public WebElement firstRow;

    @FindBy(css = "div[class='pb-right-column col-xs-12 col-sm-4 col-md-3']")
    public WebElement rightColumn;

    @FindBy(id = "buy_block")
    public WebElement buyBlockForm;

    @FindBy(css = "div[class='box-cart-bottom']")
    public WebElement addToCartBigBox;

    @FindBy(css = "#add_to_cart>button")
    public WebElement addToCart ;





}
