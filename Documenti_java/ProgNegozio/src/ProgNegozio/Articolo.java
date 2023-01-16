package ProgNegozio;

import java.util.*;

public class Articolo {
    Scanner in = new Scanner(System.in);
    protected String codice;
    protected String titolo;
    protected float prezzo;

    Articolo (){
        insert();
    }

    public void insert(){
        System.out.println("Inserisci il codice");
        codice = in.nextLine();
        System.out.println("Inserisci il titolo");
        titolo = in.nextLine();
        System.out.println("Inserisci il prezzo");
        prezzo = in.nextFloat();
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice(){
        return codice;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getPrezzo (){
        return prezzo;
    }

    public void aumentaPrezzo(float aggiunta){
        prezzo = prezzo + aggiunta;
    }
}
