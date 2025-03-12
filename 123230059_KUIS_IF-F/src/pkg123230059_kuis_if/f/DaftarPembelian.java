/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230059_kuis_if.f;

import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Lab Informatika
 */
public class DaftarPembelian extends JFrame implements ActionListener{
    int jumPensil,  jumPulpen,  jumBuku,  totalPensil,  totalPulpen,  totalBuku, subTotal;
    String uname;
    float diskon;
    JLabel title = new JLabel("Daftar Pembelian");
    JLabel pensilLabel;
    JLabel pulpenLabel;
    JLabel bukuLabel;
    JLabel subTotalLabel;
    JLabel diskonLabel;
    JLabel totalhargaLabel;
    JButton kembali = new JButton("kembali");

    public DaftarPembelian(int jumPensil, int jumPulpen, int jumBuku, int totalPensil, int totalPulpen, int totalBuku, float diskon, int subTotal, String uname) {
        this.jumPensil = jumPensil;
        this.jumPulpen = jumPulpen;
        this.jumBuku = jumBuku;
        this.totalPensil = totalPensil;
        this.totalPulpen = totalPulpen;
        this.totalBuku = totalBuku;
        this.diskon = diskon;
        this.subTotal = subTotal;
        this.uname = uname;
        pensilLabel = new JLabel("Pensil : " + this.jumPensil + "x Rp2.000 = Rp " + this.totalPensil );
        pulpenLabel = new JLabel("Pulpen : " + this.jumPulpen + "x Rp5.000 = Rp " + this.totalPulpen);
        bukuLabel = new JLabel("Buku Tulis : " + this.jumBuku + "x Rp10.000 = Rp " + this.totalBuku);
        subTotalLabel = new JLabel("Subtotal : Rp " + this.subTotal);
        if (this.diskon == 0.2f) {
            diskonLabel = new JLabel("Diskon 20% = " + (int)(0.2f * this.subTotal));
            totalhargaLabel = new JLabel("Total Harga = Rp "+ (int)(0.8f * this.subTotal ));
            
        }else if(this.diskon == 0.1f){
            diskonLabel = new JLabel("Diskon 10% = " + (int)(0.1f * this.subTotal));
            
            totalhargaLabel = new JLabel("Total Harga = Rp "+ (int)(0.9f * this.subTotal ));
        }else{
            diskonLabel = new JLabel("Diskon 0% = 0 ");
            totalhargaLabel = new JLabel("Total Harga = Rp "+ this.subTotal);
        }
        
        
        
        setVisible(true);
        setSize(720, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(title);
        add(pensilLabel);
        add(pulpenLabel);
        add(bukuLabel);
        add(diskonLabel);
        add(subTotalLabel);
        add(totalhargaLabel);
        add(kembali);
        
        title.setBounds(20, 64, 440, 25);
        pensilLabel.setBounds(20, 104, 440, 25);
        pulpenLabel.setBounds(20, 144, 440, 25);
        bukuLabel.setBounds(20, 184, 440, 25);
        diskonLabel.setBounds(20, 284, 440, 25);
        subTotalLabel.setBounds(20, 244, 440, 25);
        totalhargaLabel.setBounds(20, 324, 440, 25);
        kembali.setBounds(20, 364, 440, 25);
        
        kembali.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == kembali) {
                new HalamanUtama(this.uname);
                dispose();
                
            }
        }catch(Exception error){
            
        }
    }
    
}
