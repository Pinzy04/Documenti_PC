package Esercitazione;

public class trasloco {
    private int codice;
    private String nome;
    private String cognome;
    private String data;

    trasloco(int codice, String nome, String cognome, String data){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String getData() {
        return data;
    }
}
