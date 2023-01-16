package ProgArray;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
	    int i, j, bravo, peggiore, scelta, cont = 0;
        String allievo = null, cognome;

	    Studente classe[] = new Studente[4];
        classe[0] = new Studente("Sascau", 10);
        classe[1] = new Studente("Pavel", 10);
        classe[2] = new Studente("Matees", 10);
        classe[3] = new Studente("Desparecidos",10);

        do {
            System.out.println("1: aggiungere 3 voti per ogni studente");
            System.out.println("2: visualizzare tutti i nomi degli studenti con le relative medie");
            System.out.println("3: visualizzare lo studente più bravo");
            System.out.println("4: visualizzare il peggiore");
            System.out.println("5: azzerare i voti");
            System.out.println("6: ordinare l'array in ordine alfabetico crescente");
            System.out.println("7: Esci dal menu");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    for (i = 0; i < 4; i++) {
                        for (j = 0; j < 3; j++) {
                            classe[i].AssegnaVoto();
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (i = 0; i < 4; i++) {
                        System.out.println(classe[i].StampaDati(classe[i]));
                    }
                    break;
                case 3:
                    bravo = classe[0].Media();
                    for (i = 1; i < 4; i++) {
                        if (bravo < classe[i].Media()) {
                            bravo = classe[i].Media();
                            allievo = classe[i].getNome();
                        }
                    }
                    System.out.println(allievo + "è il migliore");
                    break;
                case 4:
                    peggiore = classe[0].Media();
                    for (i = 1; i < 4; i++) {
                        if (peggiore < classe[i].Media()) {
                            peggiore = classe[i].Media();
                            allievo = classe[i].getNome();
                        }
                    }
                    System.out.println(allievo + "è il peggiore");
                    break;
                case 5:
                    System.out.println("scrivi un cognome a cui vuoi azzerare i voti");
                    cognome = in.nextLine();
                    for (i = 0; i < 4; i++) {
                        if (classe[i].getNome().equals(cognome)) {
                            classe[i].azzeraVoti(classe[i]);
                            break;
                        } else
                            cont++;
                    }
                    if (cont == 4)
                        System.out.println("il nome non è valido");
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("EXIT");
                    break;
                default:
                    break;
            }
        }while(scelta != 7);
    }
}
