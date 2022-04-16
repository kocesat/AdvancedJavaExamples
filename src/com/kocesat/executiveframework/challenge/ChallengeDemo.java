package com.kocesat.executiveframework.challenge;

import com.kocesat.executiveframework.LongTask;
import com.kocesat.executiveframework.challenge.model.Quote;
import com.kocesat.executiveframework.challenge.service.FlightService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ChallengeDemo {
    public static void main(String[] args) {
        // Challenge: Getting Different Quotes from different agents
        Long startTime = System.currentTimeMillis();
        FlightService flightService = new FlightService();

        List<CompletableFuture<Void>> futures = flightService.getQuotesAsync()
                .map(future -> future.thenAccept(q -> printQuote(q.getSite(), q.getPrice())))
                .collect(Collectors.toList());

        CompletableFuture
            .allOf(futures.toArray(CompletableFuture[]::new))
            .thenRun(() -> {
                Long endTime = System.currentTimeMillis();
                System.out.println("Retrieved all quotes in " + (endTime - startTime) + " msec.");
            });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void printQuote(String siteName, double price) {
        System.out.println("Price from " + siteName + ": $" + price);
    }
}
