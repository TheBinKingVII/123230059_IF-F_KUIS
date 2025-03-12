/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230059_kuis_if.f;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener {
    
    String username;
    JLabel selamatDatang;
    JLabel pensilLabel = new JLabel("Pensil(Rp.2000)");
    JLabel pulpenLabel = new JLabel("Pulpen(Rp.5000)");
    JLabel bukuLabel = new JLabel("Buku Tulis(Rp.10000)");

    JTextField pensillField = new JTextField();
    JTextField pulpenField = new JTextField();
    JTextField bukuField = new JTextField();
    
    
    JButton beliBtn = new JButton("Beli");
    JButton logOut = new JButton("Log Out");

    public HalamanUtama(String uname) {
        this.username = uname;
        selamatDatang = new JLabel("Selamat datang, " + this.username);
        pensillField.setText("0");
        pulpenField.setText("0");
        bukuField.setText("0");
        setVisible(true);
        setSize(720, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(selamatDatang);
        add(pulpenLabel);
        add(pensilLabel);
        add(bukuLabel);
        add(pulpenField);
        add(pensillField);
        add(bukuField);
        add(beliBtn);
        add(logOut);
        
        selamatDatang.setBounds(20, 44, 440, 25);
        pensilLabel.setBounds(20, 104, 440, 25);
        pensillField.setBounds(200, 104, 200, 25);
        pulpenLabel.setBounds(20, 124, 440, 25);
        pulpenField.setBounds(200, 124, 200, 25);
        bukuLabel.setBounds(20, 144, 440, 25);
        bukuField.setBounds(200, 144, 200, 25);

        beliBtn.setBounds(50, 220, 200, 32);
        logOut.setBounds(50, 280, 200, 32);

        beliBtn.addActionListener(this);
        logOut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           try{
               if (e.getSource() == beliBtn) {
                   float diskon;
                   int jumPensil = Integer.parseInt(pensillField.getText());
                   int jumPulpen = Integer.parseInt(pulpenField.getText());
                   int jumBuku = Integer.parseInt(bukuField.getText());
                    int totalPensil = jumPensil * 2000;
                    int totalPulpen = jumPulpen * 5000;
                    int totalBuku = jumBuku * 10000;
                    
                    int totalBelanja = totalPensil + totalBuku + totalPulpen;
                    
                    if (totalBelanja > 100000) {
                       diskon = 0.2f;
                       JOptionPane.showMessageDialog(this, "Selamat anda mendapatkan diskon 20%");
                       new DaftarPembelian(jumPensil, jumPulpen, jumBuku, totalPensil, totalPulpen, totalBuku, diskon, totalBelanja, this.username);
                   }else if (totalBelanja > 50000){
                       diskon = 0.1f;
                       JOptionPane.showMessageDialog(this, "Selamat anda mendapatkan diskon 10%");
                       new DaftarPembelian(jumPensil, jumPulpen, jumBuku, totalPensil, totalPulpen, totalBuku, diskon, totalBelanja, this.username);
                        System.out.println(diskon);
                   }else{
                       diskon = 0f;
                       JOptionPane.showMessageDialog(this, "Maaf anda tidak mendapatkan diskon");
                       new DaftarPembelian(jumPensil, jumPulpen, jumBuku, totalPensil, totalPulpen, totalBuku, diskon, totalBelanja, this.username);
                   }
                   
               }else if(e.getSource()== logOut){
                   new LoginPage();
                   dispose();;
               }
           }catch(Exception error){
           
           }
    }

    

}
