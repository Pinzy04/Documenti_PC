package ProgStudente;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float voto;
	    Studente s1 = new Studente("Fabio Pinzarrone");

        Scanner in=new Scanner(System.in);
        System.out.println("assegna un nuovo voto");
        voto = in.nextFloat();
        s1.assegnaVoto(voto);
        System.out.println(s1.toString());
    }
}
