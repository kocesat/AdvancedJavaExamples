package com.kocesat.executiveframework;

import java.util.Random;

public class LongTask {
    public static void simulate() {
        try {
            var random = new Random();
            Thread.sleep(1000 + random.nextInt(2_000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
