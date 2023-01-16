package progCittà;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        scriviElenco a = new scriviElenco();
        leggiElenco b = new leggiElenco();
        do {
            System.out.println("1:\tInserisci una città.");
            System.out.println("2:\tStampa a video il nome della città con il maggior numero di abitanti.");
            System.out.println("3:\tStampa il valor medio del numero di abitanti di tutte le città inserite.");
            System.out.println("4:\tVisualizza il file di testo .");
            System.out.println("5:\tExit.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    a.scrivi();
                    System.out.println("scritto nel file...");
                    break;
                case 2:
                    b.numeroMassimo();
                    break;
                case 3:
                    b.numeroMedio();
                    break;
                case 4:
                    System.out.println("ora leggo dal file...");
                    b.leggeToken();
                    break;
                case 5:
                    System.out.println("Stai uscendo dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        } while(scelta != 5);
    }
}