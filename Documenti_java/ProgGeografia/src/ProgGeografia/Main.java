package ProgGeografia;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static LinkedList<Stato> elenco = new LinkedList<Stato>();


    public static void main(String[] args) {

        String nome;
        int pop;
        int pil;
        int sup;

        //creo il file in caso non fosse già stato creato
            FileWriter f1 = null; //deve essere inizializzata null
            PrintWriter fOUT = null; //deve essere inizializzata null
            try
            {
                f1=new FileWriter("Elenco_Stati.txt", true); //apertura del file Elenco_Stati e contemporanea creazione
                fOUT=new PrintWriter(f1); //possibilità di scrivere
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

        //leggo il contenuto del file e lo importo nella lista
            FileReader f2 = null;    //deve essere inizializzata null
            BufferedReader fIN = null;  //deve essere inizializzata null
            String s;
            StringTokenizer st;

            try {
                f2 = new FileReader("Elenco_Stati.txt");    //apertura del file Elenco_Stati
                fIN = new BufferedReader(f2);
            } catch (IOException e) {
                System.out.println("Errore nell'apertura del file");
                System.exit(1);
            }
            try {
                s = fIN.readLine();
                while (s != null) {
                    st = new StringTokenizer(s, ";");
                    nome = st.nextToken();
                    pop = Integer.parseInt(st.nextToken());
                    pil = Integer.parseInt(st.nextToken());
                    sup = Integer.parseInt(st.nextToken());

                    elenco.add(new Stato(nome,pop,pil,sup));

                    s = fIN.readLine();
                }

            } catch (IOException e) {
                System.out.println("Errore nella lettura del file");
                System.exit(1);
            }
            try {
                f2.close();  //chiusura del file

            } catch (IOException e) {
                System.out.println("Errore nella chiusura del file");
                System.exit(1);
            }

        Geografia frame = new Geografia();
    }
}
