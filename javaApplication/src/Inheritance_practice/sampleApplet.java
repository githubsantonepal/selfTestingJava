/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_practice;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author santoshji
 */
public class sampleApplet extends JApplet{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("First Applet program",50,50);
        
    }
}
