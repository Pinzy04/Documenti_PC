package ProgNegozio;

public class DVD extends Articolo {
    private String durata;

    DVD(){
        super();
        System.out.println("Inserisci la durata");
        durata = in.next();
    }

    public String toString() {
        return ": codice='" + codice + ", titolo='" + titolo + ", prezzo=" + prezzo + ", durata=" + durata;
    }
}
