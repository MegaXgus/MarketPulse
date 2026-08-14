package br.edu.marketpulse.patterns.factory;
import br.edu.marketpulse.model.Order;
public class OrderFactory {
 public static Order create(String type,String id,String investor,String ticker,String side,int qty,double price,String broker){
   if("MARKET".equals(type)) return new Order(id,investor,ticker,side,"MARKET",qty,0,broker);
   if("LIMIT".equals(type)) return new Order(id,investor,ticker,side,"LIMIT",qty,price,broker);
   return new Order(id,investor,ticker,side,type,qty,price,broker);
 }
}
