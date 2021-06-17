package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriverManager(String browsername)
    {
        if(browsername.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();

        }
        else if (browsername.equalsIgnoreCase("safari"))
        {

            driver = new SafariDriver();
        }

        else
        {
            driver = new FirefoxDriver();
        }

        return driver;
    }
}
