package br.edu.marketpulse.service;
import br.edu.marketpulse.legacy.WhatsappLegacyApi;
public class NotificationService {
 public void notify(String channel,String destination,String message){
   if("EMAIL".equals(channel)) System.out.println("EMAIL "+destination+": "+message);
   else if("SMS".equals(channel)) System.out.println("SMS "+destination+": "+message);
   else if("WHATSAPP".equals(channel)) new WhatsappLegacyApi().push(destination,message);
 }
}
