package br.edu.marketpulse.model;
public class Quote {
    public String ticker; public double price; public long timestamp;
    public Quote(String ticker,double price,long timestamp){this.ticker=ticker;this.price=price;this.timestamp=timestamp;}
}
