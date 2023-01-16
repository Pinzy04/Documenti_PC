package progUfficioPostale;

import java.io.*;

public class scriviFile {
    private String nCliente;
    private String tipo;
    private String sportello;

    public scriviFile(){
    };
    public void dati(String nCliente, String tipo, int sportello){
        this.nCliente = nCliente;
        this.tipo = tipo;
        this.sportello = String.valueOf(sportello);
    }
    public void scrivi(){
        FileWriter f = null; //deve essere inizializzata null
        PrintWriter fOUT = null; //deve essere inizializzata null
        try
        {
            f=new FileWriter("Tabellone.txt",true); //apertura del file ElencoCittà e contemporanea creazione
            fOUT=new PrintWriter(f); //possibilità di scrivere
        }
        catch (IOException e)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }

        fOUT.println(nCliente + ";" + tipo + ";" + sportello); //scrivo sul buffer
        fOUT.flush(); //forzo la scrittura sul file
        try
        {
            f.close(); //chiusura del file
        }
        catch(IOException e){
            System.out.println("Errore di chiusura del file.");
            System.exit(1);
        }
    }
    public void cancella(){
        FileWriter f = null; //deve essere inizializzata null
        PrintWriter fOUT = null; //deve essere inizializzata null
        try
        {
            f=new FileWriter("Tabellone.txt"); //apertura del file ElencoCittà e contemporanea creazione
            fOUT=new PrintWriter(f); //possibilità di scrivere
        }
        catch (IOException e)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }

        Writer.nullWriter();

        try
        {
            f.close(); //chiusura del file
        }
        catch(IOException e){
            System.out.println("Errore di chiusura del file.");
            System.exit(1);
        }
    }
}
