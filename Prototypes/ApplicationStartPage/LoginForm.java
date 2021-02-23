package applicationstartpage;

import javax.swing.*;
import java.awt.*;
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
        container.setBackground(Color.green);
    }
 
    public void setLocationAndSize() {
        userLabel.setBounds(20, 150, 100, 30);
        passwordLabel.setBounds(20, 220, 100, 30);
        userTextField.setBounds(185, 150, 150, 30);
        passwordField.setBounds(185, 220, 150, 30);
        showPassword.setBounds(185, 250, 150, 30);
        showPassword.setBackground(Color.green);
        loginButton.setBounds(15, 300, 160, 30);
        resetButton.setBounds(185, 300, 160, 30);
        forgotPasswordButton.setBounds(15, 340, 160, 30);
        createAccountButton.setBounds(185, 340, 160, 30);
 
 
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
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("vanhoofa3995") && pwdText.equalsIgnoreCase("password")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
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
