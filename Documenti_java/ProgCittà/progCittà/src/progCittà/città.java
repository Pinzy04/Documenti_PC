package progCittà;

import java.io.*;

public class città {
    public String nome;
    public String provincia;
    public String abitanti;

    public città(){
    }
    public città leggi(){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);
        try
        {
            System.out.printf("Inserisci il nome della città: ");
            nome=tastiera.readLine();
            System.out.printf("Inserisci la provincia: ");
            provincia=tastiera.readLine();
            System.out.printf("Inserisci il numero di abitanti: ");
            abitanti=tastiera.readLine();
        }
        catch(IOException e){}
        return this;
    }
    public void stampa(){
        System.out.println("Città: " + nome + "(" + provincia + ")\tNumero di abitanti: "+ abitanti);
    }
}
