package ProgFattura;

public class Cliente {

    private String nome;
    private String cognome;

    Cliente(String nome,String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
