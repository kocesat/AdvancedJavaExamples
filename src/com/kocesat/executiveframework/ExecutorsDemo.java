package com.kocesat.executiveframework;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class ExecutorsDemo {
    public static void show() {
////        Executors.newScheduledThreadPool();
////        Executors.newSingleThreadExecutor();
//        var executor = Executors.newFixedThreadPool(10);
////        System.out.println(executor.getClass().getName());
//
//        try {
//            Future<Integer> future = executor.submit(() -> {
//                LongTask.simulate();
//                return 1;
//            });
//            System.out.println("Do more work");
//            try {
//                var result = future.get();
//                System.out.println(result);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//        finally {
////        executor needs to be shutdown to complete
//            executor.shutdown(); // shutdown after work
////        executor.shutdownNow(); // doesnt wait shutdown now
//        }
//        System.out.println("All tasks are done");

        //// CREATING COMPLETABLEFUTURE OBJECT
////        Runnable task = () -> System.out.println("a");
////        var future = CompletableFuture.runAsync(task);
//        Supplier<Integer> task = () -> 1;
//        var future = CompletableFuture.supplyAsync(task);
//        try {
//            var result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        // IMPLEMENTING ASYNC PROGRAMMING
//        var service = new MailService();
//        service.sendAsync();
//        System.out.println("Hello World");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //// CODE RUNNING UPON COMPLETION
//        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            LongTask.simulate();
//            System.out.println("Result: " + result);
//        });
//
//        System.out.println("Main thread works going on...");
//
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Main thread done...");

        // HANDLING EXCEPTIONS
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalArgumentException();
//            return 10;
        });

        try {
            var temp = future.exceptionally(ex -> 1).get();
            System.out.println(temp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        // TRANSFORMING A COMPLETABLE FUTURE
//        var future = CompletableFuture.supplyAsync(() -> 20);
//        future
//            .thenApply(ExecutorsDemo::toFahrenheit)
//                .thenAccept(f -> System.out.println(f));

//        // COMPOSING COMPLETABLE FUTURES
//            System.out.println("Main thread started");
//        getUserEmailAsync()
//            .thenComposeAsync(ExecutorsDemo::getPlaylistAsync)
//            .thenAcceptAsync(playlist -> System.out.println(playlist));
//
//        System.out.println("Main work here...");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        // COMBINING COMPLETABLE FUTURES
//        var first = CompletableFuture.supplyAsync(() -> 20);
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//
//        first
//            .thenCombineAsync(second, (price, exchangeRate) -> price * exchangeRate)
//            .thenAcceptAsync(result -> System.out.println(result));
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        // Waiting for many task to complete
//        var first = CompletableFuture.supplyAsync(() -> 1);
//        var second = CompletableFuture.supplyAsync(() -> 2);
//        var third = CompletableFuture.supplyAsync(() -> 3);
//
//        var all = CompletableFuture.allOf(first, second, third);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            System.out.println("All task are complete");
//        });

//        // Waiting for the FASTEST TASK
//        var first = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        var second = CompletableFuture.supplyAsync(() -> 20);
//
//        CompletableFuture.anyOf(first, second)
//                .thenAcceptAsync(temp -> System.out.println(temp));

//        // Handling Timeouts
//        var future = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 1;
//        });
//
//        try {
//            var result = future
//                    .completeOnTimeout(1, 1, TimeUnit.SECONDS)
//                    .get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }



        try {
            Thread.sleep(8_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

//    public static CompletableFuture<String> getUserEmailAsync() {
//        LongTask.simulate();
//        return CompletableFuture.supplyAsync(() -> "email");
//    }
//
//    public static CompletableFuture<String> getPlaylistAsync(String email) {
//       LongTask.simulate();
//       return CompletableFuture.supplyAsync(() -> "playlist");
//    }
//
//    public static int toFahrenheit(int celsius) {
//        return (int)(celsius * 1.8) + 32;
//    }
}
