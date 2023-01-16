package ProgProdotto;

public class Prodotto {

    private int codice;
    private String descrizione;

    Prodotto(int codice){
        this.codice = codice;
    }

    Prodotto(String descrizione){
        this.descrizione = descrizione;
    }

    Prodotto(int codice,String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codice=" + codice + ", descrizione='" + descrizione + '\'' + '}';
    }
}
