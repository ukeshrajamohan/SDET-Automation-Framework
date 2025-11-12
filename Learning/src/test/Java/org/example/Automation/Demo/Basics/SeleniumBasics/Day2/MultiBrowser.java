package org.example.Automation.Demo.Basics.SeleniumBasics.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class MultiBrowser {
    public static void main(String[] args) throws Exception {
        // Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver chromeDriver = new RemoteWebDriver(new URL("http://192.168.31.219:4444"), chromeOptions);
        chromeDriver.get("https://www.google.com");
        chromeDriver.get("https://demo.evershop.io/account/login");
        chromeDriver.findElement(By.xpath("//input[@name='email']")).sendKeys("ukeshraja@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("ooooo@123");
        chromeDriver.findElement(By.xpath("//button[@class='button primary']")).click();
        Thread.sleep(5000);


        // Firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver firefoxDriver = new RemoteWebDriver(new URL("http://192.168.31.219:4444"), firefoxOptions);
        firefoxDriver.get("https://www.google.com");
        firefoxDriver.get("https://demo.evershop.io/account/login");
        firefoxDriver.findElement(By.xpath("//input[@name='email']")).sendKeys("ukeshraja@gmail.com");
        firefoxDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("ooooo@123");
        firefoxDriver.findElement(By.xpath("//button[@class='button primary']")).click();
        Thread.sleep(5000);


        chromeDriver.quit();
        firefoxDriver.quit();
    }
}
