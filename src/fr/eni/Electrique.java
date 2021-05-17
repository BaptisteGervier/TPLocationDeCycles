package fr.eni;

import java.time.LocalDate;

public abstract class Electrique extends Cycles{
    protected int autonomie;

    public Electrique(String marque, String modele, LocalDate dateDachat, int autonomie) {
        super(marque, modele, dateDachat);
        this.autonomie = autonomie;
    }
}
