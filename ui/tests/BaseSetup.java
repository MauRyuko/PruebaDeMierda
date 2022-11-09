
import org.testng.annotations.*;

public class BaseSetup {

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./ui/resources/drivers/chromedriver.exe/");
        page.navigateToPage("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        sleep(1000);
    }


}