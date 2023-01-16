package progtesserasupermercato;

import java.util.Scanner;

public class ProgTesseraSupermercato {

    public static void main(String[] args) {
        float spesa;
        int prezzoPremio;
        Tessera t1 = new Tessera();
        Scanner in = new Scanner(System.in);
        
        System.out.print("inserisci la spesa: ");
        spesa = in.nextFloat();
        t1.acquisto(spesa);
        System.out.println("hai " + t1.getPunteggio() + " punti");
        
        System.out.print("inserisci il prezzo del premio: ");
        prezzoPremio = in.nextInt();
        t1.ritiraPremio(prezzoPremio);
        System.out.println("ti rimangono " + t1.getPunteggio() + " punti");
    }    
}
