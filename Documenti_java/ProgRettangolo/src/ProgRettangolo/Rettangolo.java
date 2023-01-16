package ProgRettangolo;

public class Rettangolo {

    private int base, altezza, perimetro, area, diagonale;

    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public void setBase(){
        this.base = base;
    }

    public void setAltezza(){
        this.altezza = altezza;
    }

    public int getBase(){
        return base;
    }

    public int getAltezza(){
        return altezza;
    }

    public int getPerimetro(){
        return (altezza + base)*2;
    }

    public int getArea(){
        return (base * altezza);
    }

    public int getDiagonale() {
        return (int)(Math.sqrt((double)((base*base) + (altezza*altezza))));
    }
}
