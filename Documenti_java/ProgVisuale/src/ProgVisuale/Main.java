package ProgVisuale;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel panel1;
    private JTextField numero;
    private JButton a001Button;
    private JButton a0001Button;
    private JButton a01Button;
    private JButton a001Button3;
    private JButton a0001Button1;
    private JButton a01Button3;
    private JButton a1Button1;
    private JButton a1Button;
    private JButton a01Button2;
    private JButton a01Button1;
    private JButton a001Button2;
    private JButton a001Button1;

    public Main() {
        a001Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num;
                num = Float.parseFloat(numero.getText())*0.001f;
                numero.setText(Float.toString(num));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("es 1 pag 73");
        frame.setContentPane(new Main().panel1);
        frame.pack();
        frame.setVisible(true);
    }
}
