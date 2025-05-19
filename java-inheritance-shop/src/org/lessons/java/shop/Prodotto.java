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
        codice = randomNumberGenerator.nextInt(1000);
        
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
    
    public String mostraCodice(){

        String codiceStr = "Codice prodotto: " + Integer.toString(codice);
        return codiceStr;

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
        String codiceNome = "Nome Completo: " + Integer.toString(codice) + "-" + nome.replace(" ", "-");
        return codiceNome;
    }

}
