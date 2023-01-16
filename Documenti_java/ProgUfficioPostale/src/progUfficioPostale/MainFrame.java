package progUfficioPostale;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame  extends JFrame{
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JButton Inserisci;
    private JButton serviCliente;
    private JButton visualizzaTabellone;
    private JTextArea textArea2;
    private JButton exit;
    private JPanel panel1;
    private JLabel label1;
    private JButton pulisciFile;

    private static Queue Postale = new LinkedList();
    private static Queue Finanziaria = new LinkedList();
    private static Queue Pagamenti = new LinkedList();
    private static int A = 0, B = 0, C = 0;
    scriviFile a = new scriviFile();
    leggiFile b = new leggiFile();

    public MainFrame() {

        Inserisci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner in = new Scanner(System.in);
                int tipo;
                do{
                    textArea1.setText("Scegli la tipologia di operazione: postale(1), finanziaria(2), pagamenti(3).");
                    tipo = comboBox1.getSelectedIndex();
                    switch (tipo) {
                        case 0:
                            Postale.add(A);
                            A++;
                            textArea1.setText("La coda postale ha " + Postale.size() + " clienti");
                            break;
                        case 1:
                            Finanziaria.add(B);
                            B++;
                            textArea1.setText("La coda finanziaria ha " + Finanziaria.size() + " clienti");
                            break;
                        case 2:
                            Pagamenti.add(C);
                            C++;
                            textArea1.setText("La coda pagamenti ha " + Pagamenti.size() + " clienti");
                            break;
                        default:
                            textArea1.setText("Scelta inesistente");
                            break;
                    }
                }while(tipo < 0 && tipo > 2);
            }

        });
        serviCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rand = (int)(Math.random()*5+1);
                if(Postale.size() > 0){
                    a.dati(("A"+ A), "Postale", rand );
                    a.scrivi();
                    textArea1.setText("Il cliente A" + Postale.poll() + " della coda postale è stato servito allo sportello " + rand);
                }
                else if(Finanziaria.size() > 0){
                    a.dati(("B"+ B), "Finanziaria", rand );
                    a.scrivi();
                    textArea1.setText("Il cliente B" + Finanziaria.poll() + " della coda finanziaria è stato servito allo sportello " + rand);
                }
                else if(Pagamenti.size() > 0){
                    a.dati(("C"+ C), "Pagamenti", rand );
                    a.scrivi();
                    textArea1.setText("Il cliente C" + Pagamenti.poll() + " della coda pagamenti è stato servito allo sportello " + rand);
                }
                else{
                    textArea1.setText("Non ci sono più clienti");
                }
            }
        });
        visualizzaTabellone.addActionListener(new ActionListener() {

            private String nCliente;
            private String tipo;
            private String sportello;
            //private int righe=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                FileReader f = null;
                BufferedReader fIN = null;
                String s;
                StringTokenizer st;

                try {
                    f = new FileReader("Tabellone.txt");
                    fIN = new BufferedReader(f);
                } catch (IOException exception) {
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

                        textArea2.append("Numero del cliente: " + nCliente + "\tTipo:" + tipo + "\tNumero sportello: " + sportello + "\n");
                        s = fIN.readLine();
                    }
                    /*
                        while (s != null) {
                            righe++;
                        }
                        if(righe>=10) {
                            for (int i = 0; i < righe; i++) {
                                if (i > righe - 5) {
                                    st = new StringTokenizer(s, ";");
                                    nCliente = st.nextToken();
                                    tipo = st.nextToken();
                                    sportello = st.nextToken();

                                    textArea2.append("Numero del cliente: " + nCliente + "\tTipo:" + tipo + "\tNumero sportello: " + sportello + "\n");
                                    s = fIN.readLine();
                                }
                            }
                        }else if(righe <10){
                            for (int i = 0; i < righe; i++) {
                                if (i > righe-(righe - 5)) {
                                    st = new StringTokenizer(s, ";");
                                    nCliente = st.nextToken();
                                    tipo = st.nextToken();
                                    sportello = st.nextToken();
                                    textArea2.append("Numero del cliente: " + nCliente + "\tTipo:" + tipo + "\tNumero sportello: " + sportello + "\n");
                                    s = fIN.readLine();
                                }
                            }
                        }
                    */
                } catch (IOException exception) {
                    System.out.println("Errore nella lettura del file");
                    System.exit(1);
                }
                try {
                    f.close();
                } catch (IOException exception) {
                    System.out.println("Errore nella chiusura del file");
                    System.exit(1);
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pulisciFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.cancella();
            }
        });
        setContentPane(panel1);
        setTitle("Disegna cerchi");
        setSize(800, 500);
        setLocation(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
    }
}
