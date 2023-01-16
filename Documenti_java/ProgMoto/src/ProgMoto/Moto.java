package ProgMoto;

public class Moto {
    private boolean accesa;
    private double velocita;
    private int livCarb;

    Moto(){         //costruttore di default
        accesa = true;
        System.out.println("Hai acceso la moto.");
    }

    Moto(double v){    //un altro costruttore
        velocita = v;
    }

    Moto(double v, int livCarb){
        velocita = v;
        this.livCarb = livCarb;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public void setLivCarb(int livCarb) {
        this.livCarb = livCarb;
    }

    @Override
    public String toString() {
        return "Staio viaggiando a " + velocita + "km/h e ti rimangono ancora " + livCarb + " litri di carburante";
    }
}
