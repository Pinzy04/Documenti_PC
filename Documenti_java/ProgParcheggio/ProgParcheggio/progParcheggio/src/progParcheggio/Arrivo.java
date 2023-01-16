package progParcheggio;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class Arrivo extends JFrame{
    private JTextField nome;
    private JTextField targa;
    private JTextField ora;
    private JTextField pbusy;   //posti occupati
    private JTextField pfree;   //posti liberi
    private JButton invioButton;
    private JTextArea tariffa;
    private JPanel panel1;
    private JButton exitButton;
    private JTextField minuti;
    private JTextField mese;
    private JTextField anno;
    private JTextField giorno;


    public Arrivo(){
        tariffa.setText("Tariffa: " + Main.rata + "€ all'ora");
        pbusy.setText(String.valueOf(Main.cont));
        pfree.setText(String.valueOf(Main.dim-Main.cont));
        setContentPane(panel1);
        setTitle("Arrivo");
        setSize(1000, 400);
        setLocation(200, 25);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        FileReader f1 = null;
        BufferedReader fIN1 = null;
        String s1;
        StringTokenizer st1;

        try {
            f1 = new FileReader("AutoRimessa.txt");
            fIN1 = new BufferedReader(f1);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        try {
            s1 = fIN1.readLine();
            int i = 0;
            while (s1 != null) {
                st1 = new StringTokenizer(s1, ";");
                Main.parcheggio.add(new Auto(st1.nextToken(), st1.nextToken()));
                Main.parcheggio.get(i).setIngresso(st1.nextToken(),st1.nextToken(),st1.nextToken(),st1.nextToken(),st1.nextToken());
                s1 = fIN1.readLine();
                i++;
            }

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file");
            System.exit(1);
        }
        try {
            f1.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file");
            System.exit(1);
        }


        invioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //controllo se il nome è stato inserito
                if(nome.getText().equals(null) || nome.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inserisci il nome.");
                    return;
                }

                //controllo se la targa è stata inserita
                if(targa.getText().equals(null) || targa.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inserisci la targa.");
                    return;
                }

                if(Main.cont < Main.dim) {   //controllo che il parcheggio non sia pieno
                    for(int i = 0; i < Main.parcheggio.size();i++){

                        //controllo se la targa inserita esista già nel parcheggio
                        if(targa.getText().equals(Main.parcheggio.get(i).getTarga())){
                            JOptionPane.showMessageDialog(null, "Nel parcheggio è già presente un auto con questa targa.");
                            return;
                        }
                    }

                    //controllo se il formato dell'ora e della data d'ingresso sia corretto
                    try{
                        Integer.parseInt(ora.getText());
                        Integer.parseInt(minuti.getText());
                        Integer.parseInt(giorno.getText());
                        Integer.parseInt(mese.getText());
                        Integer.parseInt(anno.getText());
                    }catch (NumberFormatException numberFormatException){
                        JOptionPane.showMessageDialog(null, "Ora o data d'ingresso non valida.");
                        return;
                    }

                    Main.parcheggio.add(new Auto(nome.getText(), targa.getText())); //aggiungo una nuova auto alla lista
                    Main.parcheggio.get(Main.cont).setIngresso(
                            ora.getText(),
                            minuti.getText(),
                            giorno.getText(),
                            mese.getText(),
                            anno.getText()
                    );


                    FileWriter f2 = null; //deve essere inizializzata null
                    PrintWriter fOUT2 = null; //deve essere inizializzata null
                    try
                    {
                        f2=new FileWriter("AutoRimessa.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                        fOUT2=new PrintWriter(f2); //possibilità di scrivere
                    }
                    catch (IOException exception)
                    {
                        System.out.println("Errore di apertura del file.");
                        System.exit(1);
                    }

                    fOUT2.println(
                            nome.getText() + ";" +
                            targa.getText() + ";" +
                            ora.getText() + ";" +
                            minuti.getText() + ";" +
                            giorno.getText() + ";" +
                            mese.getText() + ";" +
                            anno.getText()
                    ); //scrivo sul buffer
                    fOUT2.flush(); //forzo la scrittura sul file
                    try
                    {
                        f2.close(); //chiusura del file
                    }
                    catch(IOException exception){
                        System.out.println("Errore di chiusura del file.");
                        System.exit(1);
                    }


                    tariffa.setText("Tariffa: " + Main.rata + "€ all'ora");
                    tariffa.append(
                            "\nNome: " +
                                nome.getText() +
                            "\nTarga: " +
                                targa.getText() +
                            "\nIngresso: " +
                                giorno.getText() + "/" +
                                mese.getText() + "/" +
                                anno.getText() + "-" +
                                ora.getText() + ":" +
                                minuti.getText()
                    );
                    Main.cont++;

                    FileWriter f3 = null; //deve essere inizializzata null
                    PrintWriter fOUT3 = null; //deve essere inizializzata null
                    try
                    {
                        f3=new FileWriter("PostiOccupati.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                        fOUT3=new PrintWriter(f3); //possibilità di scrivere
                    }
                    catch (IOException exception) {
                        System.out.println("Errore di apertura del file.");
                        System.exit(1);
                    }
                    fOUT3.println(Main.cont); //scrivo sul buffer
                    fOUT3.flush(); //forzo la scrittura sul file
                    try
                    {
                        f3.close(); //chiusura del file
                    }
                    catch(IOException exception){
                        System.out.println("Errore di chiusura del file.");
                        System.exit(1);
                    }

                    pbusy.setText(String.valueOf(Main.cont));
                    pfree.setText(String.valueOf(Main.dim-Main.cont));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Il parcheggio è pieno");
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ora.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                ora.setText("");
            }
        });
        minuti.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                minuti.setText("");
            }
        });
        giorno.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                giorno.setText("");
            }
        });
        mese.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                mese.setText("");
            }
        });
        anno.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                anno.setText("");
            }
        });
    }
}
