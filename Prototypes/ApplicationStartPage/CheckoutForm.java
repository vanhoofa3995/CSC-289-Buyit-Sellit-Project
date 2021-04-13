/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 4/13/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class CheckoutForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel userNameLabel=new JLabel("USER NAME");
    JLabel shippingAddressLabel=new JLabel("SHIP ADDRESS");
    JLabel billingAddressLabel=new JLabel("BILL ADDRESS");
    JLabel cardNumberLabel=new JLabel("CARD NUMBER");
    
    JTextField userNameField=new JTextField();
    JTextField shippingAddressField=new JTextField();
    JTextField billingAddressField=new JTextField();
    JTextField cardNumberField=new JTextField();
    
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    JButton returnButton = new JButton("RETURN");
    JButton completeButton = new JButton("COMPLETE");
    
    
    
    //Creating constructor
    CheckoutForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Checkout Form");
        frame.setBounds(40,40,400,400);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        userNameLabel.setBounds(20,20,100,70);
        shippingAddressLabel.setBounds(20,70,100,70);
        billingAddressLabel.setBounds(20,120,100,70);
        cardNumberLabel.setBounds(20,170,100,70);
        
        userNameField.setBounds(180,43,185,23);
        shippingAddressField.setBounds(180,93,185,23);
        billingAddressField.setBounds(180,143,185,23);
        cardNumberField.setBounds(180,193,185,23);
        
        registerButton.setBounds(15,263,160,30);
        resetButton.setBounds(185,263,160,30);
        returnButton.setBounds(15,303,160,30);
        completeButton.setBounds(185,303,160,30);
    }
    public void addComponentsToFrame()
    {
        frame.add(userNameLabel);
        frame.add(shippingAddressLabel);
        frame.add(billingAddressLabel);
        frame.add(cardNumberLabel);
                
        frame.add(userNameField);
        frame.add(shippingAddressField);
        frame.add(billingAddressField);
        frame.add(cardNumberField);
        
        frame.add(registerButton);
        frame.add(resetButton);
        frame.add(returnButton);
        frame.add(completeButton);
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        returnButton.addActionListener(this);
        completeButton.addActionListener(this);
                
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userProps(userName,shippingAddress,billingAddress,cardNumber)" 
                        + " VALUES (?, ?, ?, ?)");
                Pstatement.setString(1,userNameField.getText());
                Pstatement.setString(2,shippingAddressField.getText());
                Pstatement.setString(3,billingAddressField.getText());
                Pstatement.setString(4,cardNumberField.getText());                
                
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Registered Successfully");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }
        
        if(e.getSource()==resetButton)
        {
            shippingAddressField.setText("");
            billingAddressField.setText("");
            cardNumberField.setText("");
        }
        
        if (e.getSource() == returnButton) {
            frame.dispose();    
            new BrowsingStockForm();
        }
        
        if (e.getSource() == completeButton) {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement1=connection.prepareStatement("DROP table userCart");
                PreparedStatement Pstatement2=connection.prepareStatement("CREATE table userCart (\n"
                        + "itemName VARCHAR(20),\n"
                        + "itemPlatform VARCHAR(20),\n"
                        + "itemCount INTEGER,\n"
                        + "itemPrice INTEGER)");
                
                Pstatement1.executeUpdate();
                Pstatement2.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Registered Successfully");

            } catch (SQLException e1) {
                e1.printStackTrace();
            } 
           frame.dispose();
           String username = userNameField.getText();
           JOptionPane.showMessageDialog(null,"Thank you "+username+", for your purchase!\n "
                        + "You will receive an order confirmation via email within the hour.");
        }

    }
}
