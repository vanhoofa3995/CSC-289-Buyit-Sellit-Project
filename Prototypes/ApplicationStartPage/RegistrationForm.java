/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 3/20/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel lastNameLabel=new JLabel("LAST NAME");
    JLabel firstNameLabel=new JLabel("FIRST NAME");
    JLabel emailLabel=new JLabel("EMAIL");
    JLabel userNameLabel=new JLabel("USER NAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
    JLabel securityQuestionLabel=new JLabel("SECUIRITY QUESTION");
    JLabel securityAnswerLabel=new JLabel("SECUIRITY ANSWER");
    
    JTextField lastNameTextField=new JTextField();
    JTextField firstNameTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JTextField userNameField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JTextField securityQuestionTextField=new JTextField();
    JTextField securityAnswerTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    JButton loginButton = new JButton("LOGIN");
    JButton forgotPasswordButton = new JButton("FORGOT PASSWORD");
    
    
    
    //Creating constructor
    RegistrationForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        lastNameLabel.setBounds(20,20,100,70);
        firstNameLabel.setBounds(20,70,100,70);
        emailLabel.setBounds(20,120,100,70);
        userNameLabel.setBounds(20,170,100,70);
        passwordLabel.setBounds(20,220,100,70);
        confirmPasswordLabel.setBounds(20,270,140,70);
        securityQuestionLabel.setBounds(20,320,150,70);
        securityAnswerLabel.setBounds(20,370,150,70);
        
        lastNameTextField.setBounds(180,43,185,23);
        firstNameTextField.setBounds(180,93,185,23);
        emailTextField.setBounds(180,143,185,23);
        userNameField.setBounds(180,193,185,23);
        passwordField.setBounds(180,243,185,23);
        confirmPasswordField.setBounds(180,293,185,23);
        securityQuestionTextField.setBounds(180,343,185,23);
        securityAnswerTextField.setBounds(180,393,185,23);
        registerButton.setBounds(15,457,160,30);
        resetButton.setBounds(185,457,160,30);
        loginButton.setBounds(15,497,160,30);
        forgotPasswordButton.setBounds(185,497,160,30);
    }
    public void addComponentsToFrame()
    {
        frame.add(lastNameLabel);
        frame.add(firstNameLabel);
        frame.add(emailLabel);
        frame.add(userNameLabel);
        frame.add(passwordLabel);
        frame.add(confirmPasswordLabel);
        frame.add(securityQuestionLabel);
        frame.add(securityAnswerLabel);
        
        frame.add(lastNameTextField);
        frame.add(firstNameTextField);
        frame.add(emailTextField);
        frame.add(userNameField);
        frame.add(passwordField);
        frame.add(confirmPasswordField);
        frame.add(securityQuestionTextField);
        frame.add(securityAnswerTextField);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.add(forgotPasswordButton);
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        loginButton.addActionListener(this);
        forgotPasswordButton.addActionListener(this);
                
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userProfile(lastName,firstName,email,userName," 
                        + "password,securityQuestion,securityAnswer)" 
                        + " VALUES (?, ?, ?, ?, ?, ?, ?)");
                Pstatement.setString(1,lastNameTextField.getText());
                Pstatement.setString(2,firstNameTextField.getText());
                Pstatement.setString(3,emailTextField.getText());
                Pstatement.setString(4,userNameField.getText());
                Pstatement.setString(5,passwordField.getText());
                Pstatement.setString(6,securityQuestionTextField.getText());
                Pstatement.setString(7,securityAnswerTextField.getText());
                
                
                if(passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
                {

                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password Did Not Match");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        if(e.getSource()==resetButton)
        {
            lastNameTextField.setText("");
            firstNameTextField.setText("");
            emailTextField.setText("");
            userNameField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            securityQuestionTextField.setText("");
            securityAnswerTextField.setText("");
        }
        
        if (e.getSource() == loginButton) {
            frame.dispose();    
            LoginForm frame = new LoginForm();
            frame.setTitle("Login Form");
            frame.setVisible(true);
            frame.setBounds(10, 10, 370, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);  
        }
        
        if (e.getSource() == forgotPasswordButton) {
           frame.dispose();
           new ForgotPasswordForm();
        }

    }
}

