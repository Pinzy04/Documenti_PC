package ProgProdotto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod;
        String des;

        System.out.print("Inserisci il codice del prodotto: ");
        cod = sc.nextInt();
        sc.nextLine();
        System.out.print("Inserisci la descrizione del prodotto: ");
        des = sc.nextLine();
        Prodotto p1 = new Prodotto(cod, des);
        System.out.println(p1.toString());
    }
}