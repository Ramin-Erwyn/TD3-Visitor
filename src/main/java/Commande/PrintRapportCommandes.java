package Commande;

import java.util.HashMap;
import java.util.Map;
import Visitors.*;

public class PrintRapportCommandes implements Visitor{
    public Map<String,Integer> bill;

    public PrintRapportCommandes() {  }

    @Override
    public void visit(GroupeClient g) {
        System.out.println(String.format("Groupe de client %s",g.getName()));
    }

    @Override
    public void visit(Client c) {
        System.out.println(String.format("je visite un client %s",c.getName()));

    }

    @Override
    public void visit(Commande commande) {
        System.out.println(String.format("je visite une commande %s",commande.getName()));

    }

    @Override
    public void visit(Ligne l){
        System.out.println(String.format("je visite une ligne %s",l.getName()));

    }
}
