package testbase;

import org.junit.Test;
import pageobjects.SignupPageObjects;

public class TestSignup extends TestBase{

    @Test
    public void SignupPageWithName()
    {
        driver.get(RegisterURL);
        SignupPageObjects SignupName = new SignupPageObjects(driver);
        SignupName.SignupWithName("Sathya","Raj");
        SignupName.SignupWithEmail("test@gmail.com");
    }
}
