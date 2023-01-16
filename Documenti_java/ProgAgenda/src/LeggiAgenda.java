
import java.io.*;
import java.util.*;
/**
 *
 * @author daniele
 */
public class LeggiAgenda {

    public LeggiAgenda(){}
    
    public void leggeToken(){
        FileReader f=null;
        BufferedReader fIN=null;
        Contatto c;
        String s;
        StringTokenizer st;
        
    try{
    f=new FileReader("agenda.txt");
    fIN= new BufferedReader(f);
    }
    catch(IOException e)
    {
        System.out.println("Errore nell'apertura del file");
        System.exit(1);
    }
    c=new Contatto();
    try
    {
        s=fIN.readLine();
        while(s != null)
        {
            st=new StringTokenizer(s, ";");
            c.cognome=st.nextToken();
            c.nome=st.nextToken();
            c.telefono=st.nextToken();
            
            c.stampa();
            s=fIN.readLine();
        }
        
    }
    catch(IOException e){
         System.out.println("Errore nella lettura del file");
        System.exit(1);
    }
    try {
        f.close();
    }
    catch (IOException e){
         System.out.println("Errore nella chiusura del file");
        System.exit(1);
    }
}
}
