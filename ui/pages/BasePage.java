package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected WebDriver webDriver = new ChromeDriver();
    protected String url;

    public BasePage() {

    }

    public void navigateToPage(String url){
        webDriver.navigate().to(url);
    }

}
