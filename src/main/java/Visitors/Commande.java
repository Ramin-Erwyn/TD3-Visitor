package Visitors;
import Commande.*;

import java.util.HashMap;
import java.util.Map;

public abstract class Commande implements PrePostVisitable, Visitable{
    private String name;
    private Map<String,Ligne> lignes;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashMap<String,Ligne>();
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne l){}

    @Override
    public void accept(PrePostVisitor visitor){}

    @Override
    public void accept(Visitor visitor){}

}




