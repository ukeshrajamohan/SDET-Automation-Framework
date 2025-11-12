package org.example.Automation.Demo.Basics.SeleniumBasics.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] arg){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
