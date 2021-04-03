/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 4/3/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchGamesForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel switchCategoryLabel = new JLabel("SWITCH GAMES");
    
    JButton switchItemButton1 = new JButton("AMONG US");
    JButton addToCartButton1 = new JButton("ADD");
    JButton removeFromCartButton1 = new JButton("REM");
    
    JButton switchItemButton2 = new JButton("FNAF");
    JButton addToCartButton2 = new JButton("ADD");
    JButton removeFromCartButton2 = new JButton("REM");
    
    JButton switchItemButton3 = new JButton("POKEMON GO");
    JButton addToCartButton3 = new JButton("ADD");
    JButton removeFromCartButton3 = new JButton("REM");
    
    JButton switchItemButton4 = new JButton("MONSTER HUNTER");
    JButton addToCartButton4 = new JButton("ADD");
    JButton removeFromCartButton4 = new JButton("REM");
    
    JButton switchItemButton5 = new JButton("HOLLOW KNIGHT");
    JButton addToCartButton5 = new JButton("ADD");
    JButton removeFromCartButton5 = new JButton("REM");
    
    JButton switchItemButton6 = new JButton("MARIO CART");
    JButton addToCartButton6 = new JButton("ADD");
    JButton removeFromCartButton6 = new JButton("REM");
    
    JButton switchItemButton7 = new JButton("ZELDA");
    JButton addToCartButton7 = new JButton("ADD");
    JButton removeFromCartButton7 = new JButton("REM");
    
    JButton switchItemButton8 = new JButton("CRASH");
    JButton addToCartButton8 = new JButton("ADD");
    JButton removeFromCartButton8 = new JButton("REM");
    
    JButton switchItemButton9 = new JButton("PLANTS/ZOMBIES");
    JButton addToCartButton9 = new JButton("ADD");
    JButton removeFromCartButton9 = new JButton("REM");
    
    JButton switchItemButton10 = new JButton("MARIO PARTY");
    JButton addToCartButton10 = new JButton("ADD");
    JButton removeFromCartButton10 = new JButton("REM");
    
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    SwitchGamesForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Switch Games Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        switchCategoryLabel.setBounds(150, 10, 140, 30);
        
        switchItemButton1.setBounds(20, 80, 140, 30);
        addToCartButton1.setBounds(20, 110, 70, 20);
        removeFromCartButton1.setBounds(90, 110, 70, 20);
        
        switchItemButton2.setBounds(20, 150, 140, 30);
        addToCartButton2.setBounds(20, 180, 70, 20);
        removeFromCartButton2.setBounds(90, 180, 70, 20);
        
        switchItemButton3.setBounds(20, 220, 140, 30);
        addToCartButton3.setBounds(20, 250, 70, 20);
        removeFromCartButton3.setBounds(90, 250, 70, 20);
        
        switchItemButton4.setBounds(20, 290, 140, 30);
        addToCartButton4.setBounds(20, 320, 70, 20);
        removeFromCartButton4.setBounds(90, 320, 70, 20);
        
        switchItemButton5.setBounds(20, 360, 140, 30);
        addToCartButton5.setBounds(20, 390, 70, 20);
        removeFromCartButton5.setBounds(90, 390, 70, 20);
        
        switchItemButton6.setBounds(220, 80, 140, 30);
        addToCartButton6.setBounds(220, 110, 70, 20);
        removeFromCartButton6.setBounds(290, 110, 70, 20);
        
        switchItemButton7.setBounds(220, 150, 140, 30);
        addToCartButton7.setBounds(220, 180, 70, 20);
        removeFromCartButton7.setBounds(290, 180, 70, 20);
        
        switchItemButton8.setBounds(220, 220, 140, 30);
        addToCartButton8.setBounds(220, 250, 70, 20);
        removeFromCartButton8.setBounds(290, 250, 70, 20);
        
        switchItemButton9.setBounds(220, 290, 140, 30);
        addToCartButton9.setBounds(220, 320, 70, 20);
        removeFromCartButton9.setBounds(290, 320, 70, 20);
        
        switchItemButton10.setBounds(220, 360, 140, 30);
        addToCartButton10.setBounds(220, 390, 70, 20);
        removeFromCartButton10.setBounds(290, 390, 70, 20);
        
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(switchCategoryLabel);
        
        frame.add(switchItemButton1);
        frame.add(addToCartButton1);
        frame.add(removeFromCartButton1);
        
        frame.add(switchItemButton2);
        frame.add(addToCartButton2);
        frame.add(removeFromCartButton2);
        
        frame.add(switchItemButton3);
        frame.add(addToCartButton3);
        frame.add(removeFromCartButton3);
        
        frame.add(switchItemButton4);
        frame.add(addToCartButton4);
        frame.add(removeFromCartButton4);
        
        frame.add(switchItemButton5);
        frame.add(addToCartButton5);
        frame.add(removeFromCartButton5);
        
        frame.add(switchItemButton6);
        frame.add(addToCartButton6);
        frame.add(removeFromCartButton6);
        
        frame.add(switchItemButton7);
        frame.add(addToCartButton7);
        frame.add(removeFromCartButton7);
        
        frame.add(switchItemButton8);
        frame.add(addToCartButton8);
        frame.add(removeFromCartButton8);
        
        frame.add(switchItemButton9);
        frame.add(addToCartButton9);
        frame.add(removeFromCartButton9);
        
        frame.add(switchItemButton10);
        frame.add(addToCartButton10);
        frame.add(removeFromCartButton10);
        
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        switchItemButton1.addActionListener(this);
        addToCartButton1.addActionListener(this);
        removeFromCartButton1.addActionListener(this);
        
        switchItemButton2.addActionListener(this);
        addToCartButton2.addActionListener(this);
        removeFromCartButton2.addActionListener(this);
        
        switchItemButton3.addActionListener(this);
        addToCartButton3.addActionListener(this);
        removeFromCartButton3.addActionListener(this);
        
        switchItemButton4.addActionListener(this);
        addToCartButton4.addActionListener(this);
        removeFromCartButton4.addActionListener(this);
        
        switchItemButton5.addActionListener(this);
        addToCartButton5.addActionListener(this);
        removeFromCartButton5.addActionListener(this);
        
        switchItemButton6.addActionListener(this);
        addToCartButton6.addActionListener(this);
        removeFromCartButton6.addActionListener(this);
        
        switchItemButton7.addActionListener(this);
        addToCartButton7.addActionListener(this);
        removeFromCartButton7.addActionListener(this);
        
        switchItemButton8.addActionListener(this);
        addToCartButton8.addActionListener(this);
        removeFromCartButton8.addActionListener(this);
        
        switchItemButton9.addActionListener(this);
        addToCartButton9.addActionListener(this);
        removeFromCartButton9.addActionListener(this);
        
        switchItemButton10.addActionListener(this);
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
        
        //Coding Part of switchItemButton1
        if (e.getSource() == switchItemButton1) {
           JOptionPane.showMessageDialog(null,"Among Us\n"
                   + "Open map role playing game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Switch, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton1)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Among Us', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Among Us' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
            
        //Coding Part of switchItemButton2
        if (e.getSource() == switchItemButton2) {
           JOptionPane.showMessageDialog(null,"FNAF\n"
                   + "Open map role playing game.\n"
                   + "Is not multiplayer.\n"
                   + "Can be played on Playstation, and Switch.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton2)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('FNAF', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'FNAF' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton3
        if (e.getSource() == switchItemButton3) {
           JOptionPane.showMessageDialog(null,"Pokemon Go\n"
                   + "Role playing game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, and Switch.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton3)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Pokemon Go', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Pokemon Go' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton4
        if (e.getSource() == switchItemButton4) {
           JOptionPane.showMessageDialog(null,"Hollow Knight\n"
                   + "Open world role playing first person fighter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Switch, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton4)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Hollow Knight', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Hollow Knight' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton5
        if (e.getSource() == switchItemButton5) {
           JOptionPane.showMessageDialog(null,"Monster Hunter\n"
                   + "Open world role playing first person shooter game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Switch, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton5)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Monster Hunter', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Monster Hunter' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton6
        if (e.getSource() == switchItemButton6) {
           JOptionPane.showMessageDialog(null,"Mario Cart\n"
                   + "Role playing third person racing game.\n"
                   + "Is multiplayer, and is cross platform compatable.\n"
                   + "Can be played on Playstation, Switch, Xbox, and Pc.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton6)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Mario Cart', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Mario Cart' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton7
        if (e.getSource() == switchItemButton7) {
           JOptionPane.showMessageDialog(null,"Zelda\n"
                   + "Role playing first person shooter game.\n"
                   + "Is not multiplayer.\n"
                   + "Can only be played on Switch.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton7)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Zelda', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Zelda' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton8
        if (e.getSource() == switchItemButton8) {
           JOptionPane.showMessageDialog(null,"Crash\n"
                   + "Role playing third person adventure game.\n"
                   + "Is not multiplayer.\n"
                   + "Can only be played on Switch.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton8)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Crash', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Crash' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton9
        if (e.getSource() == switchItemButton9) {
           JOptionPane.showMessageDialog(null,"Plants vs Zombies\n"
                   + "Role playing third person adventure game.\n"
                   + "Is not multiplayer.\n"
                   + "Can be played on Switch, and Xbox.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton9)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Plants vs Zombies', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Plants vs Zombies' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
        
        //Coding Part of switchItemButton10
        if (e.getSource() == switchItemButton10) {
           JOptionPane.showMessageDialog(null,"Mario Party\n"
                   + "Role playing third person adventure game.\n"
                   + "Is not multiplayer.\n"
                   + "Can only be played on Switch.\n"
                   + "Being sold for $20.00.");
        }
        
        if(e.getSource()==addToCartButton10)
        {
            try {
                Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/MyGamingDomainDataBase","VanHoofAlex","password");
                PreparedStatement Pstatement=connection.prepareStatement("INSERT INTO" 
                        + " userCart"
                        + " VALUES ('Mario Party', 'Switch', 1, 20.00)");
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
                        + " WHERE itemName = 'Mario Party' AND itemPlatform = 'Switch'");
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Item Removed From Cart!");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }


        }
               
        }

    }
