package ProgTessere;

import java.util.*;

public class Main {
    static int cont = 0 ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int scelta;
        Tessera portaTessere[] = new Tessera[5];
        do {
            System.out.println("1: Inserimento di una nuova tessera;");
            System.out.println("2: Ricercare una tessera (inserendo il numero) e aggiungere la spesa con i punti;");
            System.out.println("3: Visualizzare tutti nomi dei proprietari e i punti;");
            System.out.println("4: Esci dal menù.");
            scelta = in.nextInt();
            switch (scelta) {
                case 1: nuovaTessera(portaTessere);
                    break;
                case 2: trovaEAggiungi(portaTessere);
                    break;
                case 3: for(int i = 0; i < cont; i++){
                            portaTessere[i].toString(portaTessere[i]);
                        }
                    break;
                case 4: System.out.println("Sei uscito");
                    break;
            }
        }while(scelta != 4);
    }
    public static void nuovaTessera(Tessera[] portaTessere){
        if(cont < 5) {
            portaTessere[cont] = new Tessera();
            cont++;
        }
        else{
            System.out.println("Hai raggiunto il limite di tessere.");
        }
    }

    public static void trovaEAggiungi(Tessera[] portaTessere){
        Scanner in = new Scanner(System.in);
        int i;
        float spesa;
        String cod;

        System.out.println("inserisci il codice della tessera a cui vuoi aggiungere i punti");
        cod = in.nextLine();
        
        for(i = 0; i < cont;i++){
            if(portaTessere[i].getCodice(portaTessere[i]).equals(cod)){
                System.out.println("inserisci la spesa");
                spesa = in.nextFloat();
                portaTessere[i].acquisto(spesa);
            }
        }
    }
}
