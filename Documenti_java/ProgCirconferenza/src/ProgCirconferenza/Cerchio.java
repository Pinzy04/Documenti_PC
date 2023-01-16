package ProgCirconferenza;

import java.lang.*;
public class Cerchio {
    private int raggio;
    private int x;
    private int y;

    public Cerchio(){
        raggio = (int)(Math.random() * 3 + 1);
        x = (int)(Math.random() * 19 - 9);
        y = (int)(Math.random() * 19 - 9);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRaggio(){
        return raggio;
    }

    public String toString() {
        return "Cerchio: " + "raggio=" + raggio + ", x=" + x + ", y=" + y;
    }
}