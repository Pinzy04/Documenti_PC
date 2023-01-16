package ProgNegozio;

public class CD extends Articolo {
    private int nBrani;

    CD(){
        super();
        System.out.println("Inserisci il numero di brani");
        nBrani = in.nextInt();
    }

    public String toString() {
        return ": codice='" + codice + ", titolo='" + titolo + ", prezzo=" + prezzo + ", nBrani=" + nBrani;
    }
}
