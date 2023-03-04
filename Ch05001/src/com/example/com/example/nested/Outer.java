package com.example.com.example.nested;

public class Outer {
    private static String message = "Hello, world!";

    public class Inner {
        public String printMessage() {
         //   System.out.println(message);
            return "Test";
        }
    }
}
