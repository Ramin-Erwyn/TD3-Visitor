package Commande;

import java.util.HashMap;
import java.util.Map;
import Visitors.*;

public abstract class PrintRapportCommandes implements Visitor{
    public Map<String,Integer> bill;

    public PrintRapportCommandes() {  }

    @Override
    public void visit(GroupeClient g) { }

    @Override
    public void visit(Client c) {
    }

    @Override
    public void visit(Commande o) { }

    @Override
    public void visit(Ligne l){}
}
