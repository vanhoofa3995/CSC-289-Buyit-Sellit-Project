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

public class PlayStationGamesForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel playStationCategoryLabel = new JLabel("PLAYSTATION GAMES");
    
    JButton playStationItemButton1 = new JButton("GOD OF WAR");
    JButton playStationItemButton2 = new JButton("SUBNAUTICA");
    JButton playStationItemButton3 = new JButton("STRANDED DEEP");
    JButton playStationItemButton4 = new JButton("DYING LIGHT 2");
    JButton playStationItemButton5 = new JButton("SPIDER MAN");
    JButton playStationItemButton6 = new JButton("SNIPER");
    JButton playStationItemButton7 = new JButton("UNCHARTED");
    JButton playStationItemButton8 = new JButton("FORTNITE");
    JButton playStationItemButton9 = new JButton("FARCRY 6");
    JButton playStationItemButton10 = new JButton("RDR2");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PlayStationGamesForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("PlayStation Games Form");
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
        playStationItemButton2.setBounds(20, 150, 140, 30);
        playStationItemButton3.setBounds(20, 220, 140, 30);
        playStationItemButton4.setBounds(20, 290, 140, 30);
        playStationItemButton5.setBounds(20, 360, 140, 30); 
        playStationItemButton6.setBounds(220, 80, 140, 30); 
        playStationItemButton7.setBounds(220, 150, 140, 30); 
        playStationItemButton8.setBounds(220, 220, 140, 30); 
        playStationItemButton9.setBounds(220, 290, 140, 30); 
        playStationItemButton10.setBounds(220, 360, 140, 30); 
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(playStationCategoryLabel);
        
        frame.add(playStationItemButton1);
        frame.add(playStationItemButton2);
        frame.add(playStationItemButton3);
        frame.add(playStationItemButton4);
        frame.add(playStationItemButton5);
        frame.add(playStationItemButton6);
        frame.add(playStationItemButton7);
        frame.add(playStationItemButton8);
        frame.add(playStationItemButton9);
        frame.add(playStationItemButton10);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        playStationItemButton1.addActionListener(this);
        playStationItemButton2.addActionListener(this);
        playStationItemButton3.addActionListener(this);
        playStationItemButton4.addActionListener(this);
        playStationItemButton5.addActionListener(this);
        playStationItemButton6.addActionListener(this);
        playStationItemButton7.addActionListener(this);
        playStationItemButton8.addActionListener(this);
        playStationItemButton9.addActionListener(this);
        playStationItemButton10.addActionListener(this);
        categoryReturnButton.addActionListener(this);
        
        
    }
    
@Override

public void actionPerformed(ActionEvent e) {
        //Coding Part of RETURN button
        if (e.getSource() == categoryReturnButton) {
           frame.dispose();
           new BrowsingStockForm();
        }
               
        }

    }
