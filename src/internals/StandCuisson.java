package internals;

import java.util.List;

public class StandCuisson {

    private List<Client> clientsEnAttente;

    public StandCuisson() {}

    public List<Client> getClientsEnAttente() {
        return clientsEnAttente;
    }

    public void setClientsEnAttente(List<Client> clientsEnAttente) {
        this.clientsEnAttente = clientsEnAttente;
    }

    public synchronized void cuire(Client client) {
        Cuisinier.cuire(client);
        clientsEnAttente.remove(client);
        notify();
    }
}
