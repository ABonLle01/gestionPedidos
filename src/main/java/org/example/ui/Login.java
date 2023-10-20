package org.example.ui;

import javax.swing.*;

public class Login extends JFrame{
    private JPanel panel1;
    private JTextField txtEmail;
    private JButton btnLogin;
    private JPasswordField txtPassword;


    public Login(){
        this.setContentPane(panel1);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");




    }



    public void load(){
        setVisible(true);
    }
}
