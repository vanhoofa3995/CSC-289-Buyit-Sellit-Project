/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 4/24/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel userLabel = new JLabel("USERNAME");
    JLabel newPasswordLabel = new JLabel("NEW PASSWORD");
    JLabel newPasswordConfirmLabel = new JLabel("CONFIRM PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField newPasswordField = new JPasswordField();
    JPasswordField newPasswordConfirmField = new JPasswordField();
    JButton confirmButton = new JButton("SET NEW PASSWORD");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton loginButton = new JButton("LOGIN");
    JButton createAccountButton = new JButton("CREATE ACCOUNT");
    
    
    //Creating constructor
    ForgotPasswordForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Forgot Password Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        userLabel.setBounds(20, 150, 140, 30);
        newPasswordLabel.setBounds(20, 220, 140, 30);
        newPasswordConfirmLabel.setBounds(20, 290, 140, 30);
        userTextField.setBounds(185, 150, 150, 30);
        newPasswordField.setBounds(185, 220, 150, 30);
        newPasswordConfirmField.setBounds(185, 290, 150, 30);
        showPassword.setBounds(185, 320, 150, 30);
        showPassword.setBackground(Color.orange);
        confirmButton.setBounds(15, 370, 160, 30);
        resetButton.setBounds(185, 370, 160, 30);
        loginButton.setBounds(15, 410, 160, 30);
        createAccountButton.setBounds(185, 410, 160, 30);
    }
    public void addComponentsToFrame()
    {
        frame.add(userLabel);
        frame.add(newPasswordLabel);
        frame.add(newPasswordConfirmLabel);
        frame.add(userTextField);
        frame.add(newPasswordField);
        frame.add(newPasswordConfirmField);
        frame.add(showPassword);
        frame.add(confirmButton);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.add(createAccountButton);
    }
    public void actionEvent()
    {
        confirmButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        loginButton.addActionListener(this);
        createAccountButton.addActionListener(this);
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of CONFIRM button
        if (e.getSource() == confirmButton) {
            String username = userTextField.getText();
            String newpassword = newPasswordField.getText();
            String query = "UPDATE userProfile SET password='"+newpassword+"' WHERE userName='"+username+"' ";
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement(query);              
                
                if(newPasswordField.getText().equalsIgnoreCase(newPasswordConfirmField.getText()))
                {

                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"New Password Registered");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password Did Not Match");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            newPasswordField.setText("");
            newPasswordConfirmField.setText("");
        }
        
       //Coding Part of Login button
       if (e.getSource() == loginButton) {
            frame.dispose();    
            LoginForm frame = new LoginForm();
            frame.setTitle("Login Form");
            frame.setVisible(true);
            frame.setBounds(10, 10, 370, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);  
        }
       
       //Coding Part of Register button
       if (e.getSource() == createAccountButton) {
           frame.dispose();      
           new RegistrationForm();
        }
       
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                newPasswordField.setEchoChar((char) 0);
                newPasswordConfirmField.setEchoChar((char) 0);
            } else {
                newPasswordField.setEchoChar('*');
                newPasswordConfirmField.setEchoChar('*');
            }
 
 
        }

    }
}
