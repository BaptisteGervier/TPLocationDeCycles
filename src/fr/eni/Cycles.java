package fr.eni;

import java.time.LocalDate;

public abstract class Cycles {
    protected String  marque;
    protected String  modele;
    protected LocalDate  dateDachat;

    public int age(){
        return this.dateDachat.until(LocalDate.now()).getYears();
    }

    public abstract double getTarif();
}
