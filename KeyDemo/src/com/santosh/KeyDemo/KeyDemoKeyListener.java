/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.KeyDemo;

/**
 *
 * @author santoshji
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDemoKeyListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key typed:"+ e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key pressed:"+ e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key released:"+ e.getKeyChar());

	}

}