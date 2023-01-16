package ProgUfficio;

import java.util.*;

public class Attività {
    private String codice;
    private String descrizione;
    private String nome;
    Scanner in = new Scanner(System.in);
    Attività(){
        insert();
    }
    public void insert(){
        System.out.print("Inserisci il codice: ");
        codice = in.nextLine();
        System.out.print("Inserisci la descrizione: ");
        descrizione = in.nextLine();
        System.out.print("Inserisci il nome dell'impiegato: ");
        nome = in.nextLine();
    }
    public String getCodice(){
        return codice;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString() {
        return "Attività{" + "codice='" + codice + '\'' + ", descrizione='" + descrizione + '\'' + ", nome='" + nome + '\'' + '}';
    }
}
