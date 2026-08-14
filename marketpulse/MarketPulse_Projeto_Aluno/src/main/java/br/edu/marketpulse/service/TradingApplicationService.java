package br.edu.marketpulse.service;
import br.edu.marketpulse.model.*; import br.edu.marketpulse.repository.*; import br.edu.marketpulse.legacy.*; import br.edu.marketpulse.patterns.adapter.*; import br.edu.marketpulse.patterns.observer.*;
public class TradingApplicationService {
 public final InMemoryInvestorRepository investors; public final InMemoryOrderRepository orders;
 private final QuoteService quotes=new QuoteService(); private final RiskService risk=new RiskService(); private final NotificationService notifications=new NotificationService(); private final MarketPublisher publisher=new MarketPublisher();
 public TradingApplicationService(InMemoryInvestorRepository i,InMemoryOrderRepository o){investors=i;orders=o; publisher.subscribe(new EmailObserver()); publisher.subscribe(new AuditObserver());}
 public boolean place(Order order){
   Investor investor=investors.find(order.investorId); Quote quote=quotes.get(order.ticker);
   order.status="VALIDATING"; orders.save(order);
   if(!risk.approve(investor,order,quote.price)){order.status="REJECTED";orders.save(order);publisher.publish(order,"REJECTED");return false;}
   if("BUY".equals(order.side)) investor.availableCash -= order.quantity*quote.price; // alteração antes da confirmação externa
   boolean accepted;
   if("ALPHA".equals(order.broker)) accepted=new AlphaBrokerAdapter().submit(order);
   else accepted=new BetaBrokerApi().execute(order.ticker,"BUY".equals(order.side),order.quantity,order.requestedPrice);
   order.status=accepted?"EXECUTED":"FAILED"; orders.save(order);
   notifications.notify("EMAIL",investor.name,"Ordem "+order.id+" = "+order.status);
   publisher.publish(order,order.status);
   return accepted;
 }
 public Quote quote(String ticker){return quotes.get(ticker);} public MarketPublisher publisher(){return publisher;}
}
