/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 4/24/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginForm extends JFrame implements ActionListener {
    
    Container container = getContentPane();
        
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton forgotPasswordButton = new JButton("FORGOT PASSWORD");
    JButton createAccountButton = new JButton("CREATE ACCOUNT");
 
 
    LoginForm() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() {
        container.setLayout(null);
        container.setBounds(40,40,400,600);
        container.setBackground(Color.orange);
    }
 
    public void setLocationAndSize() {
        userLabel.setBounds(20, 220, 100, 30);
        passwordLabel.setBounds(20, 290, 100, 30);
        userTextField.setBounds(185, 220, 150, 30);
        passwordField.setBounds(185, 290, 150, 30);
        showPassword.setBounds(185, 320, 150, 30);
        showPassword.setBackground(Color.orange);
        loginButton.setBounds(15, 370, 160, 30);
        resetButton.setBounds(185, 370, 160, 30);
        forgotPasswordButton.setBounds(15, 410, 160, 30);
        createAccountButton.setBounds(185, 410, 160, 30);
 
 
    }
 
    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(forgotPasswordButton);
        container.add(createAccountButton);
        
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        forgotPasswordButton.addActionListener(this);
        createAccountButton.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = passwordField.getText();
            String query = "SELECT * FROM userProfile WHERE userName = ? AND password = ?";
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                ResultSet rs;
                PreparedStatement Pstatement=connection.prepareStatement(query);
                Pstatement.setString(1, username);
                Pstatement.setString(2, password);
                rs = Pstatement.executeQuery();
                
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Welcome "+username+"!");
                    dispose();
                    new BrowsingStockForm();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        
       //Coding Part of ForgotPassword button
       if (e.getSource() == forgotPasswordButton) {
           dispose();
           new ForgotPasswordForm();
        }
       
       //Coding Part of Register button
       if (e.getSource() == createAccountButton) {
           dispose();
           new RegistrationForm();
        }
       
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
 
}
