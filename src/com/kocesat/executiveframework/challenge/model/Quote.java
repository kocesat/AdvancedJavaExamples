package com.kocesat.executiveframework.challenge.model;

public class Quote {
    private String site;
    private double price;

    public Quote(String site, double price) {
        this.site = site;
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }
}
