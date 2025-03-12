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
public class LoginPage extends JFrame implements ActionListener{
    int loginjum = 0;
    JLabel unameLabel = new JLabel("username");
     JLabel passLabel = new JLabel("password");
     JTextField unameField = new JTextField();
     JPasswordField passwordField = new JPasswordField();
     
     JButton loginBtn = new JButton("Login");
     JButton resetBtn = new JButton("Reset");
    public LoginPage() {
        setVisible(true);
        setSize(720, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(unameLabel);
        add(passLabel);
        add(unameField);
        add(passwordField);
        add(loginBtn);
        add(resetBtn);
        
        unameLabel.setBounds(20, 84, 440, 12);
        passLabel.setBounds(20, 152, 440, 12);
        unameField.setBounds(18, 100, 440, 32);
        passwordField.setBounds(18, 170, 440, 32);
        
        loginBtn.setBounds(50, 220, 200, 32);
        resetBtn.setBounds(50, 280, 200, 32);
        
        loginBtn.addActionListener(this);
        resetBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (loginjum != 3) {
                
            
            if(e.getSource() == loginBtn){
                String username = this.unameField.getText();
                char[] password = this.passwordField.getPassword();
                String pass = new String(password);
                if (username.equals("1") && pass.equals("1")) {
                    new HalamanUtama(username);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Akun anda telah terkunci");
                    loginjum += 1;
                }
            
            }else if(e.getSource() == resetBtn){
                this.unameField.setText("");
                this.passwordField.setText("");
            
            }
            }else{
                loginBtn.setEnabled(false);
            }
        }catch(Exception error){
            
        }
    }
    
    
    
}
