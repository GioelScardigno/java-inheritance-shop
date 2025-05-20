package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    public String nome;
    public String descrizione;
    private double prezzo;
    private double iva;

     public Prodotto(String nome, String descrizione, double prezzo, double iva){

        Random randomNumberGenerator = new Random();
        codice = randomNumberGenerator.nextInt(2001);
        
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public String mostraPrezzoBase(){

        String prezzoStr = "Prezzo Base:" + " " + String.format("%.2f", prezzo) + "$";
        return prezzoStr;

    }

    public String mostraPrezzoPiuIva(){

        double prezzoIva = prezzo + (prezzo * iva) / 100;
        String prezzoIvaStr = "Prezzo Iva compresa: " + String.format("%.2f", prezzoIva) + "$";
        return prezzoIvaStr;

   }

    public String mostraNomeCompleto(){
     
        return toString();

    }

     public static String codicePadLeft(int codice){

        return String.format("%04d", codice);

    }
    
    public String mostraCodice(){

        
        return "Codice prodotto: " + codicePadLeft(codice);

    }

    public String mostraNome(){

        String nomeStr = "Nome prodotto: " + nome;
        return nomeStr;

    }

    public String mostraDescrizione(){

        String descrizioneStr = "Descrizione prodotto: " + descrizione;
        return descrizioneStr;

    }


    @Override
    public String toString(){
        String codiceNome = "Nome Completo: " + (codicePadLeft(codice)) + "-" + nome.replace(" ", "-");
        return codiceNome;
    }

}
