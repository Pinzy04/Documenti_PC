/**
 *
 * @author daniele
 */
import java.io.*;

public class ScriviAgenda {
    public ScriviAgenda(){};
    
    public void scrivi(){
          Contatto c;
          FileWriter f = null; //deve essere inizializzata null
          PrintWriter fOUT = null; //deve essere inizializzata null
    try
    {
        f=new FileWriter("agenda.txt"); //apertura del file agenda e contemporanea creazione
        fOUT=new PrintWriter(f); //possibilità di scrivere
        }
    catch (IOException e)
    {
        System.out.println("Errore di apertura del file.");
        System.exit(1);
    }
    c=new Contatto(); 
    while(c.leggi()!=null) //leggo fino a quando il metodo leggi è diverso da null
    {
        fOUT.println(c.cognome+";"+c.nome+";"+c.telefono); //scrivo sul buffer
        fOUT.flush(); //forzo la scrittura sul file
    }
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
