package br.edu.marketpulse.patterns.adapter;
import br.edu.marketpulse.legacy.AlphaBrokerLegacyClient;
import br.edu.marketpulse.model.Order;
public class AlphaBrokerAdapter extends AlphaBrokerLegacyClient {
 public boolean submit(Order order){String r=sendLegacy(order.ticker,order.side,order.quantity,order.requestedPrice);return r.contains("ACCEPTED");}
 public String rawLegacyCall(String s,String op,int q,double p){return sendLegacy(s,op,q,p);}
}
