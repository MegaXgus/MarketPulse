package br.edu.marketpulse.repository;
import br.edu.marketpulse.model.Investor; import java.util.*;
public class InMemoryInvestorRepository {
 private final Map<String,Investor> data=new HashMap<>();
 public void save(Investor i){data.put(i.id,i);} public Investor find(String id){return data.get(id);} public Collection<Investor> all(){return data.values();}
}
