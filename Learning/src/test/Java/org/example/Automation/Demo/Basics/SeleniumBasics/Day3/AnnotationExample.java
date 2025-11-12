package org.example.Automation.Demo.Basics.SeleniumBasics.Day3;

import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1️⃣ Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2️⃣ Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3️⃣ Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4️⃣ Before Method");
    }

    @Test
    public void testOne() {
        System.out.println("🧪 Test 1 executed");
    }

    @Test
    public void testTwo() {
        System.out.println("🧪 Test 2 executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("6️⃣ After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("7️⃣ After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("8️⃣ After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("9️⃣ After Suite");
    }

}
