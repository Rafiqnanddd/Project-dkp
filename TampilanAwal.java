package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TampilanAwal {
    public TampilanAwal() {
        btnmasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textsatu.getText().equals("1")){
                    JOptionPane.showMessageDialog(null, "Anda Berhasil Masuk");
                    JFrame frame = new JFrame("");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setContentPane(new TugasAkhir().panel1);
                    frame.setVisible(true);
                    frame.setSize(930, 750);
                    frame.setLocation(850,350);



                }else{
                    JOptionPane.showMessageDialog(null,"Yang Anda Masukkan Salah");
                    textsatu.setText("");
                }
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setContentPane(new TampilanAwal().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(330, 250);
        frame.setResizable(true);
        frame.setLocation(850,350);

    }
    private JButton btnmasuk;
    private JTextField textsatu;
    private JPanel panel2;
}
