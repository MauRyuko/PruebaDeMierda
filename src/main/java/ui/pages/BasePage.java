package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver driver;// = new ChromeDriver();
    protected String url;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage(String url){
        driver.navigate().to(url);
    }

    public void maximizeWindowDriver(){
        driver.manage().window().maximize();
    }

    public void windowQuit(){
        driver.quit();
    }
}
