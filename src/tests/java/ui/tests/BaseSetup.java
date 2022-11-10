package ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import ui.pages.BasePage;

import static java.lang.Thread.sleep;


public class BaseSetup {
    protected final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    protected final WebDriver driver = setUpDriver();
    private final BasePage basePage = new BasePage(driver);

    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        basePage.navigateToPage(URL);
        basePage.maximizeWindowDriver();
        sleep(1000);
    }

    @AfterMethod
    public void tearDown() {
        basePage.windowQuit();
    }
}