package ProgUfficio;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int scelta;
        Scanner in = new Scanner(System.in);
        LinkedList<Attività> Lista = new LinkedList<Attività>();

        do {
            System.out.println("1: Inserimento una nuova attività.");
            System.out.println("2: Cancellazione di un attività.");
            System.out.println("3: Stampa attività.");
            System.out.println("4: Termina processo.");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserimento una nuova attività.");
                    inserisci(Lista);
                    break;

                case 2:
                    System.out.println("Cancellazione di un attività.");
                    cancella(Lista);
                    break;

                case 3:
                    System.out.println("Stampa attività.");
                    stampa(Lista);
                    break;

                case 4:
                    System.out.println("Termina processo.");
                    break;

                default: System.out.println("Scelta non valida.");
            }
        }while(scelta != 4);
    }

    public static void inserisci(List<Attività> Lista){
        Lista.add(new Attività());
    }

    public static void cancella(List<Attività> Lista) {
        int cont = 0;
        String cod;
        Scanner in = new Scanner(System.in);

        if (Lista.size() <= 0) {
            System.out.println("Non ci sono liste da cancellare.");
        } else {
            stampaLista(Lista);
            System.out.println("Inserisci il codice dell'attività da cancellare:");
            cod = in.nextLine();

            for (int i = 0; i < Lista.size(); i++) {
                if(Lista.get(i).getCodice().equals(cod)){
                    Lista.remove(i);
                    System.out.println("Attività cancellata");
                }
                if(cont == Lista.size()){
                    System.out.println("Il codice inserito non appartiene a nessuna attività.");
                }
            }
        }
    }

    public static void stampa(List<Attività> Lista){
        int cont = 0;
        String cod;
        Scanner in = new Scanner(System.in);

        if (Lista.size() <= 0) {
            System.out.println("Non ci sono liste da stampare.");
        } else {
            stampaLista(Lista);
            System.out.println("Inserisci il codice dell'attività da stampare:");
            cod = in.nextLine();

            for (int i = 0; i < Lista.size(); i++) {
                if(Lista.get(i).getCodice().equals(cod)){
                    System.out.println(Lista.get(i).toString());
                }
                if(cont == Lista.size()-1){
                    System.out.println("Il codice inserito non appartiene a nessuna attività.");
                }
            }
        }
    }

    public static void stampaLista(List<Attività> Lista){
        System.out.println("Lista:");
        for(int i = 0; i < Lista.size(); i++){
            System.out.println("Attività "+ (i+1) + ", codice: " + Lista.get(i).getCodice());
        }
    }
}