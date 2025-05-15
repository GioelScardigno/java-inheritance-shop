package org.lessons.java.shop;

public class Test {

    public static void main(String[] args) {
    
        Smartphone iphone = new Smartphone("Iphone", "Smartphone Apple di ultima generazione", 1200, 22, "1946583530574", 2);

        System.out.println(iphone.mostraCodice());
        System.out.println(iphone.mostraNome());
        System.out.println(iphone.mostraDescrizione());
        System.out.println(iphone.mostraPrezzoBase());
        System.out.println(iphone.mostraPrezzoPiuIva());
        System.out.println(iphone.mostraNomeCompleto());
        System.out.println(iphone.mostraImei());
        System.out.println(iphone.mostraMemoria());



        System.out.println(); //spazio



        Televisore lgTv = new Televisore("Lg Smart Tv", "Design sottile a schermo ricurvo. Capace di viaggare su internet", 799.99, 22, 65, true);

        System.out.println(lgTv.mostraCodice());
        System.out.println(lgTv.mostraNome());
        System.out.println(lgTv.mostraDescrizione());
        System.out.println(lgTv.mostraPrezzoBase());
        System.out.println(lgTv.mostraPrezzoPiuIva());
        System.out.println(lgTv.mostraNomeCompleto());
        System.out.println(lgTv.mostraDimensioni());
        System.out.println(lgTv.mostraSmart());



        System.out.println();
        


        Cuffie sony = new Cuffie("WH-CH720N", "Cuffie wireless Overear per la massima qualità e per il massimo comfort", 70.00, 22, "nero opaco", true);

        System.out.println(sony.mostraCodice());
        System.out.println(sony.mostraNome());
        System.out.println(sony.mostraDescrizione());
        System.out.println(sony.mostraPrezzoBase());
        System.out.println(sony.mostraPrezzoPiuIva());
        System.out.println(sony.mostraNomeCompleto());
        System.out.println(sony.mostraColore());
        System.out.println(sony.mostraMetodoConnessione());

    }

}
