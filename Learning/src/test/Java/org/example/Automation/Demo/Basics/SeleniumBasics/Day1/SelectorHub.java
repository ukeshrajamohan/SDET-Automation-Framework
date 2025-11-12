package org.example.Automation.Demo.Basics.SeleniumBasics.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectorHub {
    public static void main(String[] arg) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("ukeshraja@gmail.com");
        driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("Ooooo@123");
        driver.findElement(By.xpath("(//input[@name='company'])[1]")).sendKeys("Amazon");
        driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[1]")).sendKeys("1234567123");

        // First Name
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='Ukesh';", firstName);

// Last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Enter Last name']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='Raja';", lastName);

        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("india");

        driver.findElement(By.xpath("//input[@placeholder='First Crush']")).sendKeys("XxxX");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='DownLoad Link']")).click();



        Thread.sleep(5000);
        driver.quit();
    }
}
