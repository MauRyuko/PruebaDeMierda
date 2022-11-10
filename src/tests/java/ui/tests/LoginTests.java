package ui.tests;

import org.testng.annotations.Test;
import ui.pages.LoginPage;


@Test()
public class LoginTests extends BaseSetup{

    private final LoginPage loginPage = new LoginPage(driver);

    @Test(testName = "Login Successful")
    public void loginSuccessful(){
        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickOnSubmit();
        // assert login successful
    }

}


