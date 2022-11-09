package ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ui.pages.BasePage;
import ui.pages.LoginPage;

import static java.lang.Thread.sleep;

@Test()
public class LoginSuccessful extends BaseSetup{

    private final LoginPage loginPage = new LoginPage();

    loginPage.inputUserName("Admin");

    /*driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();*/

}


