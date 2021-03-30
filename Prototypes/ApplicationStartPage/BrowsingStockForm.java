/*
 * @author vanhoofa3995
 * @CSC-289-0B01
 * @Last Edit 3/30/21
 */

package applicationstartpage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrowsingStockForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel xboxCategoryLabel = new JLabel("XBOX");
    JLabel pcCategoryLabel = new JLabel("PC");    
    JLabel playStationCategoryLabel = new JLabel("PLAYSTATION");   
    JLabel switchCategoryLabel = new JLabel("SWITCH");
    
    JButton xboxGamesButton = new JButton("GAMES");
    JButton xboxItemsButton = new JButton("ITEMS");
    JButton xboxAddonsButton = new JButton("ADD-ONS");    
    JButton pcGamesButton = new JButton("GAMES");
    JButton pcItemsButton = new JButton("ITEMS");
    JButton pcAddonsButton = new JButton("ADD-ONS");    
    JButton playStationGamesButton = new JButton("GAMES");
    JButton playStationItemsButton = new JButton("ITEMS");
    JButton playStationAddonsButton = new JButton("ADD-ONS");
    JButton switchGamesButton = new JButton("GAMES");
    JButton switchItemsButton = new JButton("ITEMS");
    JButton switchAddonsButton = new JButton("ADD-ONS");  
    
    //Creating constructor
    BrowsingStockForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Browsing Stock Form");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.orange);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
    public void setLocationAndSize()
    {
        xboxCategoryLabel.setBounds(20, 10, 140, 30);
        xboxGamesButton.setBounds(20, 80, 140, 30);
        xboxItemsButton.setBounds(20, 150, 140, 30);
        xboxAddonsButton.setBounds(20, 220, 140, 30);
        
        pcCategoryLabel.setBounds(20, 290, 140, 30);
        pcGamesButton.setBounds(20, 360, 140, 30);
        pcItemsButton.setBounds(20, 430, 140, 30);
        pcAddonsButton.setBounds(20, 500, 140, 30);
        
        playStationCategoryLabel.setBounds(220, 10, 140, 30);
        playStationGamesButton.setBounds(220, 80, 140, 30);
        playStationItemsButton.setBounds(220, 150, 140, 30);
        playStationAddonsButton.setBounds(220, 220, 140, 30);
        
        switchCategoryLabel.setBounds(220, 290, 140, 30);
        switchGamesButton.setBounds(220, 360, 140, 30);
        switchItemsButton.setBounds(220, 430, 140, 30);
        switchAddonsButton.setBounds(220, 500, 140, 30);        
        
    }
    public void addComponentsToFrame()
    {
        frame.add(xboxCategoryLabel);
        
        frame.add(pcCategoryLabel);
        
        frame.add(playStationCategoryLabel);
        
        frame.add(switchCategoryLabel);

        frame.add(xboxGamesButton);
        frame.add(xboxItemsButton);
        frame.add(xboxAddonsButton);

        frame.add(pcGamesButton);
        frame.add(pcItemsButton);
        frame.add(pcAddonsButton);

        frame.add(playStationGamesButton);
        frame.add(playStationItemsButton);
        frame.add(playStationAddonsButton);

        frame.add(switchGamesButton);
        frame.add(switchItemsButton);
        frame.add(switchAddonsButton);
    }
    public void actionEvent()
    {
        xboxGamesButton.addActionListener(this);
        xboxItemsButton.addActionListener(this);
        xboxAddonsButton.addActionListener(this);
        
        pcGamesButton.addActionListener(this);
        pcItemsButton.addActionListener(this);
        pcAddonsButton.addActionListener(this);
        
        playStationGamesButton.addActionListener(this);
        playStationItemsButton.addActionListener(this);
        playStationAddonsButton.addActionListener(this);
        
        switchGamesButton.addActionListener(this);
        switchItemsButton.addActionListener(this);
        switchAddonsButton.addActionListener(this);
    }
    
@Override

public void actionPerformed(ActionEvent e) {
        //Coding Part of XBOX GAMES button
        if (e.getSource() == xboxGamesButton) {
           frame.dispose();
           new XboxGamesForm();
        }
        
        //Coding Part of XBOX ITEMS button
        if (e.getSource() == xboxItemsButton) {
           frame.dispose();
           new XboxItemsForm();
        }
        
        //Coding Part of XBOX ADD-ONS button
        if (e.getSource() == xboxAddonsButton) {
           frame.dispose();
           new XboxAddOnsForm();
        }
        
        //Coding Part of PC GAMES button
        if (e.getSource() == pcGamesButton) {
           frame.dispose();
           new PcGamesForm();
        }
        
        //Coding Part of PC ITEMS button
        if (e.getSource() == pcItemsButton) {
           frame.dispose();
           new PcItemsForm();
        }
        
        //Coding Part of PC ADD-ONS button
        if (e.getSource() == pcAddonsButton) {
           frame.dispose();
           new PcAddOnsForm();
        }
        
        //Coding Part of PLAYSTATION GAMES button
        if (e.getSource() == playStationGamesButton) {
           frame.dispose();
           new PlayStationGamesForm();
        }
        
        //Coding Part of PLAYSTATION ITEMS button
        if (e.getSource() == playStationItemsButton) {
           frame.dispose();
           new PlayStationItemsForm();
        }
        
        //Coding Part of PLAYSTATION ADD-ONS button
        if (e.getSource() == playStationAddonsButton) {
           frame.dispose();
           new PlayStationAddOnsForm();
        }
        
        //Coding Part of SWITCH GAMES button
        if (e.getSource() == switchGamesButton) {
           frame.dispose();
           new SwitchGamesForm();
        }
        
        //Coding Part of SWITCH ITEMS button
        if (e.getSource() == switchItemsButton) {
           frame.dispose();
           new SwitchItemsForm();
        }
        
        //Coding Part of SWITCH ADD-ONS button
        if (e.getSource() == switchAddonsButton) {
           frame.dispose();
           new SwitchAddOnsForm();
        }
        
       
        }

    }
