package Visitors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import Commande.*;

public class GroupeClient implements PrePostVisitable, Visitable{
    private String name;
    private Map<String,Client> clients;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashMap<String,Client>();
    }

    public String getName() {
        return name;
    }

    public Collection<Client> getClients() {
        return clients.values();
    }

    public void addClient(Client c) {
        this.clients.put(c.getName(),c);
    }

    public void addCommande(String Coname, Commande Cocommande) throws Exception {
        Client c = clients.get(Coname);
        if (c!=null) { c.addCommande(Cocommande); }
        else throw new Exception("nop");
    }


    public void addLigne(String Liname, String Licommande, Ligne l) throws Exception {
        Client c = clients.get(Liname);
        if (c!=null) { c.addLigne(Licommande, l);}
        else throw new Exception("nop");

    }

    @Override
    public void accept(PrePostVisitor visitor){
        visitor.preVisit(this);
        for (Client c: clients.values())
            c.accept(visitor);
        visitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor){
        for (Client c: clients.values())
            c.accept(visitor);
        visitor.visit(this);
    }
}
