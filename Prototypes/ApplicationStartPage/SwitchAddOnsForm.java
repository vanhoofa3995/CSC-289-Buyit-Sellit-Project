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

public class SwitchAddOnsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel switchCategoryLabel = new JLabel("SWITCH ADD-ONS");
    
    JButton switchItemButton1 = new JButton("STICKERS");
    JButton switchItemButton2 = new JButton("LIGHTS");
    JButton switchItemButton3 = new JButton("CASES");
    JButton switchItemButton4 = new JButton("DECORATIONS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    SwitchAddOnsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Switch Add-Ons Form");
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
        switchItemButton3.setBounds(220, 80, 140, 30); 
        switchItemButton4.setBounds(220, 150, 140, 30); 
        categoryReturnButton.setBounds(120, 220, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(switchCategoryLabel);
        
        frame.add(switchItemButton1);
        frame.add(switchItemButton2);
        frame.add(switchItemButton3);
        frame.add(switchItemButton4);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        switchItemButton1.addActionListener(this);
        switchItemButton2.addActionListener(this);
        switchItemButton3.addActionListener(this);
        switchItemButton4.addActionListener(this);
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
