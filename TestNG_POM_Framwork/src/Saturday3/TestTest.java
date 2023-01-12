package Saturday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/macbook/IdeaProjects/Selenyumklasor/104-chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demowebshop.tricentis.com/");

        WebElement loginButton= driver.findElement(By.cssSelector("a[class='ico-login']"));
        loginButton.click();


        WebElement emailSpace= driver.findElement(By.cssSelector("input[id='Email'"));
        emailSpace.sendKeys("e-mail@gmail.com");

        WebElement passwordSpace= driver.findElement(By.id("Password"));
        passwordSpace.sendKeys("Pasvord");

        WebElement submitCredentials= driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        submitCredentials.click();

        WebElement validationAccountText= driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        String actualAccount= validationAccountText.getText();
        System.out.println(actualAccount);

        String expectedAccount= "e-mail@gmail.com";

        Assert.assertEquals(actualAccount,expectedAccount);
    }
}
