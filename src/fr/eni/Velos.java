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

    @Override
    public String toString() {
        return "Velos{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", age=" + super.age() + " an" + (super.age() > 1 ? "s" : "") +
                ", nbVitesses=" + nbVitesses +
                '}';
        // return String.format("%s %n %s %s", this.marque); <-- autre methode d'affichage
    }
}