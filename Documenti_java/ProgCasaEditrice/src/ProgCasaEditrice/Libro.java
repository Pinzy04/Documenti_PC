package ProgCasaEditrice;

public class Libro extends Pubblicazione {
    private int copieVendute;

    Libro(){
        super();
        copieVendute = 0;
        tipo = "libro";
    }

    public void venduta(){
        copieVendute++;
    }

    public String toString() {
        return "(libro): titolo='" + titolo + ", prezzo=" + prezzo + ", copie vendute=" + copieVendute + ";";
    }
}
