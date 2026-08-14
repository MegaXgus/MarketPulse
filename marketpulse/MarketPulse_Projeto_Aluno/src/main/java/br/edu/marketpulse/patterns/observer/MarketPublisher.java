package br.edu.marketpulse.patterns.observer;
import br.edu.marketpulse.model.Order;
public class MarketPublisher {
 private MarketObserver observer;
 public void subscribe(MarketObserver observer){this.observer=observer;}
 public void publish(Order order,String event){if(observer!=null) observer.update(order,event);}
}
