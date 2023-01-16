package ProgNegozio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        LinkedList<Articolo> Lista = new LinkedList<Articolo>();

        do{
            System.out.println("1: Inserimento un nuovo articolo.");
            System.out.println("2: Cancellazione di un articolo.");
            System.out.println("3: Visualizza lista");
            System.out.println("4: Termina programma");
            scelta = in.nextInt();

            switch(scelta){
                case 1:
                    inserimento(Lista);
                    break;
                case 2:
                    cancellazione(Lista);
                    break;
                case 3:
                    stampaLista(Lista);
                    break;
                case 4:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta inesistente");
                    break;
            }
        }while(scelta != 4);
    }

    public static void inserimento(List<Articolo> Lista){
        Scanner in = new Scanner(System.in);
        String art;
        boolean r = false;
        while(r == false) {
            System.out.println("L'articolo che vuoi inserire è un CD o un DVD");
            art = in.nextLine();
            if (art.equals("CD") || art.equals("cd")) {
                Lista.add(new CD());
                r = true;
            }
            if (art.equals("DVD") || art.equals("dvd")) {
                Lista.add(new DVD());
                r = true;
            }
        }
    }

    public static void cancellazione(List<Articolo> Lista){
        String title;
        int cont = 0;
        Scanner in = new Scanner(System.in);

        if (Lista.size() <= 0) {
            System.out.println("Non ci sono articoli da cancellare.");
        }
        else {
            stampaLista(Lista);
            System.out.println("Inserisci il titolo dell'articolo da cancellare:");
            title = in.nextLine();

            for (int i = 0; i < Lista.size(); i++) {
                cont++;
                if(Lista.get(i).getTitolo().equals(title)){
                    Lista.remove(i);
                    System.out.println("Articolo cancellato");
                }
                if (Lista.size() == cont) {
                    System.out.println("Il titolo inserito non appartiene a nessuno articolo.");
                }
            }
        }
    }

    public static void stampaLista(List<Articolo> Lista){
        System.out.println("Lista:");
        for(int i = 0; i < Lista.size(); i++){
            System.out.println("Articolo "+ (i+1) + Lista.get(i).toString());
        }
    }
}
