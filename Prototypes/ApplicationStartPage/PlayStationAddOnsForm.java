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

public class PlayStationAddOnsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel playStationCategoryLabel = new JLabel("PLAYSTATION ADD-ONS");
    
    JButton playStationItemButton1 = new JButton("STICKERS");
    JButton playStationItemButton2 = new JButton("LIGHTS");
    JButton playStationItemButton3 = new JButton("POP FIGURES");
    JButton playStationItemButton4 = new JButton("DECORATIONS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PlayStationAddOnsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("PlayStation Add-Ons Form");
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
        playStationItemButton3.setBounds(220, 80, 140, 30); 
        playStationItemButton4.setBounds(220, 150, 140, 30); 
        categoryReturnButton.setBounds(120, 220, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(playStationCategoryLabel);
        
        frame.add(playStationItemButton1);
        frame.add(playStationItemButton2);
        frame.add(playStationItemButton3);
        frame.add(playStationItemButton4);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        playStationItemButton1.addActionListener(this);
        playStationItemButton2.addActionListener(this);
        playStationItemButton3.addActionListener(this);
        playStationItemButton4.addActionListener(this);
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
