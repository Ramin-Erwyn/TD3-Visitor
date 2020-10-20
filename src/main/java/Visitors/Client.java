package Visitors;

import java.util.HashMap;
import java.util.Map;
import Commande.*;


public class Client implements PrePostVisitable, Visitable {

    private String name;
    protected Map<String,Commande> commandes ;

    public Client(String name){}

    public String getName(){return this.name;}

    public void addCommande(Commande c){}

    public void addLigne(String commande , Ligne l){ }

    public void accept(PrePostVisitor visitor) {}

    @Override
    public void accept(Visitor visitor){}
}
