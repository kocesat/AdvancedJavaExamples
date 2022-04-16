package com.kocesat.concurrency;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show() {
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();

////        Joining Threads
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("File is ready to be scanned");


//        // Interrupting a Thread
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread.interrupt();
//
//        // RACE CONDITION
//        DownloadStatus status = new DownloadStatus();
//
//
//        List<Thread> threads = new ArrayList<>();
////        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
////            DownloadFileTask task = new DownloadFileTask();
////            tasks.add(task);
//
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        // Joining all the threads with the main thread
//        for (var thread: threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace(); // logging instead
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

//        var totalBytes = tasks.stream()
//                .map(t -> t.getStatus().getTotalBytes())
//                .reduce(Integer::sum);


//        // Synchonization by volatile keyword
//        // wait and notify
//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadFileTask(status));
//        var thread2 = new Thread(() -> {
//            while (!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait(); //it sleeps to wait until notified
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();

//        // SYNCHRONIZED COLLECTIONS (uses Locks)
//        Collection<Integer> collection =
//                Collections.synchronizedCollection(new ArrayList<>());
//
//        var thread1 = new Thread(() -> {
//           collection.addAll(Arrays.asList(1, 2, 3));
//        });
//
//        var thread2 = new Thread(() -> {
//            collection.addAll(Arrays.asList(4, 5, 6));
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(collection);

        // CONCURRENT COLLECTIONS (uses Partioning)
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);














    }
}
