package org.example.Automation.Demo.Basics.SeleniumBasics.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNGDemo {
    @Test
    public void SuccessLoginTest() throws MalformedURLException, InterruptedException {
        ChromeOptions cd = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.138:4444"), cd);

        driver.get("https://www.google.com");
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ukeshraja@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ooooo@123");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
