package br.edu.marketpulse.patterns.strategy;
public class InvestmentDecisionEngine {
 private InvestmentStrategy strategy;
 public void setStrategy(InvestmentStrategy strategy){this.strategy=strategy;}
 public double calculateTarget(String profile,double currentPrice){
   if("CONSERVATIVE".equals(profile)) return currentPrice*0.98;
   if("AGGRESSIVE".equals(profile)) return currentPrice*1.12;
   if(strategy!=null) return strategy.targetPrice(currentPrice);
   return currentPrice;
 }
}
