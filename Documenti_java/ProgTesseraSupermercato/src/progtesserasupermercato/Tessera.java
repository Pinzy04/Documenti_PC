package progtesserasupermercato;
        
import java.util.Scanner;

public class Tessera {
    private String codice;
    private String cliente;
    private int punti;
    Tessera(){
        caricaDati();
    }
    Scanner in = new Scanner(System.in);
    public void caricaDati(){
        System.out.print("inserisci il codice: ");
        codice = in.nextLine();
        System.out.print("inserisci il nome del cliente: ");
        cliente = in.nextLine();
        this.punti = 10;
    }
    public void acquisto(float spesa){
        if(spesa>0)
            punti = (int) (punti + (spesa/10));
    }
    public void ritiraPremio(int prezzoPremio){
        punti = punti - prezzoPremio;
    }
    public int getPunteggio(){
        return punti;
    }
}
