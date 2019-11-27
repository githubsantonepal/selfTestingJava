/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.KeyDemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author santoshji
 */
public class Main {
	public static void main(String[] arguments) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new FlowLayout());
		//inheriting user defined class 
		KeyDemoKeyListener k= new KeyDemoKeyListener();
		JTextField field = new JTextField(20);
		field.addKeyListener(k);
		panel.add(field);
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}

}
