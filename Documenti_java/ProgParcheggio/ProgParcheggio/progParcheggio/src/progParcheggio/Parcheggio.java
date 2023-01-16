package progParcheggio;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parcheggio extends JFrame{
    private JPanel panel1;
    private JTextField postiField;
    private JTextField tariffaField;
    private JButton invioButton;
    private JButton resettaPostiButton;

    public Parcheggio(){
        setContentPane(panel1);
        setTitle("RimessaAutomobili");
        setSize(350, 175);
        setLocation(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        FileReader f2 = null;
        BufferedReader fIN2 = null;
        String s2;

        try {
            f2 = new FileReader("PostiOccupati.txt");
            fIN2 = new BufferedReader(f2);
        } catch (IOException e) {
            System.out.println("Errore nell'apertura del file");
            System.exit(1);
        }
        try {
            s2 = fIN2.readLine();
            Main.cont = Integer.parseInt(s2);

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file");
            System.exit(1);
        }
        try {
            f2.close();
        } catch (IOException e) {
            System.out.println("Errore nella chiusura del file");
            System.exit(1);
        }

        invioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //controllo se la dimensione del parcheggio è stata inserita correttamente
                try{
                    Main.dim = Integer.parseInt(postiField.getText());
                }catch (NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null, "Posti non valido.");
                    return;
                }

                //controllo se la tariffa è stata inserita correttamente
                try{
                    Main.rata = Float.parseFloat(tariffaField.getText());
                }catch (NumberFormatException numberFormatException){
                    JOptionPane.showMessageDialog(null, "Tariffa non valida.");
                    return;
                }

                Arrivo frame2 = new Arrivo(); //creo la finestra per l'entrata delle auto
                Uscita frame3 = new Uscita(); //creo la finestra per l'uscita delle auto
                setVisible(false); //nascondo la finestra
            }
        });
        resettaPostiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.cont = 0;
            }
        });
    }
}
