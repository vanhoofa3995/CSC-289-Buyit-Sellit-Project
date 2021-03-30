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

public class SwitchItemsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel switchCategoryLabel = new JLabel("SWITCH ITEMS");
    
    JButton switchItemButton1 = new JButton("V4 SWITCH");
    JButton switchItemButton2 = new JButton("V5 SWITCH");
    JButton switchItemButton3 = new JButton("WIRED KEYPAD");
    JButton switchItemButton4 = new JButton("EXTERNAL DRIVE");
    JButton switchItemButton5 = new JButton("V4 HAND PIECES");
    JButton switchItemButton6 = new JButton("V5 HAND PIECES");
    JButton switchItemButton7 = new JButton("HEADSET");
    JButton switchItemButton8 = new JButton("SERIES X3 MIC");
    JButton switchItemButton9 = new JButton("SERIES X4 MIC");
    JButton switchItemButton10 = new JButton("PARTS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    SwitchItemsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Switch Items Form");
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
        switchItemButton2.setBounds(20, 150, 140, 30);
        switchItemButton3.setBounds(20, 220, 140, 30);
        switchItemButton4.setBounds(20, 290, 140, 30);
        switchItemButton5.setBounds(20, 360, 140, 30); 
        switchItemButton6.setBounds(220, 80, 140, 30); 
        switchItemButton7.setBounds(220, 150, 140, 30); 
        switchItemButton8.setBounds(220, 220, 140, 30); 
        switchItemButton9.setBounds(220, 290, 140, 30); 
        switchItemButton10.setBounds(220, 360, 140, 30); 
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(switchCategoryLabel);
        
        frame.add(switchItemButton1);
        frame.add(switchItemButton2);
        frame.add(switchItemButton3);
        frame.add(switchItemButton4);
        frame.add(switchItemButton5);
        frame.add(switchItemButton6);
        frame.add(switchItemButton7);
        frame.add(switchItemButton8);
        frame.add(switchItemButton9);
        frame.add(switchItemButton10);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        switchItemButton1.addActionListener(this);
        switchItemButton2.addActionListener(this);
        switchItemButton3.addActionListener(this);
        switchItemButton4.addActionListener(this);
        switchItemButton5.addActionListener(this);
        switchItemButton6.addActionListener(this);
        switchItemButton7.addActionListener(this);
        switchItemButton8.addActionListener(this);
        switchItemButton9.addActionListener(this);
        switchItemButton10.addActionListener(this);
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
