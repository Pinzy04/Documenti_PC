package ProgClasse;

public class Allievo {
    private String nome;
    private String cognome;
    private String luogodinascita;
    private int nassenze;
    Allievo(String nome, String cognome, String luogodinascita){
        this.nome = nome;
        this.cognome = cognome;
        this.luogodinascita = luogodinascita;
        this.nassenze = 0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setLuogodinascita(String luogodinascita){
        this.luogodinascita = luogodinascita;
    }
    public void setNassenze(int nassenze){
        this.nassenze = nassenze;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getLuogodinascita(){
        return this.luogodinascita;
    }
    public int getNassenze(){
        return this.nassenze;
    }

    public int aggiungiAssenza(int nassenze){
        return this.nassenze++;
    }
}
