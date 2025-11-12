package org.example.Automation.Demo.Basics.SeleniumBasics.Day4.POM;

import org.example.Automation.Demo.PageObjectModel.DemoEverShop.LoginPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTests {
    WebDriver driver;
    LoginPages loginPage;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("===== Starting Test Suite =====");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("===== Starting Browser Setup =====");
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.31.219:4444"), options);
        driver.manage().window().maximize();
        loginPage = new LoginPages(driver);
        System.out.println("Browser launched successfully!");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Opening Evershop Login Page...");
        driver.get("https://demo.evershop.io/account/login");
    }

    @Test(priority = 1)
    public void loginWithValidCredentials() throws InterruptedException {
        System.out.println("Running: loginWithValidCredentials");
        loginPage.login("ukeshraja@gmail.com", "ooooo@123");
        Thread.sleep(3000);

        Assert.assertTrue(loginPage.isHeadingPresent("Your Heading Here"),
                "Login failed — 'Your Heading Here' text not found!");
        System.out.println("✅ Login successful!");
    }

    @Test(priority = 2)
    public void loginWithInvalidCredentials() throws InterruptedException {
        System.out.println("Running: loginWithInvalidCredentials");
        loginPage.login("wrong@email.com", "invalid123");
        Thread.sleep(2000);

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "❌ Error message not displayed!");
        System.out.println("✅ Invalid login test passed!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Test finished, clearing cookies...\n");
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }

    @AfterTest
    public void afterTest() {
        System.out.println("===== Browser Tests Completed =====");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("===== Test Suite Execution Completed =====");
    }
}
