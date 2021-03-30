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

public class PcItemsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel pcCategoryLabel = new JLabel("PC ITEMS");
    
    JButton pcItemButton1 = new JButton("CORSAIR KEYPAD");
    JButton pcItemButton2 = new JButton("GAMER KEYPAD");
    JButton pcItemButton3 = new JButton("USB DRIVE");
    JButton pcItemButton4 = new JButton("EXTERNAL DRIVE");
    JButton pcItemButton5 = new JButton("HEADSET");
    JButton pcItemButton6 = new JButton("SERIES X MIC");
    JButton pcItemButton7 = new JButton("CORSAIR MOUSE");
    JButton pcItemButton8 = new JButton("GAMER MOUSE");
    JButton pcItemButton9 = new JButton("SPEAKERS");
    JButton pcItemButton10 = new JButton("PARTS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PcItemsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Pc Items Form");
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
        pcItemButton2.setBounds(20, 150, 140, 30);
        pcItemButton3.setBounds(20, 220, 140, 30);
        pcItemButton4.setBounds(20, 290, 140, 30);
        pcItemButton5.setBounds(20, 360, 140, 30); 
        pcItemButton6.setBounds(220, 80, 140, 30); 
        pcItemButton7.setBounds(220, 150, 140, 30); 
        pcItemButton8.setBounds(220, 220, 140, 30); 
        pcItemButton9.setBounds(220, 290, 140, 30); 
        pcItemButton10.setBounds(220, 360, 140, 30); 
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(pcCategoryLabel);
        
        frame.add(pcItemButton1);
        frame.add(pcItemButton2);
        frame.add(pcItemButton3);
        frame.add(pcItemButton4);
        frame.add(pcItemButton5);
        frame.add(pcItemButton6);
        frame.add(pcItemButton7);
        frame.add(pcItemButton8);
        frame.add(pcItemButton9);
        frame.add(pcItemButton10);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        pcItemButton1.addActionListener(this);
        pcItemButton2.addActionListener(this);
        pcItemButton3.addActionListener(this);
        pcItemButton4.addActionListener(this);
        pcItemButton5.addActionListener(this);
        pcItemButton6.addActionListener(this);
        pcItemButton7.addActionListener(this);
        pcItemButton8.addActionListener(this);
        pcItemButton9.addActionListener(this);
        pcItemButton10.addActionListener(this);
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
