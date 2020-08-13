package com.java;

interface Sayable{  
    void say();  
}  
public class MethodReferences {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method."); 
        System.out.println("Hello, d.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable s= MethodReferences::saySomething;
        // Calling interface method  
        s.say();
         
    }  
}  
