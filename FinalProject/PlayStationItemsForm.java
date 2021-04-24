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

public class PlayStationItemsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel playStationCategoryLabel = new JLabel("PLAYSTATION ITEMS");
    
    JButton playStationItemButton1 = new JButton("PLAYSTATION 4");
    JButton addToCartButton1 = new JButton("ADD");
    JButton removeFromCartButton1 = new JButton("REM");
    
    JButton playStationItemButton2 = new JButton("PLAYSTATION 5");
    JButton addToCartButton2 = new JButton("ADD");
    JButton removeFromCartButton2 = new JButton("REM");
    
    JButton playStationItemButton3 = new JButton("USB DRIVE");
    JButton addToCartButton3 = new JButton("ADD");
    JButton removeFromCartButton3 = new JButton("REM");
    
    JButton playStationItemButton4 = new JButton("EXTERNAL DRIVE");
    JButton addToCartButton4 = new JButton("ADD");
    JButton removeFromCartButton4 = new JButton("REM");
    
    JButton playStationItemButton5 = new JButton("PS4 CONTROLLER");
    JButton addToCartButton5 = new JButton("ADD");
    JButton removeFromCartButton5 = new JButton("REM");
    
    JButton playStationItemButton6 = new JButton("PS5 CONTROLLER");
    JButton addToCartButton6 = new JButton("ADD");
    JButton removeFromCartButton6 = new JButton("REM");
    
    JButton playStationItemButton7 = new JButton("HEADSET");
    JButton addToCartButton7 = new JButton("ADD");
    JButton removeFromCartButton7 = new JButton("REM");
    
    JButton playStationItemButton8 = new JButton("SERIES X3 MIC");
    JButton addToCartButton8 = new JButton("ADD");
    JButton removeFromCartButton8 = new JButton("REM");
    
    JButton playStationItemButton9 = new JButton("SERIES X4 MIC");
    JButton addToCartButton9 = new JButton("ADD");
    JButton removeFromCartButton9 = new JButton("REM");
    
    JButton playStationItemButton10 = new JButton("PARTS");
    JButton addToCartButton10 = new JButton("ADD");
    JButton removeFromCartButton10 = new JButton("REM");
    
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PlayStationItemsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("PlayStation Items Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        playStationCategoryLabel.setBounds(150, 10, 140, 30);
        
        playStationItemButton1.setBounds(20, 80, 140, 30);
        addToCartButton1.setBounds(20, 110, 70, 20);
        removeFromCartButton1.setBounds(90, 110, 70, 20);
        
        playStationItemButton2.setBounds(20, 150, 140, 30);
        addToCartButton2.setBounds(20, 180, 70, 20);
        removeFromCartButton2.setBounds(90, 180, 70, 20);
        
        playStationItemButton3.setBounds(20, 220, 140, 30);
        addToCartButton3.setBounds(20, 250, 70, 20);
        removeFromCartButton3.setBounds(90, 250, 70, 20);
        
        playStationItemButton4.setBounds(20, 290, 140, 30);
        addToCartButton4.setBounds(20, 320, 70, 20);
        removeFromCartButton4.setBounds(90, 320, 70, 20);
        
        playStationItemButton5.setBounds(20, 360, 140, 30);
        addToCartButton5.setBounds(20, 390, 70, 20);
        removeFromCartButton5.setBounds(90, 390, 70, 20);
        
        playStationItemButton6.setBounds(220, 80, 140, 30);
        addToCartButton6.setBounds(220, 110, 70, 20);
        removeFromCartButton6.setBounds(290, 110, 70, 20);
        
        playStationItemButton7.setBounds(220, 150, 140, 30);
        addToCartButton7.setBounds(220, 180, 70, 20);
        removeFromCartButton7.setBounds(290, 180, 70, 20);
        
        playStationItemButton8.setBounds(220, 220, 140, 30);
        addToCartButton8.setBounds(220, 250, 70, 20);
        removeFromCartButton8.setBounds(290, 250, 70, 20);
        
        playStationItemButton9.setBounds(220, 290, 140, 30);
        addToCartButton9.setBounds(220, 320, 70, 20);
        removeFromCartButton9.setBounds(290, 320, 70, 20);
        
        playStationItemButton10.setBounds(220, 360, 140, 30);
        addToCartButton10.setBounds(220, 390, 70, 20);
        removeFromCartButton10.setBounds(290, 390, 70, 20);
        
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(playStationCategoryLabel);
        
        frame.add(playStationItemButton1);
        frame.add(addToCartButton1);
        frame.add(removeFromCartButton1);
        
        frame.add(playStationItemButton2);
        frame.add(addToCartButton2);
        frame.add(removeFromCartButton2);
        
        frame.add(playStationItemButton3);
        frame.add(addToCartButton3);
        frame.add(removeFromCartButton3);
        
        frame.add(playStationItemButton4);
        frame.add(addToCartButton4);
        frame.add(removeFromCartButton4);
        
        frame.add(playStationItemButton5);
        frame.add(addToCartButton5);
        frame.add(removeFromCartButton5);
        
        frame.add(playStationItemButton6);
        frame.add(addToCartButton6);
        frame.add(removeFromCartButton6);
        
        frame.add(playStationItemButton7);
        frame.add(addToCartButton7);
        frame.add(removeFromCartButton7);
        
        frame.add(playStationItemButton8);
        frame.add(addToCartButton8);
        frame.add(removeFromCartButton8);
        
        frame.add(playStationItemButton9);
        frame.add(addToCartButton9);
        frame.add(removeFromCartButton9);
        
        frame.add(playStationItemButton10);
        frame.add(addToCartButton10);
        frame.add(removeFromCartButton10);
        
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        playStationItemButton1.addActionListener(this);
        addToCartButton1.addActionListener(this);
        removeFromCartButton1.addActionListener(this);
        
        playStationItemButton2.addActionListener(this);
        addToCartButton2.addActionListener(this);
        removeFromCartButton2.addActionListener(this);
        
        playStationItemButton3.addActionListener(this);
        addToCartButton3.addActionListener(this);
        removeFromCartButton3.addActionListener(this);
        
        playStationItemButton4.addActionListener(this);
        addToCartButton4.addActionListener(this);
        removeFromCartButton4.addActionListener(this);
        
        playStationItemButton5.addActionListener(this);
        addToCartButton5.addActionListener(this);
        removeFromCartButton5.addActionListener(this);
        
        playStationItemButton6.addActionListener(this);
        addToCartButton6.addActionListener(this);
        removeFromCartButton6.addActionListener(this);
        
        playStationItemButton7.addActionListener(this);
        addToCartButton7.addActionListener(this);
        removeFromCartButton7.addActionListener(this);
        
        playStationItemButton8.addActionListener(this);
        addToCartButton8.addActionListener(this);
        removeFromCartButton8.addActionListener(this);
        
        playStationItemButton9.addActionListener(this);
        addToCartButton9.addActionListener(this);
        removeFromCartButton9.addActionListener(this);
        
        playStationItemButton10.addActionListener(this);
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
        
        //Coding Part of playStationItemButton1
        if (e.getSource() == playStationItemButton1) {
           JOptionPane.showMessageDialog(null,"Playstation 4\n"
                   + "Upgraded version of the Playstation 3.\n"
                   + "Includes multiplayer benefits.\n"
                   + "Can play games,movies and cds.\n"
                   + "Being sold for $150.00.");
        }
        
        if(e.getSource()==addToCartButton1)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Playstation 4', 'Playstation', 1, 150.00)");
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
                        + " WHERE itemName = 'Playstation 4' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
            
        //Coding Part of playStationItemButton2
        if (e.getSource() == playStationItemButton2) {
           JOptionPane.showMessageDialog(null,"Playstation 5\n"
                   + "Upgraded version of the Playstation 4.\n"
                   + "Includes multiplayer benefits.\n"
                   + "Can play games, and cds.\n"
                   + "Being sold for $150.00.");
        }
        
        if(e.getSource()==addToCartButton2)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Playstation 5', 'Playstation', 1, 150.00)");
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
                        + " WHERE itemName = 'Playstation 5' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton3
        if (e.getSource() == playStationItemButton3) {
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
                        + " VALUES ('USB Drive', 'Playstation', 1, 25.00)");
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
                        + " WHERE itemName = 'USB Drive' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton4
        if (e.getSource() == playStationItemButton4) {
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
                        + " VALUES ('External Drive', 'Playstation', 1, 50.00)");
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
                        + " WHERE itemName = 'External Drive' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton5
        if (e.getSource() == playStationItemButton5) {
           JOptionPane.showMessageDialog(null,"PS4 Controller\n"
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
                        + " VALUES ('PS4 Controller', 'Playstation', 1, 40.00)");
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
                        + " WHERE itemName = 'PS4 Controller' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton6
        if (e.getSource() == playStationItemButton6) {
           JOptionPane.showMessageDialog(null,"PS5 Controller\n"
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
                        + " VALUES ('PS5 Controller', 'Playstation', 1, 45.00)");
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
                        + " WHERE itemName = 'PS5 Controller' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton7
        if (e.getSource() == playStationItemButton7) {
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
                        + " VALUES ('Headset', 'Playstation', 1, 20.00)");
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
                        + " WHERE itemName = 'Headset' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton8
        if (e.getSource() == playStationItemButton8) {
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
                        + " VALUES ('Series X3 Mic', 'Playstation', 1, 40.00)");
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
                        + " WHERE itemName = 'Series X3 Mic' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton9
        if (e.getSource() == playStationItemButton9) {
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
                        + " VALUES ('Series X4 Mic', 'Playstation', 1, 45.00)");
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
                        + " WHERE itemName = 'Series X4 Mic' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of playStationItemButton10
        if (e.getSource() == playStationItemButton10) {
           JOptionPane.showMessageDialog(null,"Parts\n"
                   + "Package includes all needed parts for repairs.\n"
                   + "Parts can only be used for Playstation hardware.\n"
                   + "If you have any questions about repairs call 910-999-9999.\n"
                   + "Being sold for $40.00.");
        }
        
        if(e.getSource()==addToCartButton10)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Parts', 'Playstation', 1, 40.00)");
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
                        + " WHERE itemName = 'Parts' AND itemPlatform = 'Playstation'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
               
        }

    }
