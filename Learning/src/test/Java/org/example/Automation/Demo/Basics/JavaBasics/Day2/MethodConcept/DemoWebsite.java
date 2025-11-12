package org.example.Automation.Demo.Basics.JavaBasics.Day2.MethodConcept;

public class DemoWebsite {

    public static void openbrowser(){
        System.out.println("Open the browser");
    }

    public static void EnterUsernameAndPassword(String UN,String PW){
        System.out.println("Enter UserName:" + UN);
        System.out.println("Enter PassWord :" + PW);
    }
    public static void ClickSubmit(){
        System.out.println("Click the Submit");
    }
    public static String errorMessage(){
        return "invalid UN and PW";
    }

    public static void main(String[] arg){
        System.out.println("Testcase 1 is Executed");
        openbrowser();
        EnterUsernameAndPassword("ukeshraja","1234567");
        ClickSubmit();


        System.out.println("Testcase 2 is Executed");
        openbrowser();
        EnterUsernameAndPassword("Mohan","1234567");
        ClickSubmit();
        String expectedErrorMessage = errorMessage();
        System.out.println(expectedErrorMessage);
    }
}




