package br.edu.marketpulse.patterns.observer;
import br.edu.marketpulse.model.Order;
public interface MarketObserver { void update(Order order,String event); }
