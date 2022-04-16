package com.kocesat.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    // volatile means: Dont cache this value
    // always read in memory
    private boolean isDone;

//    private int totalBytes;

    private LongAdder totalBytes = new LongAdder();
    private Object totalBytesLock = new Object();
//    private Lock locker = new ReentrantLock();

//    public void incrementTotalBytes() {
//        synchronized (totalBytesLock) {
//            totalBytes++;
//        }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }


//    public void incrementTotalBytes() {
//        totalBytes.incrementAndGet();
//    }
//    public int getTotalBytes() {
//        return totalBytes.get();
//    }


    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }
    //    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;
}
