package org.example.Automation.Demo.Basics.SeleniumBasics.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNGOpenBrowser {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.0.138:4444"), options);
        driver.manage().window().maximize();
    }

    @Test
    public void successLoginTest() throws InterruptedException {
        driver.get("https://demo.evershop.io/account/login");
        driver.findElement(By.name("email")).sendKeys("ukeshraja@gmail.com");
        driver.findElement(By.name("password")).sendKeys("ooooo@123");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();

        Thread.sleep(3000);
        System.out.println("✅ Login test executed successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
