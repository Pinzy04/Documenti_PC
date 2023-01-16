package ProgGeografia;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Geografia extends JFrame{

    private JPanel mainPanel;
    private JTextField nomeField;
    private JTextField popField;
    private JTextField pilField;
    private JTextField supField;
    private JButton inserisciStatoButton;
    private JTextField ricercaField;
    private JTextField popField2;
    private JTextField pilField2;
    private JTextField supField2;
    private JButton cercaButton;
    private JTextField rimuoviField;
    private JButton rimuoviButton;
    private JButton visualizzaElencoButton;
    private JComboBox modo;
    private JComboBox categoria;
    private JTextArea console;
    private JButton EXITButton;
    private JTextArea elencoArea;
    private JButton emptyButton;
    private JPanel inserimento;
    private JPanel ricerca;
    private JPanel gestione;
    private JPanel elenco;
    private JLabel bandiera;
    private JPanel bandieraPanel;

    public Geografia(){

        setContentPane(mainPanel);
        setTitle("Geografia");
        setSize(1100, 850);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JOptionPane.showMessageDialog(null, "Metti la finestra a schermo intero");

        //mostro l'elenco nell'apposita area
            for(int i = 0; i < Main.elenco.size(); i++) {
                elencoArea.append(Main.elenco.get(i).toString(i) + "\n");
            }

        //inserimento di uno stato
            inserisciStatoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    //controllo che non ci siano TextField vuoti
                        if (nomeField.getText().equals(null) || nomeField.getText().equals("")) {
                            console.setText("Errore durante l'inserimento dei dati");
                            JOptionPane.showMessageDialog(null, "Inserisci il nome dello stato.");
                            return;
                        }
                        if (popField.getText().equals(null) || popField.getText().equals("")) {
                            console.setText("Errore durante l'inserimento dei dati");
                            JOptionPane.showMessageDialog(null, "Inserisci la popolazione dello stato.");
                            return;
                        }
                        if (pilField.getText().equals(null) || pilField.getText().equals("")) {
                            console.setText("Errore durante l'inserimento dei dati");
                            JOptionPane.showMessageDialog(null, "Inserisci il PIL dello stato.");
                            return;
                        }
                        if (supField.getText().equals(null) || supField.getText().equals("")) {
                            console.setText("Errore durante l'inserimento dei dati");
                            JOptionPane.showMessageDialog(null, "Inserisci la superficie dello stato.");
                            return;
                        }

                    //aggiusto maiuscole e minuscole nel nome dello stato
                        StringBuilder nomeAggiustato = new StringBuilder();
                        String[] nomeSeparato = nomeField.getText().split(" ");

                        for (String nome : nomeSeparato) {

                            if (nome.length() <= 3 && !nome.equals(nomeSeparato[nomeSeparato.length - 1]) && !nome.equals(nomeSeparato[0])) {
                                for (int i = 0; i < nome.length(); i++) {
                                    nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                }
                            } else {
                                nomeAggiustato.append(nome.toUpperCase().charAt(0));
                                for (int i = 1; i < nome.length(); i++) {
                                    nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                }
                            }

                            nomeAggiustato.append(" ");
                        }

                        nomeAggiustato.deleteCharAt(nomeAggiustato.length() - 1);
                        nomeField.setText(nomeAggiustato.toString());

                    //controllo che lo stato non sia gia stato inserito
                        for(int i = 0; i < Main.elenco.size(); i++) {
                            if (Main.elenco.get(i).getNome().equals(nomeField.getText())) {
                                console.setText("Stato già inserito.");
                                JOptionPane.showMessageDialog(null, "Questo stato è già stato inserito.");
                                return;
                            }
                        }

                    //controllo se il formato dei dati sia corretto
                        try{
                            Integer.parseInt(popField.getText());
                            Integer.parseInt(pilField.getText());
                            Integer.parseInt(supField.getText());
                        }catch (NumberFormatException numberFormatException){
                            console.setText("Errore durante l'inserimento dei dati.");
                            JOptionPane.showMessageDialog(null, "La popolazione, il PIL o la superficie non sono dei numeri interi.");
                            return;
                        }

                    //aggiungo un nuovo stato alla lista
                        Main.elenco.add(new Stato (
                                nomeField.getText(),
                                Integer.parseInt(popField.getText()),
                                Integer.parseInt(pilField.getText()),
                                Integer.parseInt(supField.getText())
                        ));
                    //scrivo nella console che è stato aggiunto un nuovo stato
                        console.setText("È stato aggiunto un nuovo stato:" +
                                "\nNome: " + nomeField.getText() + ";" +
                                "\nPopolazione: " + popField.getText() + ";" +
                                "\nPIL: " + pilField.getText() + ";" +
                                "\nSuperficie: " + supField.getText() + "."
                        );
                    //ordino l'elenco in base alle opzioni selezionate
                        if(categoria.getSelectedItem().equals("Nome")){
                            if(modo.getSelectedItem().equals("Crescente")){
                                Main.elenco.sort(Comparator.comparing(Stato::getNome));
                            }else{
                                Main.elenco.sort(Comparator.comparing(Stato::getNome).reversed());
                            }
                        }

                        if(categoria.getSelectedItem().equals("Popolazione")){
                            if(modo.getSelectedItem().equals("Crescente")){
                                Main.elenco.sort(Comparator.comparing(Stato::getPop));
                            }else{
                                Main.elenco.sort(Comparator.comparing(Stato::getPop).reversed());
                            }
                        }

                        if(categoria.getSelectedItem().equals("PIL")){
                            if(modo.getSelectedItem().equals("Crescente")){
                                Main.elenco.sort(Comparator.comparing(Stato::getPil));
                            }else{
                                Main.elenco.sort(Comparator.comparing(Stato::getPil).reversed());
                            }
                        }

                        if(categoria.getSelectedItem().equals("Superficie")){
                            if(modo.getSelectedItem().equals("Crescente")){
                                Main.elenco.sort(Comparator.comparing(Stato::getSup));
                            }else{
                                Main.elenco.sort(Comparator.comparing(Stato::getSup).reversed());
                            }
                        }

                    //visualizzo nell'area
                        elencoArea.setText("");
                        for(int i = 0; i < Main.elenco.size(); i++) {
                            elencoArea.append(Main.elenco.get(i).toString(i) + "\n");
                        }

                    //scrivo nel file i dati dello stato appena inserito
                        FileWriter f = null; //deve essere inizializzata null
                        PrintWriter fOUT = null; //deve essere inizializzata null
                        try
                        {
                            f=new FileWriter("Elenco_Stati.txt",true); //apertura del file ElencoCittà e contemporanea creazione
                            fOUT=new PrintWriter(f); //possibilità di scrivere
                        }
                        catch (IOException exception)
                        {
                            System.out.println("Errore di apertura del file.");
                            System.exit(1);
                        }

                        fOUT.println(nomeField.getText() + ";" + popField.getText() + ";" + pilField.getText() + ";" + supField.getText()); //scrivo sul buffer
                        fOUT.flush(); //forzo la scrittura sul file
                        try
                        {
                            f.close(); //chiusura del file
                        }
                        catch(IOException exception){
                            System.out.println("Errore di chiusura del file.");
                            System.exit(1);
                        }
                }
            });

        //ricerca di uno stato
            cercaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean f = false;
                    boolean b = true;
                    if(!Main.elenco.isEmpty()) {
                        if(ricercaField.getText().equals(null) || ricercaField.getText().equals("")){
                            console.setText("Non hai scritto il nome dello stato che vuoi cercare.");
                            JOptionPane.showMessageDialog(null, "Inserisci il nome dello stato che vuoi cercare.");
                            return;
                        }

                        //aggiusto maiuscole e minuscole nel nome dello stato
                            StringBuilder nomeAggiustato = new StringBuilder();
                            String[] nomeSeparato = ricercaField.getText().split(" ");

                            for (String nome : nomeSeparato) {

                                if (nome.length() <= 3 && !nome.equals(nomeSeparato[nomeSeparato.length - 1]) && !nome.equals(nomeSeparato[0])) {
                                    for (int i = 0; i < nome.length(); i++) {
                                        nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                    }
                                } else {
                                    nomeAggiustato.append(nome.toUpperCase().charAt(0));
                                    for (int i = 1; i < nome.length(); i++) {
                                        nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                    }
                                }

                                nomeAggiustato.append(" ");
                            }

                            nomeAggiustato.deleteCharAt(nomeAggiustato.length() - 1);
                            ricercaField.setText(nomeAggiustato.toString());


                        for (int i = 0; i < Main.elenco.size(); i++) {
                            if(ricercaField.getText().equals(Main.elenco.get(i).getNome())){
                                f = true;
                                popField2.setText(String.valueOf(Main.elenco.get(i).getPop()));
                                pilField2.setText(String.valueOf(Main.elenco.get(i).getPil()));
                                supField2.setText(String.valueOf(Main.elenco.get(i).getSup()));
                                String nome2 = ricercaField.getText();
                                try {
                                    ricercaField.setText(ricercaField.getText().replace("D'a", "A"));
                                    ImageIO.read(new File("images\\" + ricercaField.getText().replace(" ", "_") + ".jpg"));
                                    ricercaField.setText(nome2);
                                }catch (IOException exception){
                                    bandiera.setIcon(null);
                                    bandiera.setText("Bandiera non trovata.");
                                    b = false;
                                }
                                if(b){
                                    bandiera.setText(null);
                                    ricercaField.setText(ricercaField.getText().replace("D'a", "A"));
                                    ImageIcon flag = new ImageIcon("images\\" + ricercaField.getText().replace(" ", "_") + ".jpg");
                                    bandiera.setIcon(flag);
                                    ricercaField.setText(nome2);
                                }
                                console.setText("Stato trovato.");

                                return;
                            }
                        }
                        if (!f) {
                            console.setText("Stato non trovato.");
                            JOptionPane.showMessageDialog(null, "Lo stato richiesto non risulta presente nell'elenco.");
                        }
                    } else{
                        console.setText("Elenco vuoto.");
                        JOptionPane.showMessageDialog(null, "L'elenco è vuoto.");
                    }
                }
            });

        //rimozione di uno stato dall'elenco
            rimuoviButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean f = false;
                    if(!Main.elenco.isEmpty()) {
                        if(rimuoviField.getText().equals(null) || rimuoviField.getText().equals("")){
                            console.setText("Non hai scritto il nome dello stato che vuoi rimuovere.");
                            JOptionPane.showMessageDialog(null, "Inserisci il nome dello stato che vuoi rimuovere.");
                            return;
                        }

                        //aggiusto maiuscole e minuscole nel nome dello stato
                            StringBuilder nomeAggiustato = new StringBuilder();
                            String[] nomeSeparato = rimuoviField.getText().split(" ");

                            for (String nome : nomeSeparato) {



                                if (nome.length() <= 3 && !nome.equals(nomeSeparato[nomeSeparato.length - 1]) && !nome.equals(nomeSeparato[0])) {
                                    for (int i = 0; i < nome.length(); i++) {
                                        nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                    }
                                } else {
                                    nomeAggiustato.append(nome.toUpperCase().charAt(0));
                                    for (int i = 1; i < nome.length(); i++) {
                                        nomeAggiustato.append(nome.toLowerCase().charAt(i));
                                    }
                                }

                                nomeAggiustato.append(" ");
                            }

                            String nome2 = ricercaField.getText();
                            nomeAggiustato.deleteCharAt(nomeAggiustato.length() - 1);
                            rimuoviField.setText(nomeAggiustato.toString());


                        ricercaField.setText(ricercaField.getText().replace("D'a", "A"));
                        ricercaField.setText(ricercaField.getText().replace(" ", "_"));
                        ricercaField.setText(nome2);

                        for (int i = 0; i < Main.elenco.size(); i++) {
                            if(rimuoviField.getText().equals(Main.elenco.get(i).getNome())){
                                f = true;
                                console.setText("Stato rimosso.");
                                Main.elenco.remove(i);

                                //ordino l'elenco in base alle opzioni selezionate
                                    if(categoria.getSelectedItem().equals("Nome")){
                                        if(modo.getSelectedItem().equals("Crescente")){
                                            Main.elenco.sort(Comparator.comparing(Stato::getNome));
                                        }else{
                                            Main.elenco.sort(Comparator.comparing(Stato::getNome).reversed());
                                        }
                                    }

                                    if(categoria.getSelectedItem().equals("Popolazione")){
                                        if(modo.getSelectedItem().equals("Crescente")){
                                            Main.elenco.sort(Comparator.comparing(Stato::getPop));
                                        }else{
                                            Main.elenco.sort(Comparator.comparing(Stato::getPop).reversed());
                                        }
                                    }

                                    if(categoria.getSelectedItem().equals("PIL")){
                                        if(modo.getSelectedItem().equals("Crescente")){
                                            Main.elenco.sort(Comparator.comparing(Stato::getPil));
                                        }else{
                                            Main.elenco.sort(Comparator.comparing(Stato::getPil).reversed());
                                        }
                                    }

                                    if(categoria.getSelectedItem().equals("Superficie")){
                                        if(modo.getSelectedItem().equals("Crescente")){
                                            Main.elenco.sort(Comparator.comparing(Stato::getSup));
                                        }else{
                                            Main.elenco.sort(Comparator.comparing(Stato::getSup).reversed());
                                        }
                                    }

                                //riscrivo gli stati
                                    FileWriter fr = null; //deve essere inizializzata null
                                    PrintWriter fOUT = null; //deve essere inizializzata null
                                    try
                                    {
                                        fr=new FileWriter("Elenco_Stati.txt"); //apertura del file ElencoCittà e contemporanea creazione
                                        fOUT=new PrintWriter(fr); //possibilità di scrivere
                                    }
                                    catch (IOException exception)
                                    {
                                        System.out.println("Errore di apertura del file.");
                                        System.exit(1);
                                    }

                                    for(int j = 0; j < Main.elenco.size(); j++){
                                        fOUT.append(Main.elenco.get(j).getNome() + ";" + Main.elenco.get(j).getPop() + ";" + Main.elenco.get(j).getPil() + ";" + Main.elenco.get(j).getSup() + "\n"); //scrivo sul buffer
                                        fOUT.flush(); //forzo la scrittura sul file
                                    }
                                    try
                                    {
                                        fr.close(); //chiusura del file
                                    }
                                    catch(IOException exception){
                                        System.out.println("Errore di chiusura del file.");
                                        System.exit(1);
                                    }

                                //visualizzo nell'area
                                    elencoArea.setText("");
                                    for(i = 0; i < Main.elenco.size(); i++) {
                                        elencoArea.append(Main.elenco.get(i).toString(i) + "\n");
                                    }
                                return;
                            }
                        }
                        if (f==false) {
                            console.setText("Errore nella rimozione dello stato.");
                            JOptionPane.showMessageDialog(null, "Lo stato richiesto non risulta presente nell'elenco.");
                        }
                    } else{
                        console.setText("Elenco vuoto.");
                        JOptionPane.showMessageDialog(null, "L'elenco è vuoto.");
                    }
                }
            });

        //visualizzo l'elenco nell'apposita area
        visualizzaElencoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Main.elenco.isEmpty()) {
                    console.setText("Elenco vuoto.");
                    elencoArea.setText("");
                    JOptionPane.showMessageDialog(null, "L'elenco è vuoto.");
                    return;
                }
                int i;
                //ordino l'elenco in base alle opzioni selezionate
                    if(categoria.getSelectedItem().equals("Nome")){
                        if(modo.getSelectedItem().equals("Crescente")){
                            console.setText("Elenco ordinato per nome crescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getNome));
                        }else{
                            console.setText("Elenco ordinato per nome decrescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getNome).reversed());
                        }
                    }

                    if(categoria.getSelectedItem().equals("Popolazione")){
                        if(modo.getSelectedItem().equals("Crescente")){
                            console.setText("Elenco ordinato per popolazione crescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getPop));
                        }else{
                            console.setText("Elenco ordinato per popolazione decrescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getPop).reversed());
                        }
                    }

                    if(categoria.getSelectedItem().equals("PIL")){
                        if(modo.getSelectedItem().equals("Crescente")){
                            console.setText("Elenco ordinato per PIL crescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getPil));
                        }else{
                            console.setText("Elenco ordinato per PIL decrescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getPil).reversed());
                        }
                    }

                    if(categoria.getSelectedItem().equals("Superficie")){
                        if(modo.getSelectedItem().equals("Crescente")){
                            console.setText("Elenco ordinato per superficie crescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getSup));
                        }else{
                            console.setText("Elenco ordinato per superficie decrescente.");
                            Main.elenco.sort(Comparator.comparing(Stato::getSup).reversed());
                        }
                    }
                //visualizzo nell'area
                elencoArea.setText("");
                for(i = 0; i < Main.elenco.size(); i++) {
                    elencoArea.append(Main.elenco.get(i).toString(i) + "\n");
                }
            }
        });

        //cancello il contenuto del file
            emptyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FileWriter f = null; //deve essere inizializzata null
                    PrintWriter fOUT = null; //deve essere inizializzata null
                    try
                    {
                        f=new FileWriter("Elenco_Stati.txt"); //apertura del file Elenco_Stati e contemporanea creazione
                        fOUT=new PrintWriter(f); //possibilità di scrivere
                    }
                    catch (IOException exception)
                    {
                        System.out.println("Errore di apertura del file.");
                        System.exit(1);
                    }

                    Writer.nullWriter();    //cancello il contenuto del file
                    fOUT.flush();   //forzo la scrittura sul file

                    Main.elenco.clear();
                    elencoArea.setText("");

                    console.setText("Elenco degli stati svuotato.");

                    try
                    {
                        f.close(); //chiusura del file
                    }
                    catch(IOException exception){
                        System.out.println("Errore di chiusura del file.");
                        System.exit(1);
                    }
                }
            });

        //chiusura del programma
            EXITButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    console.setText("Stai sucendo dal programma...");
                    System.exit(0);
                }
            });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        bandiera = new JLabel(new ImageIcon(""));
    }
}
