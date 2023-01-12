package Saturday4.SaturdayProject.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class DriverClass {

    //BURADA HEM WEBDRIVER HEM WEBDRIVER WAIT DECLARE EDİCEM SONRA DİĞER SAYFALARDA KULLANABİLEYİM!

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setUpMethod(String browser){

        if(browser.equals("chrome")){

        System.setProperty("webdriver.chrome.driver","/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");

    }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
            driver= new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com/index.php?");

        }

    }
    /*
    @AfterMethod(alwaysRun = true)
    @Parameters("browser")
    public void quitMethod(String browser){
        driver.quit();
    }

     */


}
