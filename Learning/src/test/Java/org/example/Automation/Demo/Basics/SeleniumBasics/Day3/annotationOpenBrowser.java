package org.example.Automation.Demo.Basics.SeleniumBasics.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class annotationOpenBrowser {
    WebDriver driver;

    // Runs only once before all tests in this suite
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("===== Starting Test Suite =====");
    }

    // Runs before <test> tag in testng.xml
    @BeforeTest
    public void beforeTest() {
        System.out.println("===== Starting Browser Setup =====");
    }

    // Runs once before the first @Test method in this class
    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(" http://192.168.31.219:4444"), options);
        driver.manage().window().maximize();
        System.out.println("Browser launched successfully!");
    }

    // Runs before each @Test method
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Opening Evershop Login Page...");
        driver.get("https://demo.evershop.io/account/login");
    }

    // === TEST CASE 1 ===
    @Test(priority = 1)
    public void loginWithValidCredentials() throws InterruptedException {
        System.out.println("Running: loginWithValidCredentials");

        driver.findElement(By.name("email")).sendKeys("ukeshraja@gmail.com");
        driver.findElement(By.name("password")).sendKeys("ooooo@123");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();

        Thread.sleep(3000);

        // Verification (Example)
        Assert.assertTrue(driver.getPageSource().contains("Your Heading Here"),
                "Login failed — 'Your Heading Here' text not found!");
        System.out.println("✅ Login successful!");
    }

    // === TEST CASE 2 ===
    @Test(priority = 2)
    public void loginWithInvalidCredentials() throws InterruptedException {
        System.out.println("Running: loginWithInvalidCredentials");

        driver.findElement(By.name("email")).sendKeys("wrong@email.com");
        driver.findElement(By.name("password")).sendKeys("invalid123");
        driver.findElement(By.xpath("//button[@class='button primary']")).click();

        Thread.sleep(2000);

        // Verification (Example)
        Assert.assertTrue(driver.getPageSource().contains("Invalid"),
                "❌ Error message not displayed!");
        System.out.println("✅ Invalid login test passed!");
    }

    // Runs after each @Test method
    @AfterMethod
    public void afterMethod() {
        System.out.println("Test finished, clearing cookies...\n");
        driver.manage().deleteAllCookies();
    }

    // Runs once after all @Test methods in this class
    @AfterClass
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }

    // Runs after <test> tag
    @AfterTest
    public void afterTest() {
        System.out.println("===== Browser Tests Completed =====");
    }

    // Runs once after all suites are executed
    @AfterSuite
    public void afterSuite() {
        System.out.println("===== Test Suite Execution Completed =====");
    }
}
