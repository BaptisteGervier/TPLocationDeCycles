package fr.eni;

import java.time.LocalDate;

/**
 * taille int = en centimetre
 * */
public class Gyropodes extends Electrique{
    private int taille;

    public Gyropodes(String marque, String modele, LocalDate dateDachat, int autonomie) {
        super(marque, modele, dateDachat, autonomie);
    }

    @Override
    public double getTarif() {
        return 29.90;
    }
}
