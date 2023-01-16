package ProgClasse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        String cognome;
        String luogodinascita;
        int nassenze = 0;
        String risposta;

        System.out.println("Nome dell' allievo: ");
        nome = in.nextLine();
        System.out.println("Cognome dell' allievo: ");
        cognome = in.nextLine();
        System.out.println("Luogo di nascita dell' allievo: ");
        luogodinascita = in.nextLine();

        Allievo a1 = new Allievo(nome, cognome, luogodinascita);
        do {
            System.out.println(a1.getNome() + " " + a1.getCognome() + " oggi e' assente?");
            risposta = in.nextLine();
            switch (risposta) {
                case "si":
                    a1.aggiungiAssenza(nassenze);
                    System.out.println("Assenze totali: " + a1.getNassenze());
                    break;
                case "no":
                    System.out.println("Assenze totali: " + a1.getNassenze());
                    break;
                default:
                    break;
            }
        }while(nassenze != 10);
    }
}
