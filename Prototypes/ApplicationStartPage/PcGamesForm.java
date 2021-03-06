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

public class PcGamesForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel pcCategoryLabel = new JLabel("PC GAMES");
    
    JButton pcItemButton1 = new JButton("MINECRAFT");
    JButton addToCartButton1 = new JButton("ADD");
    JButton removeFromCartButton1 = new JButton("REM");
    
    JButton pcItemButton2 = new JButton("OVERWATCH");
    JButton addToCartButton2 = new JButton("ADD");
    JButton removeFromCartButton2 = new JButton("REM");
    
    JButton pcItemButton3 = new JButton("FORTNITE");
    JButton addToCartButton3 = new JButton("ADD");
    JButton removeFromCartButton3 = new JButton("REM");
    
    JButton pcItemButton4 = new JButton("GTA 5");
    JButton addToCartButton4 = new JButton("ADD");
    JButton removeFromCartButton4 = new JButton("REM");
    
    JButton pcItemButton5 = new JButton("SEA OF THIEVES");
    JButton addToCartButton5 = new JButton("ADD");
    JButton removeFromCartButton5 = new JButton("REM");
    
    JButton pcItemButton6 = new JButton("LEFT 4 DEAD 4");
    JButton addToCartButton6 = new JButton("ADD");
    JButton removeFromCartButton6 = new JButton("REM");
    
    JButton pcItemButton7 = new JButton("FALLOUT 4");
    JButton addToCartButton7 = new JButton("ADD");
    JButton removeFromCartButton7 = new JButton("REM");
    
    JButton pcItemButton8 = new JButton("FALLOUT 76");
    JButton addToCartButton8 = new JButton("ADD");
    JButton removeFromCartButton8 = new JButton("REM");
    
    JButton pcItemButton9 = new JButton("DOOM");
    JButton addToCartButton9 = new JButton("ADD");
    JButton removeFromCartButton9 = new JButton("REM");
    
    JButton pcItemButton10 = new JButton("RDR2");
    JButton addToCartButton10 = new JButton("ADD");
    JButton removeFromCartButton10 = new JButton("REM");
    
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PcGamesForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Pc Games Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        pcCategoryLabel.setBounds(150, 10, 140, 30);
        
        pcItemButton1.setBounds(20, 80, 140, 30);
        addToCartButton1.setBounds(20, 110, 70, 20);
        removeFromCartButton1.setBounds(90, 110, 70, 20);
        
        pcItemButton2.setBounds(20, 150, 140, 30);
        addToCartButton2.setBounds(20, 180, 70, 20);
        removeFromCartButton2.setBounds(90, 180, 70, 20);
        
        pcItemButton3.setBounds(20, 220, 140, 30);
        addToCartButton3.setBounds(20, 250, 70, 20);
        removeFromCartButton3.setBounds(90, 250, 70, 20);
        
        pcItemButton4.setBounds(20, 290, 140, 30);
        addToCartButton4.setBounds(20, 320, 70, 20);
        removeFromCartButton4.setBounds(90, 320, 70, 20);
        
        pcItemButton5.setBounds(20, 360, 140, 30);
        addToCartButton5.setBounds(20, 390, 70, 20);
        removeFromCartButton5.setBounds(90, 390, 70, 20);
        
        pcItemButton6.setBounds(220, 80, 140, 30);
        addToCartButton6.setBounds(220, 110, 70, 20);
        removeFromCartButton6.setBounds(290, 110, 70, 20);
        
        pcItemButton7.setBounds(220, 150, 140, 30);
        addToCartButton7.setBounds(220, 180, 70, 20);
        removeFromCartButton7.setBounds(290, 180, 70, 20);
        
        pcItemButton8.setBounds(220, 220, 140, 30);
        addToCartButton8.setBounds(220, 250, 70, 20);
        removeFromCartButton8.setBounds(290, 250, 70, 20);
        
        pcItemButton9.setBounds(220, 290, 140, 30);
        addToCartButton9.setBounds(220, 320, 70, 20);
        removeFromCartButton9.setBounds(290, 320, 70, 20);
        
        pcItemButton10.setBounds(220, 360, 140, 30);
        addToCartButton10.setBounds(220, 390, 70, 20);
        removeFromCartButton10.setBounds(290, 390, 70, 20);
        
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(pcCategoryLabel);
        
        frame.add(pcItemButton1);
        frame.add(addToCartButton1);
        frame.add(removeFromCartButton1);
        
        frame.add(pcItemButton2);
        frame.add(addToCartButton2);
        frame.add(removeFromCartButton2);
        
        frame.add(pcItemButton3);
        frame.add(addToCartButton3);
        frame.add(removeFromCartButton3);
        
        frame.add(pcItemButton4);
        frame.add(addToCartButton4);
        frame.add(removeFromCartButton4);
        
        frame.add(pcItemButton5);
        frame.add(addToCartButton5);
        frame.add(removeFromCartButton5);
        
        frame.add(pcItemButton6);
        frame.add(addToCartButton6);
        frame.add(removeFromCartButton6);
        
        frame.add(pcItemButton7);
        frame.add(addToCartButton7);
        frame.add(removeFromCartButton7);
        
        frame.add(pcItemButton8);
        frame.add(addToCartButton8);
        frame.add(removeFromCartButton8);
        
        frame.add(pcItemButton9);
        frame.add(addToCartButton9);
        frame.add(removeFromCartButton9);
        
        frame.add(pcItemButton10);
        frame.add(addToCartButton10);
        frame.add(removeFromCartButton10);
        
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        pcItemButton1.addActionListener(this);
        addToCartButton1.addActionListener(this);
        removeFromCartButton1.addActionListener(this);
        
        pcItemButton2.addActionListener(this);
        addToCartButton2.addActionListener(this);
        removeFromCartButton2.addActionListener(this);
        
        pcItemButton3.addActionListener(this);
        addToCartButton3.addActionListener(this);
        removeFromCartButton3.addActionListener(this);
        
        pcItemButton4.addActionListener(this);
        addToCartButton4.addActionListener(this);
        removeFromCartButton4.addActionListener(this);
        
        pcItemButton5.addActionListener(this);
        addToCartButton5.addActionListener(this);
        removeFromCartButton5.addActionListener(this);
        
        pcItemButton6.addActionListener(this);
        addToCartButton6.addActionListener(this);
        removeFromCartButton6.addActionListener(this);
        
        pcItemButton7.addActionListener(this);
        addToCartButton7.addActionListener(this);
        removeFromCartButton7.addActionListener(this);
        
        pcItemButton8.addActionListener(this);
        addToCartButton8.addActionListener(this);
        removeFromCartButton8.addActionListener(this);
        
        pcItemButton9.addActionListener(this);
        addToCartButton9.addActionListener(this);
        removeFromCartButton9.addActionListener(this);
        
        pcItemButton10.addActionListener(this);
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
        
        //Coding Part of pcItemButton1
        if (e.getSource() == pcItemButton1) {
           JOptionPane.showMessageDialog(null,"Minecraft\n"
                   + "Open world role playing game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Xbox, Switch, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton1)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Minecraft', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Minecraft' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
            
        //Coding Part of pcItemButton2
        if (e.getSource() == pcItemButton2) {
           JOptionPane.showMessageDialog(null,"Overwatch\n"
                   + "Open map role playing first person shooter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton2)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Overwatch', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Overwatch' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton3
        if (e.getSource() == pcItemButton3) {
           JOptionPane.showMessageDialog(null,"Fortnite\n"
                   + "Open world role playing first person shooter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton3)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Fortnite', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Fortnite' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton4
        if (e.getSource() == pcItemButton4) {
           JOptionPane.showMessageDialog(null,"GTA 5\n"
                   + "Role playing first person shooter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton4)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('GTA 5', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'GTA 5' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton5
        if (e.getSource() == pcItemButton5) {
           JOptionPane.showMessageDialog(null,"Sea of Thieves\n"
                   + "Open world role playing game.\n"
                   + "Is multiplayer, but not cross platform compatable.\n"
                   + "Can be played on Playstation, Pc, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton5)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Sea of Thieves', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Sea of Thieves' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton6
        if (e.getSource() == pcItemButton6) {
           JOptionPane.showMessageDialog(null,"Left 4 Dead 4\n"
                   + "Role playing first person fighter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton6)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Left 4 Dead 4', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Left 4 Dead 4' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton7
        if (e.getSource() == pcItemButton7) {
           JOptionPane.showMessageDialog(null,"FALLOUT 4\n"
                   + "Open world role playing first person shooter game.\n"
                   + "Is not multiplayer.\n"
                   + "Can be played on Playstation, Pc, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton7)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('FALLOUT 4', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'FALLOUT 4' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton8
        if (e.getSource() == pcItemButton8) {
           JOptionPane.showMessageDialog(null,"FALLOUT 76\n"
                   + "Open world role playing first person shooter game.\n"
                   + "Is not multiplayer.\n"
                   + "Can be played on Playstation, Pc, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton8)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('FALLOUT 76', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'FALLOUT 76' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton9
        if (e.getSource() == pcItemButton9) {
           JOptionPane.showMessageDialog(null,"Doom\n"
                   + "Role playing first person fighter game.\n"
                   + "Is not multiplayer.\n"
                   + "Can be played on Switch, Pc, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton9)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Doom', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'Doom' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of pcItemButton10
        if (e.getSource() == pcItemButton10) {
           JOptionPane.showMessageDialog(null,"RDR2\n"
                   + "Open world role playing first person shooter game.\n"
                   + "Is not multiplayer, but not cross platform compatable.\n"
                   + "Can be played on Playstation, Pc, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton10)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('RDR2', 'Pc', 1, 20.00)");
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
                        + " WHERE itemName = 'RDR2' AND itemPlatform = 'Pc'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
               
        }

    }
