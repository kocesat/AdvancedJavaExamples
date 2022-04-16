package com.kocesat.executiveframework;

import java.util.concurrent.CompletableFuture;

public class MailService {

    public void send() {
        LongTask.simulate();
        System.out.println("Mail was sent.");
    }

    // IMPLEMENTING ASYNC METHOD
    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
    }

}
