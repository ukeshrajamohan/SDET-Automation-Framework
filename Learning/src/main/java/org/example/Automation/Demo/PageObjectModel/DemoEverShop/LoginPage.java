package org.example.Automation.Demo.PageObjectModel.DemoEverShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By email = By.name("email");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    // Actions
    public void login(String user, String pass) {
        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
