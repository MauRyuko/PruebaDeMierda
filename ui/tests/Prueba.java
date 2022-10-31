package ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Prueba {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./ui/resources/drivers/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
        // driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin23");
        // driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        // <input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
        driver.quit();




    }
}
