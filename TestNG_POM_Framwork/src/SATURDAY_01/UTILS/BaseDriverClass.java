package SATURDAY_01.UTILS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseDriverClass {

        public WebDriver driver;

        //2 FARKLI DRIVERI PARAMETERIZE+IF ELSE İLE KULLANARAK--> CROSS BROWSER TESTING YAPABİLİRİM!

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){

        if(browser.equals("chrome")){

            System.setProperty("webdriver.chrome.driver","/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");

            driver= new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();

            driver.get("http://opencart.abstracta.us/");

    }else if (browser.equals("firefox")){

            System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");

            driver= new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();

            driver.get("http://opencart.abstracta.us/");
        }

        }
/*
    @AfterMethod
            public void tearDown(){

        driver.quit();

 */

    }




