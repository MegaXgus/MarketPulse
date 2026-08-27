package br.edu.marketpulse.patterns.abstractfactory;
import br.edu.marketpulse.legacy.*;
public class TradingFamilyFactory {
 public Object createBroker(String family){if("A".equals(family)) return new AlphaBrokerLegacyClient(); return new BetaBrokerApi();}
 public Object createNotifier(String family){return new WhatsappLegacyApi();}
 public Object createQuoteSource(String family){return new QuoteLegacyGateway();}
}
