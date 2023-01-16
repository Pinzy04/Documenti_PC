package ProgTriangolo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il primo lato");
        float l1 = in.nextFloat();

        System.out.println("Inserisci il secondo lato");
        float l2 = in.nextFloat();

        System.out.println("Inserisci il terzo lato");
        float l3 = in.nextFloat();
        Triangolo t1 = new Triangolo(l1, l2, l3);

        System.out.println(t1.tipo());
        System.out.println("L'area vale "+t1.area());
    }
}
