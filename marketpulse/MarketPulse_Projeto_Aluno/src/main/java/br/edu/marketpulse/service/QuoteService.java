package br.edu.marketpulse.service;
import br.edu.marketpulse.legacy.QuoteLegacyGateway; import br.edu.marketpulse.model.Quote;
public class QuoteService {
 private final QuoteLegacyGateway gateway=new QuoteLegacyGateway();
 public Quote get(String ticker){String[] p=gateway.getRawQuote(ticker).split(":"); return new Quote(p[0],Double.parseDouble(p[1]),Long.parseLong(p[2]));}
}
