package progCittà;

import java.io.*;
import java.util.*;

public class leggiElenco {
    public leggiElenco() {
    }

    public void leggeToken() {
        FileReader f = null;
        BufferedReader fIN = null;
        città c;
        String s;
        StringTokenizer st;

        try {
            f = new FileReader("ElencoCittà.txt");
            fIN = new BufferedReader(f);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        c = new città();
        try {
            s = fIN.readLine();
            while (s != null) {
                st = new StringTokenizer(s, ";");
                c.nome = st.nextToken();
                c.provincia = st.nextToken();
                c.abitanti = st.nextToken();

                c.stampa();
                s = fIN.readLine();
            }

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file");
            System.exit(1);
        }
        try {
            f.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file");
            System.exit(1);
        }
    }

    public void numeroMassimo(){
        FileReader f = null;
        BufferedReader fIN = null;
        città c;
        String s;
        StringTokenizer st;

        try {
            f = new FileReader("ElencoCittà.txt");
            fIN = new BufferedReader(f);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        c = new città();
        try {
            s = fIN.readLine();
            int max=0;
            String cit = null;
            while (s != null) {
                st = new StringTokenizer(s, ";");
                c.nome = st.nextToken();
                c.provincia = st.nextToken();
                c.abitanti = st.nextToken();

                if(max < Integer.parseInt(c.abitanti)){
                    max = Integer.parseInt(c.abitanti);
                    cit= c.nome;
                }

                s = fIN.readLine();
            }
            System.out.println("la città con più abitanti è " + cit + " con " + max + "abitanti");
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file");
            System.exit(1);
        }
        try {
            f.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file");
            System.exit(1);
        }
    }

    public void numeroMedio(){
        FileReader f = null;
        BufferedReader fIN = null;
        città c;
        String s;
        StringTokenizer st;

        try {
            f = new FileReader("ElencoCittà.txt");
            fIN = new BufferedReader(f);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        c = new città();
        try {
            s = fIN.readLine();
            int media=0;
            int cont=0;
            while (s != null) {
                st = new StringTokenizer(s, ";");
                c.nome = st.nextToken();
                c.provincia = st.nextToken();
                c.abitanti = st.nextToken();

                media = media + Integer.parseInt(c.abitanti);
                cont++;
                s = fIN.readLine();
            }
            media = media/cont;
            System.out.println("Il valor medio del numero di abitanti di tutte le città è " + media);
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file");
            System.exit(1);
        }
        try {
            f.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file");
            System.exit(1);
        }
    }
}
