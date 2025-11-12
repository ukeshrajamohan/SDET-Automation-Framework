package org.example.Automation.Demo.Basics.JavaBasics.Day2.loops;

public class LoopsBasics {
    public static void nestedloop(){
        for (int i=1; i<2; i++){
            for (int j=0; j<=1; j++){
                System.out.println(i*j);
            }
        }
    }
    public static void main(String[] arg){
        nestedloop();
    }
}
