package ProgAutomobile;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nome;

        System.out.print("Nome della macchina: ");

        Scanner in = new Scanner(System.in);
        nome = in.nextLine();
        Automobile auto = new Automobile(nome);

        System.out.println(auto.getNome());
        System.out.println(auto.getVelocita());
        System.out.println(auto.getMarcia());
    }
}
