package testbase;

import DriverManager.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPageObjects;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected String LoginURL = "http://demo.automationtesting.in/";
    protected String RegisterURL ="http://demo.automationtesting.in/Register.html";
    protected static WebDriver driver;

    @Before
    public void initBrowser()
    {
        driver = DriverManager.getDriverManager("Chrome");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void CloseBrowser()
    {
        driver.close();
    }



}
