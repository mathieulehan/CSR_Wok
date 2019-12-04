package database.api.impl;

import database.api.Database;
import internals.*;

import java.util.ArrayList;

public class Restaurant implements Database {

    private int nbPlaces = 25;
    private Buffet buffet;
    private EmployeBuffet employeBuffet;
    private StandCuisson standCuisson;
    private Cuisinier cuisinier;
    private ArrayList<Client> clients;

    public static void main(String[] args) {
        Buffet buffet = new Buffet();
        EmployeBuffet employeBuffet = new EmployeBuffet(buffet);
        Cuisinier cuisinier = new Cuisinier();
        StandCuisson standCuisson = new StandCuisson(cuisinier);
    }

}
