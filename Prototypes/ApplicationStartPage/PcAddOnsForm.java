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

public class PcAddOnsForm implements ActionListener {
    JFrame frame;
    
    //Creating objects
    JLabel pcCategoryLabel = new JLabel("PC ADD-ONS");
    
    JButton pcItemButton1 = new JButton("STICKERS");
    JButton pcItemButton2 = new JButton("LIGHT STRIPS");
    JButton pcItemButton3 = new JButton("POP FIGURES");
    JButton pcItemButton4 = new JButton("DECORATIONS");
    JButton categoryReturnButton = new JButton("RETURN");
        
    //Creating constructor
    PcAddOnsForm()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Pc Add-Ons Form");
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
        pcItemButton3.setBounds(220, 80, 140, 30); 
        pcItemButton4.setBounds(220, 150, 140, 30); 
        categoryReturnButton.setBounds(120, 220, 140, 30);               
        
    }
    public void addComponentsToFrame()
    {
        frame.add(pcCategoryLabel);
        
        frame.add(pcItemButton1);
        frame.add(pcItemButton2);
        frame.add(pcItemButton3);
        frame.add(pcItemButton4);
        frame.add(categoryReturnButton);
        
    }
    public void actionEvent()
    {
        pcItemButton1.addActionListener(this);
        pcItemButton2.addActionListener(this);
        pcItemButton3.addActionListener(this);
        pcItemButton4.addActionListener(this);
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
