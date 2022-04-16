package com.kocesat.exceptions;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show() throws IOException {
//        var reader = new FileReader("file.txt");
//        sayHello(null);
//
//        // Try with resources
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("...");
//        ) {
//            var value = reader.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        var account = new Account();
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging...");
//            throw e;
//        }

        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
