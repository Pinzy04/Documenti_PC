package progParcheggio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static LinkedList<Auto> parcheggio = new LinkedList<Auto>(); //creo una lista per la gestione dell'auto rimessa
    public static int cont = parcheggio.size();
    public static int dim;
    public static float rata;

    public static void main(String[] args) {
        FileWriter f1 = null; //deve essere inizializzata null
        PrintWriter fOUT1 = null; //deve essere inizializzata null
        try
        {
            f1=new FileWriter("AutoRimessa.txt",true); //crazione e apertura del  file AutoRimessa
        }
        catch (IOException exception)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }
        try
        {
            f1.close(); //chiusura del file
        }
        catch(IOException exception){
            System.out.println("Errore di chiusura del file.");
            System.exit(1);
        }


        FileWriter f2 = null; //deve essere inizializzata null
        PrintWriter fOUT2 = null; //deve essere inizializzata null
        try
        {
            f2=new FileWriter("PostiOccupati.txt",true); //creazione ed apertura del file PostiOccupati
            fOUT2=new PrintWriter(f2); //possibilità di scrivere
        }
        catch (IOException exception)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }
        try
        {
            f2.close(); //chiusura del file
        }
        catch(IOException exception){
            System.out.println("Errore di chiusura del file.");
            System.exit(1);
        }


        FileWriter f3 = null; //deve essere inizializzata null
        PrintWriter fOUT3 = null; //deve essere inizializzata null
        try
        {
            f3=new FileWriter("Storico.txt",true); //creazione ed apertura del file Storico
            fOUT3=new PrintWriter(f3); //possibilità di scrivere
        }
        catch (IOException exception)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }
        try
        {
            f3.close(); //chiusura del file
        }
        catch(IOException exception){
            System.out.println("Errore di chiusura del file.");
            System.exit(1);
        }


        Parcheggio frame1 = new Parcheggio(); //creo la prima finestra
    }
}
