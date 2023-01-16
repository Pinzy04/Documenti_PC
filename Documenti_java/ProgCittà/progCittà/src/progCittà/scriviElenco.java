package progCittà;

import java.io.*;

public class scriviElenco {
    public scriviElenco(){};

    public void scrivi(){
        città c;
        FileWriter f = null; //deve essere inizializzata null
        PrintWriter fOUT = null; //deve essere inizializzata null
        try
        {
            f=new FileWriter("ElencoCittà.txt",true); //apertura del file ElencoCittà e contemporanea creazione
            fOUT=new PrintWriter(f); //possibilità di scrivere
        }
        catch (IOException e)
        {
            System.out.println("Errore di apertura del file.");
            System.exit(1);
        }
        c=new città();
            c.leggi();
            fOUT.println(c.nome + ";" + c.provincia + ";" + c.abitanti); //scrivo sul buffer
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
}
