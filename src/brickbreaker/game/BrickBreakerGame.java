/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brickbreaker.game;

/**
 *
 * @author Md Shamshad Ansari
 */
import java.awt.Color;

import javax.swing.JFrame;

public class BrickBreakerGame {
	public static void main(String[] args) {
                System.err.println("Hello");
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);
		
	}

}

