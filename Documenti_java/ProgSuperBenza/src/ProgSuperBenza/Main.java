package ProgSuperBenza;

import java.util.*;
import java.lang.*;

public class Main {

    public static int carburanteRandom(){
        int n = (int) (Math.random() * 10);
        if(n == 0){
            return 3;
        }else if(n > 0 && n <5){
            return 2;
        }else {
            return 1;
        }
    }
    public static int quantitaRandom(){
        int n = (int) (Math.random() * 41) + 10;
        return n;
    }



    public static void main(String[] args) {
        Pompa B = new Pompa(2000,0,0);
        Pompa D = new Pompa(0,2000,0);
        Pompa BD = new Pompa(2000,2000,0);
        Pompa DBM = new Pompa(2000,2000,2000);

        LinkedList<Automobile> codaB = new LinkedList<Automobile>();
        LinkedList<Automobile> codaD = new LinkedList<Automobile>();
        LinkedList<Automobile> codaBD = new LinkedList<Automobile>();
        LinkedList<Automobile> codaDBM = new LinkedList<Automobile>();
        LinkedList<Automobile> codaCassa = new LinkedList<Automobile>();

        Scanner in = new Scanner(System.in);
        int scelta;
        do{
            System.out.println("1: Arrivo di un nuovo cliente.");
            System.out.println("2: Inizio erogazione.");
            System.out.println("3: Fine erogazione e accodamento alla cassa.");
            System.out.println("4: Pagamento alla cassa.");
            System.out.println("5: Fine simulazione della coda DBM.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    codaDBM.offer(new Automobile(carburanteRandom(), quantitaRandom()));
                    break;
                case 2:
                    DBM.erogazione(codaDBM.peek().getTipoCarburante(), codaDBM.peek().getQuantita());
                    break;
                case 3:
                    codaCassa.offer(codaDBM.poll());
                    break;
                case 4:
                    System.out.println("L'automobile uscita dalla cassa ha speso €" + (codaCassa.peek().getQuantita()) * codaCassa.poll().getPrezzoCarburante());
                    break;
                case 5:
                    System.out.println("Fine simulazione.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(scelta != 5);

        do{
            System.out.println("1: Arrivo di un nuovo cliente.");
            System.out.println("2: Inizio erogazione.");
            System.out.println("3: Fine erogazione e accodamento alla cassa.");
            System.out.println("4: Pagamento alla cassa.");
            System.out.println("5: Fine simulazione della coda BD.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    codaBD.offer(new Automobile(carburanteRandom(), quantitaRandom()));
                    break;
                case 2:
                    BD.erogazione(codaBD.peek().getTipoCarburante(), codaBD.peek().getQuantita());
                    break;
                case 3:
                    codaCassa.offer(codaBD.poll());
                    break;
                case 4:
                    System.out.println("L'automobile uscita dalla cassa ha speso €" + (codaCassa.peek().getQuantita()) * codaCassa.poll().getPrezzoCarburante());
                    break;
                case 5:
                    System.out.println("Fine simulazione.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(scelta != 5);

        do{
            System.out.println("1: Arrivo di un nuovo cliente.");
            System.out.println("2: Inizio erogazione.");
            System.out.println("3: Fine erogazione e accodamento alla cassa.");
            System.out.println("4: Pagamento alla cassa.");
            System.out.println("5: Fine simulazione della coda D.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    codaD.offer(new Automobile(carburanteRandom(), quantitaRandom()));
                    break;
                case 2:
                    D.erogazione(codaD.peek().getTipoCarburante(), codaD.peek().getQuantita());
                    break;
                case 3:
                    codaCassa.offer(codaD.poll());
                    break;
                case 4:
                    System.out.println("L'automobile uscita dalla cassa ha speso €" + (codaCassa.peek().getQuantita()) * codaCassa.poll().getPrezzoCarburante());
                    break;
                case 5:
                    System.out.println("Fine simulazione.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(scelta != 5);

        do{
            System.out.println("1: Arrivo di un nuovo cliente.");
            System.out.println("2: Inizio erogazione.");
            System.out.println("3: Fine erogazione e accodamento alla cassa.");
            System.out.println("4: Pagamento alla cassa.");
            System.out.println("5: Fine simulazione della coda B.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    codaB.offer(new Automobile(carburanteRandom(), quantitaRandom()));
                    break;
                case 2:
                    B.erogazione(codaB.peek().getTipoCarburante(), codaB.peek().getQuantita());
                    break;
                case 3:
                    codaCassa.offer(codaB.poll());
                    break;
                case 4:
                    System.out.println("L'automobile uscita dalla cassa ha speso €" + (codaCassa.peek().getQuantita()) * codaCassa.poll().getPrezzoCarburante());
                    break;
                case 5:
                    System.out.println("Fine simulazione.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(scelta != 5);
    }
}
