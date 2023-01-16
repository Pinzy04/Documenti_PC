package ProgSuperBenza;

public class Automobile {
    private int tipoCarburante;
    private int quantita;
    public Automobile(int tipoCarburante, int quantita)
    {
        this.tipoCarburante = tipoCarburante;
        this.quantita = quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public int getTipoCarburante() {
        return tipoCarburante;
    }

    public float getPrezzoCarburante(){
        if(tipoCarburante == 1){
            return 1.7f;
        }

        if(tipoCarburante == 2){
            return 1.6f;
        }

        if(tipoCarburante == 3){
            return 0.8f;
        }
        return 0;
    }
}
