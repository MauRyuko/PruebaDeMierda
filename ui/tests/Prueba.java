package ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.pages.BasePage;

import static java.lang.Thread.sleep;

public class Prueba {
    public static void main(String[] args) throws InterruptedException {
        BasePage page = new BasePage();

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
        // driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin23");
        // driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        // <input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
        driver.quit();




    }
}
