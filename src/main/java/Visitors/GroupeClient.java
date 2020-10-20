package Visitors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import Commande.*;

public abstract class GroupeClient implements PrePostVisitable, Visitable{
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

    }

    public void addCommande(String cname, Commande cde){
    }

    public void addLigne(String name, String commande, Ligne l){
    }

    @Override
    public void accept(PrePostVisitor visitor){}

    @Override
    public void accept(Visitor visitor){}
}
