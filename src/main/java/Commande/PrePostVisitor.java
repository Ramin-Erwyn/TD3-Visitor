package Commande;
import Visitors.*;
public interface PrePostVisitor extends AbstactVisitor{
    void preVisit(GroupeClient g);
    void preVisit(Client c);
    void preVisit(Commande commande);
    void preVisit(Ligne l);
    void postVisit(GroupeClient g);
    void postVisit(Client c);
    void postVisit(Commande commande);
    void postVisit(Ligne l);

}
