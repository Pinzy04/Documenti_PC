package ProgGeografia;

public class Stato {

    private String nome;
    private int pop;
    private int pil;
    private int sup;

    Stato(String nome,int pop,int pil,int sup){
        this.nome = nome;
        this.pop = pop;
        this.pil = pil;
        this.sup = sup;
    }

    public String getNome() {
        return nome;
    }

    public int getPil() {
        return pil;
    }

    public int getPop() {
        return pop;
    }

    public int getSup() {
        return sup;
    }

    public String toString(int i) {
        return  ((i+1) + ". Nome=" + nome + ", Popolazione=" + pop + ", PIL=" + pil + ", Superficie=" + sup);
    }
}
