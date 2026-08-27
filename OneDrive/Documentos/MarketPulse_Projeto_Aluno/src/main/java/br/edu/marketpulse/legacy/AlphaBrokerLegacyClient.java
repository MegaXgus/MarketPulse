package br.edu.marketpulse.legacy;
public class AlphaBrokerLegacyClient {
 public String sendLegacy(String symbol,String operation,int lots,double price){return "ALPHA|"+symbol+"|"+operation+"|"+lots+"|"+price+"|ACCEPTED";}
}
