/**
 *
 * @author daniele
 */
import java.io.*;


public class Contatto {
    public String cognome;
    public String nome;
    public String telefono;
    
    public Contatto(){
        }
    public Contatto leggi(){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);
        try
        {
            System.out.printf("Inserisci il cognome (* per finire): ");
            cognome=tastiera.readLine();
            if(cognome.equals("*"))
            {
                return null;
            }
            System.out.printf("Inserisci il nome: ");
            nome=tastiera.readLine();
            System.out.printf("Inserisci il telefono: ");
            telefono=tastiera.readLine();
        }
        catch(IOException e){}
        return this;
    }
    public void stampa(){
        System.out.println(cognome + "\t" + nome + "\tTel. "+ telefono);
    }
}
