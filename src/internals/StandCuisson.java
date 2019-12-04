package internals;

import java.util.ArrayList;

public class StandCuisson {

    private ArrayList<Client> clientsEnAttente;
    private Cuisinier cuisinier;

    public StandCuisson(Cuisinier cuisinier) {
        this.cuisinier = cuisinier;
    }

    public ArrayList<Client> getClientsEnAttente() {
        return clientsEnAttente;
    }

    public void setClientsEnAttente(ArrayList<Client> clientsEnAttente) {
        this.clientsEnAttente = clientsEnAttente;
    }
}
