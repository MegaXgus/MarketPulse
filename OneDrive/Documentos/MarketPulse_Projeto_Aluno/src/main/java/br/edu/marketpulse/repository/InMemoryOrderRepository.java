package br.edu.marketpulse.repository;
import br.edu.marketpulse.model.Order; import java.util.*;
public class InMemoryOrderRepository {
 private final Map<String,Order> data=new LinkedHashMap<>();
 public void save(Order o){data.put(o.id,o);} public Order find(String id){return data.get(id);} public Collection<Order> all(){return data.values();}
}
