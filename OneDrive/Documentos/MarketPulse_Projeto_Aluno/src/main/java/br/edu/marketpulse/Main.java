package br.edu.marketpulse;
import br.edu.marketpulse.model.*; import br.edu.marketpulse.patterns.facade.MarketPulseFacade; import br.edu.marketpulse.patterns.factory.OrderFactory;
public class Main {
 public static void main(String[] args){
   MarketPulseFacade app=new MarketPulseFacade(); app.registerInvestor(new Investor("I1","aluno@example.com","CONSERVATIVE",50000));
   Quote q=app.quote("XPTO3"); System.out.println("Cotação: "+q.ticker+" = "+q.price);
   Order o=OrderFactory.create("LIMIT","O1","I1","XPTO3","BUY",10,q.price,"ALPHA");
   System.out.println("Ordem aceita: "+app.place(o)+" status="+o.status);
 }
}
