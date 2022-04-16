package com.kocesat.lambdaexpressions;

public class LambdasDemo {
    public static String prefix = "-";

    public static void print(String message) {}

    public  static void show() {
//        // Example of an Anonymus Inner Class
//        // In the following function parameters
//        // we actually define an anonymus class and
//        // override the print() method.
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });


//        // Lambda expression as a parameter
//        greet(message ->System.out.println(prefix + message));
//        //Method reference (This is the same as above)
//        // Syntax goes like "Class/Object::method"
//        greet(System.out::println);
//        // Lambda expression as a variable
//        Printer printer = message -> System.out.println(message);

//        // Lambda expression as a parameter
//        greet(message -> print(message));
//        // Method reference
//        greet(LambdasDemo::print);

//        // If the function is an instance method
//        // of a so-called demo object
//        // Method reference be like
//        greet(message -> demo.print(message));
//        greet(demo::print);

//        // If the functions is a constructor
//        greet(message -> LambdasDemo(message));
//        greet(LambdasDemo::print);
    }

    public static void greet(Printer printer){
        printer.print("Hello world");
    }
}
