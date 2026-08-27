package br.edu.marketpulse.patterns.observer;
import br.edu.marketpulse.model.Order;
public class AuditObserver implements MarketObserver { public void update(Order o,String e){System.out.println("AUDIT "+o.id+" "+e);} }
