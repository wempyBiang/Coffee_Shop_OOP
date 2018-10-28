/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Panorama121
 */
public class Main extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public Main(){
        initial();
    }
    
    public void initial(){
        // supaya lebih mudah mengganti ukuran 
        int jarak = 50, width = 125, height = 125;
        int jarakH = 50;
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        setSize(1000,1000);
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(Color.yellow);
        setTitle("System");
        
        getContentPane().setLayout(null);
        
        //vertikal
        //stock
        lbl2 = new JLabel("Stock");
        btn2 = new JButton();
        btn2.setBounds(0, 0, width, height);
        btn2.setBackground(Color.ORANGE);
        lbl2.setFont(new Font("Arial",Font.PLAIN,16));
        btn2.add(lbl2);
        add(btn2);
        
        //coffee bean
        lbl3 = new JLabel("Coffee Bean");
        btn3 = new JButton();
        btn3.setBounds(0, (jarak+height), width, height);
        btn3.setBackground(Color.ORANGE);
        lbl3.setFont(new Font("Arial",Font.PLAIN,16));
        btn3.add(lbl3);
        add(btn3);
        
        //brew guide
        lbl4 = new JLabel("Brew Guide");
        btn4 = new JButton();
        btn4.setBounds(0, (jarak*2+height*2), width, height);
        btn4.setBackground(Color.ORANGE);
        lbl4.setFont(new Font("Arial",Font.PLAIN,16));
        add(btn4);
        btn4.add(lbl4);
        
        // horizontal
        //history
        lbl5 = new JLabel("History");
        btn5 = new JButton();
        btn5.setBounds(jarakH+width, 0, width, height);
        btn5.setBackground(Color.ORANGE);
        lbl5.setFont(new Font("Arial",Font.PLAIN,16));
        add(btn5);
        btn5.add(lbl5);
        
        //list order
        lbl6 = new JLabel("List Order");
        btn6 = new JButton();
        btn6.setBounds((jarakH*2+width*2), 0, width, height);
        btn6.setBackground(Color.ORANGE);
        lbl6.setFont(new Font("Arial",Font.PLAIN,16));
        add(btn6);
        btn6.add(lbl6);
        
        //coffee
        lbl7 = new JLabel("Coffee");
        btn7 = new JButton();
        btn7.setBounds(200,200, 300, 300);
        btn7.setBackground(Color.GRAY);
        lbl7.setFont(new Font("Arial",Font.PLAIN,25));
        add(btn7);
        btn7.add(lbl7);
        
        //tea
        lbl8 = new JLabel("Tea");
        btn8 = new JButton();
        btn8.setBounds(600,200, 300, 300);
        btn8.setBackground(Color.red);
        lbl8.setFont(new Font("Arial",Font.PLAIN,25));
        btn8.add(lbl8);
        add(btn8);
        
        //order
        lbl9 = new JLabel("Order");
        btn9 = new JButton();
        btn9.setBounds(850,700, 150, 100);
        btn9.setBackground(Color.ORANGE);
        lbl9.setFont(new Font("Arial",Font.PLAIN,16));
        add(btn9);
        btn9.add(lbl9);
        
        //cancel
        lbl10 = new JLabel("Cencel");
        btn10 = new JButton();
        btn10.setBounds(650,700, 150, 100);
        btn10.setBackground(Color.RED);
        lbl10.setFont(new Font("Arial",Font.PLAIN,16));
        add(btn10);
        btn10.add(lbl10);
        
        //total
        lbl11 = new JLabel("Rp. 000.000.00,-");
        lbl11.setMinimumSize(new Dimension(500, 200));
        pnl10 = new JPanel();
        pnl10.setBounds(650,0, 300, height);
        pnl10.setBackground(Color.ORANGE);
        lbl11.setFont(new Font("Arial",Font.PLAIN,16));
        add(pnl10);
        pnl10.add(lbl11);
    }
    
    
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;    
    
    
    JPanel pnl10;
    
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;
    JLabel lbl6;
    JLabel lbl7;
    JLabel lbl8;
    JLabel lbl9;
    JLabel lbl10;
    JLabel lbl11;
    
    
}
