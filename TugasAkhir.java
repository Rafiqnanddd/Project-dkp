package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TugasAkhir {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DKP TUGAS AKHIR");
        frame.setContentPane(new TugasAkhir().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(930, 750);
        frame.setResizable(true);
        frame.setLocation(850,350);
    }
    public JPanel panel1;
    private JTextField textnamapelanggan;
    private JComboBox cmbkodepelanggan;
    private JTextField textketerangan;
    private JComboBox cmbkodebarang;
    private JTextField textnamabarang;
    private JTextField texthargabarang;
    private JTextField textsatuan;
    private JTextField textjumlahbeli;
    private JTextField texttotal;
    private JTextField textuangbayar;
    private JButton btnclear;
    private JTextField textkembalian;
    private JButton btnprosesbayar;
    private JButton btnprosestotal;
    private JButton btnnext;
    private JComboBox cmbsize;

    public TugasAkhir() {
        cmbkodepelanggan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kodepl,keterangan ;

                kodepl = String.valueOf(cmbkodepelanggan.getSelectedItem());

                if (kodepl.equals("KS101")){
                    keterangan = "Members";
                }else
                if (kodepl.equals("KS102")){
                    keterangan = " Non Members";
                }else
                {
                    keterangan = "Pelanggan biasa";
                }
                textketerangan.setText("" +keterangan);
            }
        });
        cmbkodebarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kdbarang,namabarang,satuan;
                double hargabarang;

                kdbarang = String.valueOf(cmbkodebarang.getSelectedItem());

                if (kdbarang.equals("BO011")){
                    namabarang="Vans";
                    hargabarang=625000;
                    satuan = "pasang";
                }else
                if (kdbarang.equals("BO012")){
                    namabarang="Compass";
                    hargabarang=560000;
                    satuan = "pasang";
                }else
                if (kdbarang.equals("BO013")){
                    namabarang="Ventela";
                    hargabarang=230000;
                    satuan = "pasang";
                }else
                if (kdbarang.equals("BO014")){
                    namabarang="Patrobas";
                    hargabarang=250000;
                    satuan = "pasang";
                }else
                {
                    namabarang="Jhonson";
                    hargabarang=280000;
                    satuan = "pasang";
                }
                textnamabarang.setText(""+namabarang);
                texthargabarang.setText(""+hargabarang);
                textsatuan.setText(""+satuan);
            }
        });
        textjumlahbeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnprosestotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double hargabarang,prosestotal;
                int jumlahbeli;

                hargabarang = Double.parseDouble(texthargabarang.getText());
                jumlahbeli = Integer.parseInt(textjumlahbeli.getText());

                prosestotal = (hargabarang * jumlahbeli);
                texttotal.setText(""+prosestotal);
            }
        });
        btnprosesbayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total,uangbayar,kembalian;

                total = Double.parseDouble(texttotal.getText());
                uangbayar = Double.parseDouble(textuangbayar.getText());

                if (uangbayar > total){
                    kembalian = uangbayar - total;
                    textkembalian.setText(""+kembalian);
                }else if(uangbayar == total) {
                    textkembalian.setText("Uang Anda Pas");
                }else {
                    textkembalian.setText("Uang Anda Kurang");
                }
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textnamapelanggan.setText("");
                cmbkodepelanggan.setSelectedItem(null);
                textketerangan.setText("");
                cmbkodebarang.setSelectedItem(null);
                textnamabarang.setText("");
                cmbsize.setSelectedItem(null);
                texthargabarang.setText("");
                textsatuan.setText("");
                textjumlahbeli.setText("");
                texttotal.setText("");
                textuangbayar.setText("");
                textkembalian.setText("");
                textnamapelanggan.requestFocus();

            }
        });
        btnnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textnamapelanggan.getText().isEmpty() || cmbkodepelanggan.getSelectedItem().equals("") || textketerangan.getText().isEmpty() || cmbkodebarang.getSelectedItem().equals("") || textnamabarang.getText().isEmpty() || cmbsize.getSelectedItem().equals("") || texthargabarang.getText().isEmpty() || textsatuan.getText().isEmpty() || textjumlahbeli.getText().isEmpty() || texttotal.getText().isEmpty()  || textuangbayar.getText().isEmpty() || textkembalian.getText().isEmpty())
                {JOptionPane.showMessageDialog(null, "Harap Isi Data");
                }else {
                    JOptionPane.showMessageDialog(null, "***Orderan Anda Segera Diproses***\n"+"Nama Pelanggan : " + textnamapelanggan.getText() + "\nKode Pelanggan : " + cmbkodepelanggan.getSelectedItem() + "\nKeterangan : "+ textketerangan.getText() + "\nKode Barang : " + cmbkodebarang.getSelectedItem() + "\nNama Barang : "+ textnamabarang.getText() + "\nHarga Barang : " + texthargabarang.getText() + "\nSatuan : " + textsatuan.getText() + "\nSize : " + cmbsize.getSelectedItem() + "\nJumlah Beli : " + textjumlahbeli.getText()  + "\nTotal : " + texttotal.getText() + "\nUang Bayar : "+ textuangbayar.getText() + "\nKembalian : " + textkembalian.getText() + "\n**-------------*-------------**");
                    JFrame frame = new JFrame("");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setContentPane(new TampilanAkhir().panel3);
                    frame.setVisible(true);
                    frame.setSize(930, 750);
                    frame.setLocation(850,350);
                }



            }
        });

    }

}
