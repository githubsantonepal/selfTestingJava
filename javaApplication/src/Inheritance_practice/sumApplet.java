/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_practice;

import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author santoshji
 */
public class sumApplet extends JApplet {
    private double sum;
    @Override
    public void init(){
        String fn=JOptionPane.showInputDialog("Enter First Number");
        String sn=JOptionPane.showInputDialog("Enter Second Number");
        double n1=Double.parseDouble(fn);
        double n2=Double.parseDouble(sn);
        sum =n1+n2; 
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("The total sum ::: "+sum,50,70);
    }
}
