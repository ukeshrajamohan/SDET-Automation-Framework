package org.example.Automation.Demo.Basics.JavaBasics.Day1;

public class MobileRechargeDummy {
    static String AmazonHomePage =  "Open Amazon home page";
    static String AmazonPayIcon =   "Click Amazon pay button";
    static String MobileRecharge =  "Do Recharge";
    static String fetchTitle = "Mobile Recharge";

    public static void OpenAmazonHomePage(){
        System.out.println(AmazonHomePage);
    }
    public static void ClickOnAmazonPayIcon(){
        System.out.println(AmazonPayIcon);
    }
    public static void ClickOnMobileRecharge(){
        System.out.println(MobileRecharge);
    }
    public static String FetchTheTitle() {
        return (fetchTitle);
    }

public static void main(String[] arg){
    OpenAmazonHomePage();
    ClickOnAmazonPayIcon();
    ClickOnMobileRecharge();
    System.out.println(FetchTheTitle());
    }
}
