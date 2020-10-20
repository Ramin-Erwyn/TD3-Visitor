package Visitors;
import Commande.PrePostVisitor;
public interface PrePostVisitable {
    void accept(PrePostVisitor visitor);
}
