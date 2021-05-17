package fr.eni;

import java.time.LocalDate;

public class Velos extends Cycles{

    private int nbVitesses;


    public Velos(String marque, String modele, LocalDate dateDachat, int nbVitesses) {
        super(marque, modele, dateDachat);
        this.nbVitesses = nbVitesses;
    }

    @Override
    public double getTarif() {
        return 4.90;
    }
}