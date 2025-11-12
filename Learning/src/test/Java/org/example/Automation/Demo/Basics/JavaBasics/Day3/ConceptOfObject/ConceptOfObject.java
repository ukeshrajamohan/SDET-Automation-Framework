package org.example.Automation.Demo.Basics.JavaBasics.Day3.ConceptOfObject;

import org.example.Automation.Demo.Basics.JavaBasics.Day1.MobileRechargeDummy;

public class ConceptOfObject {
    public static void main(String[] arg){
        MobileRechargeDummy mr = new MobileRechargeDummy();
        mr.OpenAmazonHomePage();
        mr.ClickOnAmazonPayIcon();
        mr.ClickOnMobileRecharge();
    }
}
