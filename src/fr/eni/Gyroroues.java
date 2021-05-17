package fr.eni;

import java.time.LocalDate;

public class Gyroroues extends Electrique{


    public Gyroroues(String marque, String modele, LocalDate dateDachat, int autonomie) {
        super(marque, modele, dateDachat, autonomie);
    }

    @Override
    public double getTarif() {
        return 18.90;
    }
}
