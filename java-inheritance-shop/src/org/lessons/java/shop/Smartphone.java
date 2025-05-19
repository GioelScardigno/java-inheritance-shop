package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String codiceImei;
    private int memoria;

    public Smartphone(String nome, String descrizione, double prezzo, double iva, String codiceImei, int memoria){

        super(nome, descrizione, prezzo, iva);

        this.codiceImei = codiceImei;
        this.memoria = memoria;

    }

    public String mostraImei(){;

        String imeiStr = "Codice IMEI: " + codiceImei;
        return imeiStr;

    }

    public String mostraMemoria(){

        String memoriaStr = "Capacità di memoria: " + Integer.toString(memoria) + "T";
        return memoriaStr;

    }

    @Override
    public String toString(){

        return super.toString() + "\nCodice IMEI: " + codiceImei + "\nGiga di memoria: " + memoria;
        
    }

}
