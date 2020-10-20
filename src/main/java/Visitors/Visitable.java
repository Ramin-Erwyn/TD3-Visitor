package Visitors;
import Commande.Visitor;
public interface Visitable {
    void accept(Visitor visitor);
}
