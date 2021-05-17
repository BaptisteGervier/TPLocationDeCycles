package fr.eni;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cycles[] aLouer = new Cycles[6];
        Velos lapierre = new Velos("Lapierre", "speed 400", LocalDate.of(2020, 6, 21), 27);
        aLouer[0] = lapierre;

        // Autre facon de faire
        /*for (Cycles cycles : aLouer){
            if (cycles != null){
                System.out.println(cycles);
            }
        }*/

        //i = la case du tableau
        for (int i = 0; i < aLouer.length; i++) {
            if (aLouer[i] != null) {
                System.out.println(aLouer[i]);
            }
        }
    }
}