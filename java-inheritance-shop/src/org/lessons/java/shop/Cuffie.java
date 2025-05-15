package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    String colore;
    boolean metodoConnessione;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean metodoConnessione){

        super(nome, descrizione, prezzo, iva);
        
        this.colore = colore;
        this.metodoConnessione = metodoConnessione;

    }

    public String mostraColore(){

        String coloreStr = "Colore prodotto: " + colore;
        return coloreStr;

    }

    public String mostraMetodoConnessione(){

        String connessioneStr = "Metodo di Connessione: Cavo Jack";

        if (metodoConnessione == true) {
            
            connessioneStr = "Metodo di Connessione: Bluetooth";

        }

        return connessioneStr;

    }

}
