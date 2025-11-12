package org.example.Automation.Demo.Basics.SeleniumBasics.Day4.POM;

import org.example.Automation.Demo.PageObjectModel.DemoEverShop.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        System.out.println("Browser launched!");
    }

    @BeforeMethod
    public void openLoginPage() {
        driver.get("https://demo.evershop.io/account/login");
    }

    // 🚀 SMOKE TEST
    @Test(groups = {"smoke"})
    public void verifyLoginPageOpens() {
        System.out.println("Running Smoke Test");
        String title = loginPage.getPageTitle();
        Assert.assertTrue(title.contains("Login"), "Login page not opened!");
    }

    // 🔧 SANITY TEST
    @Test(groups = {"sanity"})
    public void loginWithValidCredentials() {
        System.out.println("Running Sanity Test");
        loginPage.login("ukeshraja@gmail.com", "ooooo@123");
        // You can assert with page heading or URL after login
        Assert.assertTrue(driver.getCurrentUrl().contains("account"));
    }

    // 🔁 REGRESSION TEST
    @Test(groups = {"regression"})
    public void loginWithInvalidCredentials() {
        System.out.println("Running Regression Test");
        loginPage.login("wrong@email.com", "invalid123");
        // Check for an error message
        Assert.assertTrue(driver.getPageSource().contains("Invalid"), "Error message not shown!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed!");
    }
}
