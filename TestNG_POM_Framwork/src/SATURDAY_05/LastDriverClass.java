package SATURDAY_05;

import SATURDAY_05.LastPom.LastLoginPageElementesClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class LastDriverClass {

    public WebDriver driver;
    public WebDriverWait wait;
    LastLoginPageElementesClass lastLoginPageElementesClass;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
        public void setUpMethod(String browser){

        if(browser.equals("chrome")){

            System.setProperty("webdriver.chrome.driver","/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
            driver= new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://demowebshop.tricentis.com/");

        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
            driver= new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://demowebshop.tricentis.com/");

        }





    }

}
