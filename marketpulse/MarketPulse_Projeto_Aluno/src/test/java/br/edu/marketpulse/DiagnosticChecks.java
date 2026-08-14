package br.edu.marketpulse;
import br.edu.marketpulse.model.*; import br.edu.marketpulse.patterns.observer.*; import br.edu.marketpulse.patterns.strategy.*;
public class DiagnosticChecks {
 public static void main(String[] args){
   MarketPublisher p=new MarketPublisher(); p.subscribe(new EmailObserver()); p.subscribe(new AuditObserver());
   p.publish(new Order("D1","I","ABC3","BUY","LIMIT",1,10,"ALPHA"),"TEST");
   InvestmentDecisionEngine e=new InvestmentDecisionEngine(); e.setStrategy(v->v*2); System.out.println("Target conservative: "+e.calculateTarget("CONSERVATIVE",100));
 }
}
