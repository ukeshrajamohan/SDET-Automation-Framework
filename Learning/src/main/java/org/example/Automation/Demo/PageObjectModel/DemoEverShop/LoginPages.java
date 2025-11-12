package org.example.Automation.Demo.PageObjectModel.DemoEverShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
        WebDriver driver;

        // Constructor
        public LoginPages(WebDriver driver) {
            this.driver = driver;
        }

        // Page Elements
        By emailInput = By.name("email");
        By passwordInput = By.name("password");
        By loginButton = By.xpath("//button[@class='button primary']");
        By errorMessage = By.xpath("//*[contains(text(),'Invalid')]");

        // Page Actions
        public void enterEmail(String email) {
            driver.findElement(emailInput).sendKeys(email);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordInput).sendKeys(password);
        }

        public void clickLogin() {
            driver.findElement(loginButton).click();
        }

        public boolean isErrorMessageDisplayed() {
            return driver.findElement(errorMessage).isDisplayed();
        }

        public boolean isHeadingPresent(String headingText) {
            return driver.getPageSource().contains(headingText);
        }

        public void login(String email, String password) {
            enterEmail(email);
            enterPassword(password);
            clickLogin();
        }
    }
