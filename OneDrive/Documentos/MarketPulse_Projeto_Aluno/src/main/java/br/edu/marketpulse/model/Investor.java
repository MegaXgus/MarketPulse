package br.edu.marketpulse.model;
public class Investor {
    public String id;
    public String name;
    public String riskProfile;
    public double availableCash;
    public Investor(String id,String name,String riskProfile,double availableCash){this.id=id;this.name=name;this.riskProfile=riskProfile;this.availableCash=availableCash;}
}
