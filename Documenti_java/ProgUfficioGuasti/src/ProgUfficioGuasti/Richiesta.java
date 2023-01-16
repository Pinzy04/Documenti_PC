package ProgUfficioGuasti;

import java.util.Scanner;

public class Richiesta {
    private String problema;

    Richiesta(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire il motivo della richiesta.");
        problema = in.nextLine();
    }

    public String getProblema(){
        return problema;
    }
}
