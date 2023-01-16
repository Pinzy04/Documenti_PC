package progParcheggio;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Calendar;
import java.util.StringTokenizer;


public class Uscita extends JFrame{

    private JPanel panel2;
    private JTextField targaField;
    private JTextField costoField;
    private JButton invioButton;
    private JButton exitButton;
    private JTextField ora;
    private JTextField minuti;
    private JTextField mese;
    private JTextField giorno;
    private JTextField anno;
    private JTextField textField1;
    private JTextField pbusy;
    private JTextField pfree;

    public Uscita(){
        pbusy.setText(String.valueOf(Main.cont));
        pfree.setText(String.valueOf(Main.dim-Main.cont));
        setContentPane(panel2);
        setTitle("Uscita");
        setSize(650, 300);
        setLocation(400, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        invioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(targaField.getText().equals(null) || targaField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "La targa non è stata inserita");
                    return;
                }
                boolean b = false;
                boolean v = false;
                if(Main.cont > 0){
                    for(int i=0; i<Main.parcheggio.size();i++) {
                        if (Main.parcheggio.get(i).getTarga().equals(targaField.getText())) {
                            b = true;
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
                            Main.parcheggio.get(i).setUscita(
                                    ora.getText(),
                                    minuti.getText(),
                                    giorno.getText(),
                                    mese.getText(),
                                    anno.getText()
                            );
                            if (Main.parcheggio.get(i).getIngresso().before(Main.parcheggio.get(i).getUscita())) {
                                v = true;
                                costoField.setText(Float.toString(Main.parcheggio.get(i).calcolaPrezzo()));
                                textField1.setText(Main.parcheggio.get(i).getNome() + " è uscito dal parcheggio.");

                                FileWriter f1 = null; //deve essere inizializzata null
                                PrintWriter fOUT1 = null; //deve essere inizializzata null
                                try
                                {
                                    f1=new FileWriter("AutoRimessa.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                                    fOUT1=new PrintWriter(f1); //possibilità di scrivere
                                }
                                catch (IOException exception)
                                {
                                    System.out.println("Errore di apertura del file.");
                                    System.exit(1);
                                }

                                fOUT1.println(
                                        Main.parcheggio.get(i).getNome() + ";" +
                                        Main.parcheggio.get(i).getTarga() + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.HOUR_OF_DAY) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.MINUTE) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.DATE) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.MONTH) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.YEAR)
                                ); //scrivo sul buffer
                                fOUT1.flush(); //forzo la scrittura sul file
                                try
                                {
                                    f1.close(); //chiusura del file
                                }
                                catch(IOException exception){
                                    System.out.println("Errore di chiusura del file.");
                                    System.exit(1);
                                }


                                FileWriter f2 = null; //deve essere inizializzata null
                                PrintWriter fOUT2 = null; //deve essere inizializzata null
                                try
                                {
                                    f2=new FileWriter("Storico.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                                    fOUT2=new PrintWriter(f2); //possibilità di scrivere
                                }
                                catch (IOException exception)
                                {
                                    System.out.println("Errore di apertura del file.");
                                    System.exit(1);
                                }

                                fOUT2.println(
                                        Main.parcheggio.get(i).getNome() + ";" +
                                        Main.parcheggio.get(i).getTarga() + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.HOUR_OF_DAY) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.MINUTE) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.DATE) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.MONTH) + ";" +
                                        Main.parcheggio.get(i).getIngresso().get(Calendar.YEAR) + ";" +

                                        Main.parcheggio.get(i).getUscita().get(Calendar.HOUR_OF_DAY) + ";" +
                                        Main.parcheggio.get(i).getUscita().get(Calendar.MINUTE) + ";" +
                                        Main.parcheggio.get(i).getUscita().get(Calendar.DATE) + ";" +
                                        Main.parcheggio.get(i).getUscita().get(Calendar.MONTH) + ";" +
                                        Main.parcheggio.get(i).getUscita().get(Calendar.YEAR)
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


                                Main.parcheggio.remove(i);
                                Main.cont--;
                                FileWriter f3 = null; //deve essere inizializzata null
                                PrintWriter fOUT3 = null; //deve essere inizializzata null
                                try
                                {
                                    f3=new FileWriter("PostiOccupati.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                                    fOUT3=new PrintWriter(f3); //possibilità di scrivere
                                }
                                catch (IOException exception)
                                {
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
                                break;
                            }
                        }
                    }
                    if(b==false){
                        JOptionPane.showMessageDialog(null, "Non ci sono auto con questa targa nel parcheggio.");
                        v=true;
                        return;
                    }
                    if(v==false){
                        JOptionPane.showMessageDialog(null, "La data d'uscita è precedente o uguale quella d'entrata");
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Il parcheggio è vuoto.");
                }
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
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
