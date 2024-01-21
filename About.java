/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(600, 200, 700,600);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/win1.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 90, 400, 100);
        add(l1);

//        ImageIcon w1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/apple.png"));
//        Image w2 = w1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
//        ImageIcon w3 = new ImageIcon(w2);
//        JLabel s1 = new JLabel(w3);
//        s1.setBounds(150, 40, 400, 80);
//        add(s1);
//
//        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/linux.png"));
//        Image p2 = p1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
//        ImageIcon p3 = new ImageIcon(p2);
//        JLabel c1 = new JLabel(p3);
//        c1.setBounds(150, 40, 400, 80);
//        add(c1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/logo.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 180, 70, 70);
        add(l2);
        
        
        JLabel l3 = new JLabel("<html>Shahkar Ahmad<br> Personal Notepad Version 2021<br>2021 Shahkar Ahmad. All rights reserved<br><br>Notepad is a word processing program, <br>which allows changing of text in a computer file.<br>Notepad is a simple text editor for basic text-editing program<br> which enables computer users to create documents. </html>");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(150, 130, 500, 300);
        add(l3);
        
        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
