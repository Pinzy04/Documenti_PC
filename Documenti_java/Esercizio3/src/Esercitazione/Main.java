package Esercitazione;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        Queue<Auto> coda = new LinkedList<Auto>();
        LinkedList<Auto> array = new LinkedList<Auto>();
        do{
            System.out.println("1: Nuova auto in coda per la revisione.");
            System.out.println("2: Revisione completata, uscita dell'auto.");
            System.out.println("3: Fine dell'esecuzione.");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    coda.add(new Auto());
                    break;
                case 2:
                    if(coda.isEmpty()){
                        System.out.println("Non ci sono auto in coda.");
                    }
                    else {
                        coda.peek().setEsito();
                        if(coda.peek().getEsito().equals("negativo")){
                            array.add(coda.poll());
                            System.out.println("l'auto è uscita.");
                            System.out.println("Targhe delle auto che non hanno passato la revisione:");
                            for(int i = 0; i < array.size(); i++){
                                System.out.println(array.get(i).getTarga());
                            }
                        }
                        else{
                            coda.poll();
                            System.out.println("l'auto è uscita.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Fine dell'esecuzione.");
                    break;
                default: System.out.println("Scelta non valida.");
            }
        }while(scelta != 3);
    }
}
