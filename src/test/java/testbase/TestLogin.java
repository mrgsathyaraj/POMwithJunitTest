package testbase;

import org.junit.Test;
import pageobjects.LoginPageObjects;
import pageobjects.SignupPageObjects;

public class TestLogin extends TestBase{

    @Test
    public void LoginPage() {

        driver.get(LoginURL);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.loginPage("test");
    }






}
