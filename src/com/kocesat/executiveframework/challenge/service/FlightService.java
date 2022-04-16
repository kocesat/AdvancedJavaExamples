package com.kocesat.executiveframework.challenge.service;

import com.kocesat.executiveframework.LongTask;
import com.kocesat.executiveframework.challenge.model.Quote;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotesAsync() {
        List<String> sites = List.of("site1", "site2", "site3");
        return sites.stream()
                .map(site -> getQuoteAsync(site));
    }

    public CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + site);
            LongTask.simulate();
            Random random = new Random();
            double price = 1100 + random.nextInt(100);
            return new Quote(site, price);
        });
    }
}
