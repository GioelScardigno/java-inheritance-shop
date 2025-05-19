package org.lessons.java.shop;

public class Test {

    public static void main(String[] args) {
    
        Smartphone iphone = new Smartphone("Iphone", "Smartphone Apple di ultima generazione", 1200, 22, "1946583530574", 2);

        System.out.println(iphone);



        System.out.println(); //spazio



        Televisore lgTv = new Televisore("Lg Smart Tv", "Design sottile a schermo ricurvo. Capace di viaggare su internet", 799.99, 22, 65, true);

        System.out.println(lgTv);

 

        System.out.println(); //spazio
        


        Cuffie sony = new Cuffie("WH-CH720N", "Cuffie wireless Overear per la massima qualità e per il massimo comfort", 70.00, 22, "nero opaco", true);

        System.out.println(sony);

    }

}
