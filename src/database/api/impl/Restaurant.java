package database.api.impl;

import database.api.Database;
import internals.*;

import java.util.ArrayList;

public class Restaurant implements Database {

    private int nbPlaces = 25;
    public static Buffet buffet;
    private EmployeBuffet employeBuffet;
    private StandCuisson standCuisson;
    private Cuisinier cuisinier;
    private static ArrayList<Client> clients;

    public static void main(String[] args) {
        Buffet buffet = new Buffet();
        EmployeBuffet employeBuffet = new EmployeBuffet(buffet);
        StandCuisson standCuisson = new StandCuisson();

        for (int i = 0; i < 50; i++) {
            Client client = new Client();
            client.start();
        }
    }

    public static void entrer(Client client) {
        while (clients.size() < 26) {}
        clients.add(client);
    }
}
