package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di prodotti che vuoi creare");
        int numeroProdottiDaAggiungere = Integer.parseInt(scanner.nextLine());

        if(numeroProdottiDaAggiungere > 7){
            numeroProdottiDaAggiungere = 7;
        }
        
        Prodotto[] prodotti = new Prodotto[numeroProdottiDaAggiungere];

        for (int i = 0; i < prodotti.length ; i++) {

            System.out.println("Inserisci il nome del prodotto che vuoi inserire:");
            String nomeProdotto = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto che vuoi inserire:");
            String descrizioneProdotto = scanner.nextLine();

            System.out.println("Inserisci il prezzozo del prodotto che vuoi inserire:");
            double prezzoProdotto = Double.valueOf(scanner.nextLine());

            System.out.println("Inserisci l'iva del prodotto che vuoi inserire:");
            double ivaProdotto = Double.valueOf(scanner.nextLine());

            System.out.println("Quale tipo di prodotto vuoi inserire? TV, Smartphone, Cuffie?");
            String selezioneUtente = scanner.nextLine().trim().toLowerCase();

            switch (selezioneUtente) {

                case "tv":
                    
                System.out.println("Inserisci la dimensione in pollici");
                int pollici = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserisci se la tv è smart");
                boolean Smart = Boolean.parseBoolean(scanner.nextLine());

                Televisore nuovaTv = new Televisore(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, pollici, Smart);
                prodotti[i] = nuovaTv;

                    break;



                case "smartphone":

                System.out.println("Inserisci il codice IMEI");
                String imeiProdotto = scanner.nextLine().toUpperCase();

                System.out.println("Inserisci lo spazio di archiviazione");
                int memoriaProdotto = Integer.parseInt(scanner.nextLine());

                Smartphone nuovoSmartphone = new Smartphone(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, imeiProdotto, memoriaProdotto);
                prodotti[i] = nuovoSmartphone;
                    
                    break;



                case "cuffie":

                System.out.println("Inserisci il colore del Prodotto:");
                String coloreProdotto = scanner.nextLine();

                System.out.println("Le cuffie sono wireles?");
                boolean wirelessProdotto = Boolean.parseBoolean(scanner.nextLine());

                Cuffie nuoveCuffie = new Cuffie(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto, coloreProdotto, wirelessProdotto);
                prodotti[i] = nuoveCuffie;
                    break;


            
                default:

                    prodotti[i] = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto);

                    break;
            }

        }

        scanner.close();

        System.out.println("contenuto del carrello:");
        for (Prodotto prodotto : prodotti) {

            System.out.println(prodotto);

        }

    }

}
