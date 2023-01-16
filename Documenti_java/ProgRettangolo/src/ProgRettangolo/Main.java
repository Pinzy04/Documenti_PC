package ProgRettangolo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base, altezza;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la base del rettangolo");
        base = in.nextInt();
        System.out.println("Inserisci l'altezza del rettangolo");
        altezza = in.nextInt();

        Rettangolo rett = new Rettangolo(base, altezza);

        System.out.println("Perimetro: " + rett.getPerimetro());
        System.out.println("Area: " + rett.getArea());
        System.out.println("Diagonale: " + rett.getDiagonale());
    }
}
