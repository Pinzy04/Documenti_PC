package ProgUfficioGuasti;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        Queue<Richiesta> coda = new LinkedList<Richiesta>();
        do{
            System.out.println("1: Nuova richiesta.");
            System.out.println("2: Invio della prima richiesta della coda al tecnico.");
            System.out.println("3: Fine dell'esecuzione.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    coda.add(new Richiesta());
                    break;
                case 2:
                    if(coda.isEmpty()){
                        System.out.println("Non ci sono richieste in sospeso.");
                    }
                    else {
                        System.out.println("La richiesta per il problema: " + coda.poll().getProblema() + " È stata inviata al tecnico");
                    }
                    break;
                case 3:
                    System.out.println("Fine dell'esecuzione.");
                    break;
                default: System.out.println("Scelta non valida");
            }
        }while(scelta != 3);
    }
}
