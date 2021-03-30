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

public class XboxItemsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel xboxCategoryLabel = new JLabel("XBOX ITEMS");
    
    JButton xboxItemButton1 = new JButton("XBOX 1");
    JButton xboxItemButton2 = new JButton("XBOX 1 KEYPAD");
    JButton xboxItemButton3 = new JButton("USB DRIVE");
    JButton xboxItemButton4 = new JButton("EXTERNAL DRIVE");
    JButton xboxItemButton5 = new JButton("S3 CONTROLLER");
    JButton xboxItemButton6 = new JButton("S4 CONTROLLER");
    JButton xboxItemButton7 = new JButton("HEADSET");
    JButton xboxItemButton8 = new JButton("SERIES X3 MIC");
    JButton xboxItemButton9 = new JButton("SERIES X4 MIC");
    JButton xboxItemButton10 = new JButton("PARTS");
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
        xboxItemButton2.setBounds(20, 150, 140, 30);
        xboxItemButton3.setBounds(20, 220, 140, 30);
        xboxItemButton4.setBounds(20, 290, 140, 30);
        xboxItemButton5.setBounds(20, 360, 140, 30); 
        xboxItemButton6.setBounds(220, 80, 140, 30); 
        xboxItemButton7.setBounds(220, 150, 140, 30); 
        xboxItemButton8.setBounds(220, 220, 140, 30); 
        xboxItemButton9.setBounds(220, 290, 140, 30); 
        xboxItemButton10.setBounds(220, 360, 140, 30); 
        categoryReturnButton.setBounds(120, 430, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(xboxCategoryLabel);
        
        frame.add(xboxItemButton1);
        frame.add(xboxItemButton2);
        frame.add(xboxItemButton3);
        frame.add(xboxItemButton4);
        frame.add(xboxItemButton5);
        frame.add(xboxItemButton6);
        frame.add(xboxItemButton7);
        frame.add(xboxItemButton8);
        frame.add(xboxItemButton9);
        frame.add(xboxItemButton10);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        xboxItemButton1.addActionListener(this);
        xboxItemButton2.addActionListener(this);
        xboxItemButton3.addActionListener(this);
        xboxItemButton4.addActionListener(this);
        xboxItemButton5.addActionListener(this);
        xboxItemButton6.addActionListener(this);
        xboxItemButton7.addActionListener(this);
        xboxItemButton8.addActionListener(this);
        xboxItemButton9.addActionListener(this);
        xboxItemButton10.addActionListener(this);
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
