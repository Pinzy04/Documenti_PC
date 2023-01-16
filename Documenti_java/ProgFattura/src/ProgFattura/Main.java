package ProgFattura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome, cognome;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome del cliente: ");
        nome = sc.nextLine();
        System.out.print("Cognome del cliente: ");
        cognome = sc.nextLine();
        Cliente c1 = new Cliente(nome, cognome);

        System.out.print("Inserire il numero dei prodotti: ");
        Fattura f1 = new Fattura(c1, sc.nextInt());

        System.out.print(f1.toString());
    }
}
