package ProgStudioMedico;

import java.util.*;

public class Paziente {
    private String num, nome;
    Scanner in = new Scanner(System.in);

    Paziente(){
        insert();
    }
    public void insert(){
        System.out.print("Inserisci il numero del libretto: ");
        num = in.nextLine();
        System.out.print("Inserisci il nome del paziente: ");
        nome = in.nextLine();
    }

    public void setNumeroLibretto(){
        System.out.print("Inserisci il numero del libretto: ");
        num = in.nextLine();
    }

    public String stampaDati() {
        return "Paziente{" + "numero del libretto: '" + num + '\'' + ", nome: '" + nome + '\'' + '}';
    }
}
