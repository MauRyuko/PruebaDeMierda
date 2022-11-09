package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends ui.pages.BasePage {

    public LoginPage() {
        super();
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

}
