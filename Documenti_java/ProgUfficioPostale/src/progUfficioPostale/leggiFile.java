package progUfficioPostale;

import java.io.*;
import java.util.*;

public class leggiFile {
    private String nCliente;
    private String tipo;
    private String sportello;

    public leggiFile() {
    }

    public void leggeToken() {
        FileReader f = null;
        BufferedReader fIN = null;
        String s;
        StringTokenizer st;

        try {
            f = new FileReader("Tabellone.txt");
            fIN = new BufferedReader(f);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        try {
            s = fIN.readLine();
            while (s != null) {
                st = new StringTokenizer(s, ";");
                nCliente = st.nextToken();
                tipo = st.nextToken();
                sportello = st.nextToken();

                System.out.println("Numero del cliente: " + nCliente + "\tTipo:" + tipo + "\tNumero sportello: "+ sportello);
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
}
