package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final WebElement userInput = driver.findElement(By.xpath("//input[@name=\"username\"]"));
    private final WebElement passwordInput = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    private final WebElement submitButton = driver.findElement(By.xpath("//button"));

    public void inputUserName(String username){
        userInput.sendKeys(username);
    }
    public void inputPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickOnSubmit(){submitButton.click();}

}
