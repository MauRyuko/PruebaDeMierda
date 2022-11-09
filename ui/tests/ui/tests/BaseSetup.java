package ui.tests;


import org.testng.annotations.*;
import ui.pages.LoginPage;

import static java.lang.Thread.sleep;


public class BaseSetup {
    protected final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private ui.pages.LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./ui/resources/drivers/chromedriver.exe/");
        loginPage.navigateToPage(URL);
        loginPage.maximizeWindowDriver();
        sleep(1000);
    }


    @AfterClass
    public void tearDown() {
        loginPage.windowQuit();
    }
}