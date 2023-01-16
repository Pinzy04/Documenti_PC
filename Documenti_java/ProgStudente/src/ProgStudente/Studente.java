package ProgStudente;
public class Studente {
    private String nome;
    private float sommaVoti;
    private int numeroVoti;

    Studente(String nome){
        this.nome = nome;
        sommaVoti = 0f;
        numeroVoti = 0;
    }
    public void assegnaVoto(float voto){
        sommaVoti = sommaVoti + voto;
        numeroVoti++;
    }
    public float media(){
        return sommaVoti/numeroVoti;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return (nome + sommaVoti + numeroVoti);
    }
}
