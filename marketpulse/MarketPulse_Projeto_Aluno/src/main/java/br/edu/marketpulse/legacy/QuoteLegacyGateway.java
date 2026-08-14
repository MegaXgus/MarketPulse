package br.edu.marketpulse.legacy;
public class QuoteLegacyGateway {
 public String getRawQuote(String ticker){double base=Math.abs(ticker.hashCode()%10000)/10.0+10.0; return ticker+":"+base+":"+System.currentTimeMillis();}
}
