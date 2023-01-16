package progParcheggio;

import java.util.*;

public class Auto {

    private String nome;
    private String targa;
    private GregorianCalendar ingresso = new GregorianCalendar();
    private GregorianCalendar uscita = new GregorianCalendar();
    private int minuti=0;
    private int ora=0;
    private int giorno=0;
    private int mese=0;
    private int anno=0;
    private float prezzo;

    public Auto(String nome, String targa){
        this.nome = nome;
        this.targa = targa;
    }

    public void setIngresso(String ora, String minuti, String giorno, String mese, String anno){
        this.ora = Integer.parseInt(ora);
        this.minuti = Integer.parseInt(minuti);
        this.giorno = Integer.parseInt(giorno);
        this.mese = Integer.parseInt(mese) + 1;
        this.anno = Integer.parseInt(anno);
        ingresso.set(this.anno,this.mese,this.giorno,this.ora,this.minuti);
    }
    public void setUscita(String ora, String minuti, String giorno, String mese, String anno){
        this.ora = Integer.parseInt(ora);
        this.minuti = Integer.parseInt(minuti);
        this.giorno = Integer.parseInt(giorno);
        this.mese = Integer.parseInt(mese) + 1;
        this.anno = Integer.parseInt(anno);
        uscita.set(this.anno,this.mese,this.giorno,this.ora,this.minuti);
    }

    public String getTarga() {
        return targa;
    }

    public String getNome() {
        return nome;
    }

    public float calcolaPrezzo(){
        long diff = uscita.getTimeInMillis() - ingresso.getTimeInMillis();
        long diffHours = Math.round(diff / (60 * 60 * 1000));

        prezzo = diffHours * Main.rata;
        return prezzo;
    }

    public GregorianCalendar getIngresso() {
        return ingresso;
    }
    public GregorianCalendar getUscita() {
        return uscita;
    }
}
