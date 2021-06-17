package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPageObjects {

    WebDriver driver;
    private By firstnName= By.xpath("//input[@ng-model='FirstName']");
    private By lastName= By.xpath("//input[@ng-model='LastName']");
    private By email= By.xpath("//input[@ng-model='EmailAdress']");


    public void SignupWithName(String FirstName,String LastName)
    {
        driver.findElement(firstnName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
    }

    public void SignupWithEmail(String Email)
    {
        driver.findElement(email).sendKeys(Email);
    }



    public SignupPageObjects(WebDriver driver)
    {
        this.driver = driver;
    }


}
