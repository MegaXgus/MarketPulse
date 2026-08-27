package br.edu.marketpulse.patterns.facade;
import br.edu.marketpulse.model.*; import br.edu.marketpulse.repository.*; import br.edu.marketpulse.service.*;
public class MarketPulseFacade {
 private final InMemoryInvestorRepository investors=new InMemoryInvestorRepository();
 private final InMemoryOrderRepository orders=new InMemoryOrderRepository();
 private final TradingApplicationService trading=new TradingApplicationService(investors,orders);
 public void registerInvestor(Investor i){investors.save(i);} public boolean place(Order o){return trading.place(o);} public Quote quote(String ticker){return trading.quote(ticker);}
 public TradingApplicationService getTradingService(){return trading;} public InMemoryOrderRepository getOrderRepository(){return orders;}
}
