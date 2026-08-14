package br.edu.marketpulse.model;
public class Order {
    public String id;
    public String investorId;
    public String ticker;
    public String side;
    public String type;
    public int quantity;
    public double requestedPrice;
    public String broker;
    public String status="CREATED";
    public Order(String id,String investorId,String ticker,String side,String type,int quantity,double requestedPrice,String broker){
      this.id=id;this.investorId=investorId;this.ticker=ticker;this.side=side;this.type=type;this.quantity=quantity;this.requestedPrice=requestedPrice;this.broker=broker;
    }
}
