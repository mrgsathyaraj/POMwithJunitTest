package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

    public WebDriver driver;

    private By email = By.id("email");
    private By login = By.id("enterimg");

    public void Logintextbox(String Email)
    {
       driver.findElement(email).sendKeys(Email);
    }

    public void LoginButton()
    {
        driver.findElement(login).click();
    }

    public void loginPage(String arg)
    {
        Logintextbox(arg);
        LoginButton();
    }

    public LoginPageObjects(WebDriver driver)
    {
        this.driver=driver;
    }
}
