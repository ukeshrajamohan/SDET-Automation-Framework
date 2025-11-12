package org.example.Automation.Demo.Basics.SeleniumBasics.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsite {
    public static void main(String[] arg) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ukeshraja@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ooooo@123");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
         Thread.sleep(5000);
         driver.quit();
    }
}
