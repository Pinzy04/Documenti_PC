package ProgCasaEditrice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        LinkedList<Pubblicazione> Lista = new LinkedList<Pubblicazione>();

        do{
            System.out.println("1: Inserimento una nuova pubblicazione.");
            System.out.println("2: Cancellazione di una pubblicazione.");
            System.out.println("3: Vendita di un libro dalla lista");
            System.out.println("4: Visualizza lista");
            System.out.println("5: Termina programma");
            scelta = in.nextInt();

            switch(scelta){
                case 1:
                    inserimento(Lista);
                    break;
                case 2:
                    cancellazione(Lista);
                    break;
                case 3:
                    vendita(Lista);
                    break;
                case 4:
                    stampaLista(Lista);
                    break;
                case 5:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta inesistente");
                    break;
            }
        }while(scelta != 5);
    }

    public static void inserimento(List<Pubblicazione> Lista){
        Scanner in = new Scanner(System.in);
        String art;
        boolean r = false;
        while(r == false) {
            System.out.println("La pubblicazione che vuoi inserire è un libro o un periodico");
            art = in.nextLine();
            if (art.equals("Libro") || art.equals("libro")) {
                Lista.add(new Libro());
                r = true;
            }
            if (art.equals("Periodico") || art.equals("periodico")) {
                Lista.add(new Periodico());
                r = true;
            }
        }
    }

    public static void vendita(List<Pubblicazione> Lista){
        String title;
        int cont = 0;
        Scanner in = new Scanner(System.in);

        if (Lista.size() <= 0) {
            System.out.println("Non ci sono libri da vendere.");
        }
        else {
            stampaLista(Lista);
            System.out.println("Inserisci il titolo del libro da vendere:");
            title = in.nextLine();

            for (int i = 0; i < Lista.size(); i++) {
                cont++;
                if(Lista.get(i).getTitolo().equals(title)){
                    if(Lista.get(i).getTipo().equals("libro")) {
                        Lista.get(i).venduta();
                        System.out.println("Copia del libro venduta.");
                    }
                    else{
                        System.out.println("Il titolo inserito non è un libro.");
                    }
                }
                if(Lista.size() == cont){
                    System.out.println("Il titolo inserito non appartiene a nessun libro.");
                }
            }
        }
    }

    public static void cancellazione(List<Pubblicazione> Lista){
        String title;
        int cont = 0;
        Scanner in = new Scanner(System.in);

        if (Lista.size() <= 0) {
            System.out.println("Non ci sono pubblicazioni da cancellare.");
        }
        else {
            stampaLista(Lista);
            System.out.println("Inserisci il titolo della pubblicazione da cancellare:");
            title = in.nextLine();

            for (int i = 0; i < Lista.size(); i++) {
                cont++;
                if(Lista.get(i).getTitolo().equals(title)){
                    Lista.remove(i);
                    System.out.println("Pubblicazione cancellata.");
                }
                if(Lista.size() == cont){
                    System.out.println("Il titolo inserito non appartiene a nessuna pubblicazione.");
                }
            }
        }
    }

    public static void stampaLista(List<Pubblicazione> Lista){
        System.out.println("Lista:");
        for(int i = 0; i < Lista.size(); i++){
            System.out.println("Pubblicazione "+ (i+1) + Lista.get(i).toString());
        }
    }
}
