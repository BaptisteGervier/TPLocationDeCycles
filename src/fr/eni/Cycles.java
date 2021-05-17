package fr.eni;

import java.time.LocalDate;

public abstract class Cycles {
    protected String  marque;
    protected String  modele;
    protected LocalDate  dateDachat;

    public Cycles(String marque, String modele, LocalDate dateDachat) {
        this.marque = marque;
        this.modele = modele;
        this.dateDachat = dateDachat;
    }

    public int age(){
        return this.dateDachat.until(LocalDate.now()).getYears();
    }

    public abstract double getTarif();
}
