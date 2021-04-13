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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XboxItemsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel xboxCategoryLabel = new JLabel("XBOX ITEMS");
    
    JButton xboxItemButton1 = new JButton("XBOX 1");
    JButton addToCartButton1 = new JButton("ADD");
    JButton removeFromCartButton1 = new JButton("REM");
    
    JButton xboxItemButton2 = new JButton("XBOX 1 KEYPAD");
    JButton addToCartButton2 = new JButton("ADD");
    JButton removeFromCartButton2 = new JButton("REM");
    
    JButton xboxItemButton3 = new JButton("USB DRIVE");
    JButton addToCartButton3 = new JButton("ADD");
    JButton removeFromCartButton3 = new JButton("REM");
    
    JButton xboxItemButton4 = new JButton("EXTERNAL DRIVE");
    JButton addToCartButton4 = new JButton("ADD");
    JButton removeFromCartButton4 = new JButton("REM");
    
    JButton xboxItemButton5 = new JButton("S3 CONTROLLER");
    JButton addToCartButton5 = new JButton("ADD");
    JButton removeFromCartButton5 = new JButton("REM");
    
    JButton xboxItemButton6 = new JButton("S4 CONTROLLER");
    JButton addToCartButton6 = new JButton("ADD");
    JButton removeFromCartButton6 = new JButton("REM");
    
    JButton xboxItemButton7 = new JButton("HEADSET");
    JButton addToCartButton7 = new JButton("ADD");
    JButton removeFromCartButton7 = new JButton("REM");
    
    JButton xboxItemButton8 = new JButton("SERIES X3 MIC");
    JButton addToCartButton8 = new JButton("ADD");
    JButton removeFromCartButton8 = new JButton("REM");
    
    JButton xboxItemButton9 = new JButton("SERIES X4 MIC");
    JButton addToCartButton9 = new JButton("ADD");
    JButton removeFromCartButton9 = new JButton("REM");
    
    JButton xboxItemButton10 = new JButton("PARTS");
    JButton addToCartButton10 = new JButton("ADD");
    JButton removeFromCartButton10 = new JButton("REM");
    
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    XboxItemsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Xbox Items Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        xboxCategoryLabel.setBounds(150, 10, 140, 30);
        
        xboxItemButton1.setBounds(20, 80, 140, 30);
        addToCartButton1.setBounds(20, 110, 70, 20);
        removeFromCartButton1.setBounds(90, 110, 70, 20);
        
        xboxItemButton2.setBounds(20, 150, 140, 30);
        addToCartButton2.setBounds(20, 180, 70, 20);
        removeFromCartButton2.setBounds(90, 180, 70, 20);
        
        xboxItemButton3.setBounds(20, 220, 140, 30);
        addToCartButton3.setBounds(20, 250, 70, 20);
        removeFromCartButton3.setBounds(90, 250, 70, 20);
        
        xboxItemButton4.setBounds(20, 290, 140, 30);
        addToCartButton4.setBounds(20, 320, 70, 20);
        removeFromCartButton4.setBounds(90, 320, 70, 20);
        
        xboxItemButton5.setBounds(20, 360, 140, 30);
        addToCartButton5.setBounds(20, 390, 70, 20);
        removeFromCartButton5.setBounds(90, 390, 70, 20);
        
        xboxItemButton6.setBounds(220, 80, 140, 30);
        addToCartButton6.setBounds(220, 110, 70, 20);
        removeFromCartButton6.setBounds(290, 110, 70, 20);
        
        xboxItemButton7.setBounds(220, 150, 140, 30);
        addToCartButton7.setBounds(220, 180, 70, 20);
        removeFromCartButton7.setBounds(290, 180, 70, 20);
        
        xboxItemButton8.setBounds(220, 220, 140, 30);
        addToCartButton8.setBounds(220, 250, 70, 20);
        removeFromCartButton8.setBounds(290, 250, 70, 20);
        
        xboxItemButton9.setBounds(220, 290, 140, 30);
        addToCartButton9.setBounds(220, 320, 70, 20);
        removeFromCartButton9.setBounds(290, 320, 70, 20);
        
        xboxItemButton10.setBounds(220, 360, 140, 30);
        addToCartButton10.setBounds(220, 390, 70, 20);
        removeFromCartButton10.setBounds(290, 390, 70, 20);
        
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(xboxCategoryLabel);
        
        frame.add(xboxItemButton1);
        frame.add(addToCartButton1);
        frame.add(removeFromCartButton1);
        
        frame.add(xboxItemButton2);
        frame.add(addToCartButton2);
        frame.add(removeFromCartButton2);
        
        frame.add(xboxItemButton3);
        frame.add(addToCartButton3);
        frame.add(removeFromCartButton3);
        
        frame.add(xboxItemButton4);
        frame.add(addToCartButton4);
        frame.add(removeFromCartButton4);
        
        frame.add(xboxItemButton5);
        frame.add(addToCartButton5);
        frame.add(removeFromCartButton5);
        
        frame.add(xboxItemButton6);
        frame.add(addToCartButton6);
        frame.add(removeFromCartButton6);
        
        frame.add(xboxItemButton7);
        frame.add(addToCartButton7);
        frame.add(removeFromCartButton7);
        
        frame.add(xboxItemButton8);
        frame.add(addToCartButton8);
        frame.add(removeFromCartButton8);
        
        frame.add(xboxItemButton9);
        frame.add(addToCartButton9);
        frame.add(removeFromCartButton9);
        
        frame.add(xboxItemButton10);
        frame.add(addToCartButton10);
        frame.add(removeFromCartButton10);
        
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        xboxItemButton1.addActionListener(this);
        addToCartButton1.addActionListener(this);
        removeFromCartButton1.addActionListener(this);
        
        xboxItemButton2.addActionListener(this);
        addToCartButton2.addActionListener(this);
        removeFromCartButton2.addActionListener(this);
        
        xboxItemButton3.addActionListener(this);
        addToCartButton3.addActionListener(this);
        removeFromCartButton3.addActionListener(this);
        
        xboxItemButton4.addActionListener(this);
        addToCartButton4.addActionListener(this);
        removeFromCartButton4.addActionListener(this);
        
        xboxItemButton5.addActionListener(this);
        addToCartButton5.addActionListener(this);
        removeFromCartButton5.addActionListener(this);
        
        xboxItemButton6.addActionListener(this);
        addToCartButton6.addActionListener(this);
        removeFromCartButton6.addActionListener(this);
        
        xboxItemButton7.addActionListener(this);
        addToCartButton7.addActionListener(this);
        removeFromCartButton7.addActionListener(this);
        
        xboxItemButton8.addActionListener(this);
        addToCartButton8.addActionListener(this);
        removeFromCartButton8.addActionListener(this);
        
        xboxItemButton9.addActionListener(this);
        addToCartButton9.addActionListener(this);
        removeFromCartButton9.addActionListener(this);
        
        xboxItemButton10.addActionListener(this);
        addToCartButton10.addActionListener(this);
        removeFromCartButton10.addActionListener(this);
        
        categoryReturnButton.addActionListener(this);
        
        
    }
    
@Override

public void actionPerformed(ActionEvent e) {
        //Coding Part of RETURN button
        if (e.getSource() == categoryReturnButton) {
           frame.dispose();
           new BrowsingStockForm();
        }
        
        //Coding Part of xboxItemButton1
        if (e.getSource() == xboxItemButton1) {
           JOptionPane.showMessageDialog(null,"Xbox 1\n"
                   + "Upgraded version of the 360 console.\n"
                   + "Includes multiplayer benefits.\n"
                   + "Can play movies, games, and cds.\n"
                   + "Being sold for $150.00.");
        }
        
        if(e.getSource()==addToCartButton1)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Xbox 1', 'Xbox', 1, 150.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton1)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Xbox 1' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
            
        //Coding Part of xboxItemButton2
        if (e.getSource() == xboxItemButton2) {
           JOptionPane.showMessageDialog(null,"Xbox 1 Keypad\n"
                   + "Can be attached to the console with usb ports.\n"
                   + "Includes an advanced gamer key system.\n"
                   + "Has multi color lighting with each key.\n"
                   + "Being sold for $45.00.");
        }
        
        if(e.getSource()==addToCartButton2)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Xbox 1 Keypad', 'Xbox', 1, 45.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton2)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Xbox 1 Keypad' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton3
        if (e.getSource() == xboxItemButton3) {
           JOptionPane.showMessageDialog(null,"USB Drive\n"
                   + "Can be attached to the console with usb ports.\n"
                   + "Adda an aditional 20GB storage.\n"
                   + "Can store many types of data.\n"
                   + "Being sold for $25.00.");
        }
        
        if(e.getSource()==addToCartButton3)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('USB Drive', 'Xbox', 1, 25.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton3)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'USB Drive' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton4
        if (e.getSource() == xboxItemButton4) {
           JOptionPane.showMessageDialog(null,"External Drive\n"
                   + "Can be attached to the console with usb ports.\n"
                   + "Adda an aditional 360GB storage.\n"
                   + "Can store many types of data.\n"
                   + "Being sold for $50.00.");
        }
        
        if(e.getSource()==addToCartButton4)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('External Drive', 'Xbox', 1, 50.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton4)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'External Drive' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton5
        if (e.getSource() == xboxItemButton5) {
           JOptionPane.showMessageDialog(null,"S3 Controller\n"
                   + "Includes a multi button activation system.\n"
                   + "Comes with a wired charge pad.\n"
                   + "Does not require direct connection.\n"
                   + "Being sold for $40.00.");
        }
        
        if(e.getSource()==addToCartButton5)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('S3 Controller', 'Xbox', 1, 40.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton5)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'S3 Controller' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton6
        if (e.getSource() == xboxItemButton6) {
           JOptionPane.showMessageDialog(null,"S4 Controller\n"
                   + "Includes a multi button activation system.\n"
                   + "Comes with a wired charge pad.\n"
                   + "Does not require direct connection.\n"
                   + "Being sold for $45.00.");
        }
        
        if(e.getSource()==addToCartButton6)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('S4 Controller', 'Xbox', 1, 45.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton6)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'S4 Controller' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton7
        if (e.getSource() == xboxItemButton7) {
           JOptionPane.showMessageDialog(null,"Headset\n"
                   + "Has high quality sound benefits.\n"
                   + "Can be attached via controller port.\n"
                   + "Can also be attached via Pc port.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton7)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Headset', 'Xbox', 1, 20.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton7)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Headset' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton8
        if (e.getSource() == xboxItemButton8) {
           JOptionPane.showMessageDialog(null,"Series X3 Mic\n"
                   + "Has high quality sound benefits.\n"
                   + "Can be attached via controller port.\n"
                   + "Can also be attached via Pc port.\n"
                   + "Being sold for $40.00.");
        }
        
        if(e.getSource()==addToCartButton8)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Series X3 Mic', 'Xbox', 1, 40.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton8)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Series X3 Mic' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton9
        if (e.getSource() == xboxItemButton9) {
           JOptionPane.showMessageDialog(null,"Series X4 Mic\n"
                   + "Has higher quality sound benefits than the X3.\n"
                   + "Can be attached via controller port.\n"
                   + "Can also be attached via Pc port.\n"
                   + "Being sold for $45.00.");
        }
        
        if(e.getSource()==addToCartButton9)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Series X4 Mic', 'Xbox', 1, 45.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton9)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Series X4 Mic' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of xboxItemButton10
        if (e.getSource() == xboxItemButton10) {
           JOptionPane.showMessageDialog(null,"Parts\n"
                   + "Package includes all needed parts for repairs.\n"
                   + "Parts can only be used for Xbox hardware.\n"
                   + "If you have any questions about repairs call 910-999-9999.\n"
                   + "Being sold for $40.00.");
        }
        
        if(e.getSource()==addToCartButton10)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Parts', 'Xbox', 1, 40.00)");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Added To Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        if(e.getSource()==removeFromCartButton10)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("DELETE FROM" 
                        + " userCart"
                        + " WHERE itemName = 'Parts' AND itemPlatform = 'Xbox'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
               
        }

    }

