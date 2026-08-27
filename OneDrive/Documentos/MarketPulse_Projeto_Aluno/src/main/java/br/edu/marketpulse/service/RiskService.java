package br.edu.marketpulse.service;
import br.edu.marketpulse.model.*;
public class RiskService {
 public boolean approve(Investor i,Order o,double currentPrice){
   if(i==null) return false;
   double exposure=o.quantity*currentPrice;
   if("BUY".equals(o.side) && exposure>i.availableCash) return false;
   if("CONSERVATIVE".equals(i.riskProfile) && exposure>10000) return false;
   return o.quantity>0;
 }
}
