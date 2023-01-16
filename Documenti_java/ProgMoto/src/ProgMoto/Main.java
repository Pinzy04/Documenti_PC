package ProgMoto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vuoi accendere la moto?");
        if (!sc.next().equals("si"))
            System.out.println("Non hai acceso la moto");
        else {
            Moto m1 = new Moto();

            System.out.println("Inserisci la velocita");
            m1.setVelocita(sc.nextInt());

            System.out.println("Inserisci il livello del carburante in litri");
            m1.setLivCarb(sc.nextInt());

            System.out.println(m1.toString());
        }
    }
}
