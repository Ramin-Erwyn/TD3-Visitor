package Commande;
import Visitors.*;
public interface Visitor extends AbstactVisitor{
    void visit(GroupeClient g);
    void visit(Client c);
    void visit(Commande commande);
    void visit(Ligne l);
}
