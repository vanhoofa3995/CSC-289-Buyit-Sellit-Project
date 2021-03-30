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

public class XboxAddOnsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel xboxCategoryLabel = new JLabel("XBOX ADD-ONS");
    
    JButton xboxItemButton1 = new JButton("STICKERS");
    JButton xboxItemButton2 = new JButton("LIGHTS");
    JButton xboxItemButton3 = new JButton("POP FIGURES");
    JButton xboxItemButton4 = new JButton("DECORATIONS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    XboxAddOnsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Xbox Add-Ons Form");
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
        xboxItemButton3.setBounds(220, 80, 140, 30); 
        xboxItemButton4.setBounds(220, 150, 140, 30); 
        categoryReturnButton.setBounds(120, 220, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(xboxCategoryLabel);
        
        frame.add(xboxItemButton1);
        frame.add(xboxItemButton2);
        frame.add(xboxItemButton3);
        frame.add(xboxItemButton4);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        xboxItemButton1.addActionListener(this);
        xboxItemButton2.addActionListener(this);
        xboxItemButton3.addActionListener(this);
        xboxItemButton4.addActionListener(this);
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
