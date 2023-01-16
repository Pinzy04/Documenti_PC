package Esercitazione;

import java.util.*;

public class Auto {
    Scanner in = new Scanner(System.in);
    private String targa;
    private String modello;
    private String cilindrata;
    private String anno;
    private String esito;

    Auto(){
        insert();
    }

    public void insert(){
        System.out.println("Inserisci la targa:");
        targa = in.nextLine();
        System.out.println("Inserisci il modello:");
        modello = in.nextLine();
        System.out.println("Inserisci la cilindrata:");
        cilindrata = in.nextLine();
        System.out.println("Inserisci l'anno:");
        anno = in.nextLine();
    }

    public void setEsito(){
        System.out.println("Inserisci l'esito della revisione(positivo o negativo):");
        esito = in.nextLine();
    }

    public String getEsito(){
        return esito;
    }

    public String getTarga(){
        return targa;
    }
}
