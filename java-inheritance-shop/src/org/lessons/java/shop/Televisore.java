package org.lessons.java.shop;

public class Televisore extends Prodotto {

    int dimensioni;
    boolean smart;

    public Televisore(String nome, String descrizione, double prezzo, double iva, int dimensioni, boolean smart){

        super(nome, descrizione, prezzo, iva);
        
        this.dimensioni = dimensioni;
        this.smart = smart;

    }

    public String mostraDimensioni(){

        String dimensioniStr = "Dimensioni schermo: " + Integer.toString(dimensioni) + " " + "pollici";
        return dimensioniStr;

    }

    public String mostraSmart(){

        String smartOption = "Televisore Smart: no";

        if (smart == true) {

            smartOption = "Televisore Smart: sì";

        }

        return smartOption;

    }

    @Override
    public String toString(){

        return super.toString() + "\n Dimensioni schermo: " + dimensioni + "\n" + mostraSmart();
        
    }

}
