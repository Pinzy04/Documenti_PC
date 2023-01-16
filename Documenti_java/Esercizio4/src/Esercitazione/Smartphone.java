package Esercitazione;

import java.util.*;

public class Smartphone {
    private String modello;
    private String produttore;
    private double dimensione;
    private String generazione;
    private int codice;
    private int prezzo;

    Smartphone(){
        insert();
    }

    public void insert(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il modello dello smartphone");
        modello = in.next();
        System.out.println("Inserisci il produttore dello smartphone");
        produttore = in.next();
        System.out.println("Inserisci la dimensione dello smartphone");
        dimensione = in.nextDouble();
        System.out.println("Inserisci la generazione dello smartphone(3G o 4G)");
        generazione = in.next();
        System.out.println("Inserisci il codice identificativo dello smartphone");
        codice = in.nextInt();
        System.out.println("Inserisci il prezzo di vendita dello smartphone");
        prezzo = in.nextInt();
    }
}
