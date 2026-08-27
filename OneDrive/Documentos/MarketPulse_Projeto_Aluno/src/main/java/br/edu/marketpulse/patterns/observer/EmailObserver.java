package br.edu.marketpulse.patterns.observer;
import br.edu.marketpulse.model.Order;
public class EmailObserver implements MarketObserver { public void update(Order o,String e){System.out.println("EMAIL order="+o.id+" event="+e);} }
