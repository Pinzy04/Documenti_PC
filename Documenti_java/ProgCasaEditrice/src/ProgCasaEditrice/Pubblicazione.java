package ProgCasaEditrice;

import java.util.*;

public class Pubblicazione {
    Scanner in = new Scanner(System.in);

    protected String titolo;
    protected float prezzo;
    protected String tipo;

    Pubblicazione(){
        insert();
    }

    public void insert(){
        System.out.println("Inserisci il titolo della pubblicazione");
        titolo = in.nextLine();
        System.out.println("Inserisci il prezzo");
        prezzo = in.nextFloat();
    }

    public void aumentaPrezzo(float aggiunta){
        prezzo = prezzo + aggiunta;
    }

    public float getPrezzo(){
        return prezzo;
    }

    public String getTitolo() {
        return titolo;
    }
    public String getTipo() {
        return tipo;
    }
    public void venduta(){

    }
}
