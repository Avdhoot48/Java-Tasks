package com.learning.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Failure extends JFrame {
	public Failure()
	{
	JLabel lblError=new JLabel("Error");
	lblError.setBounds(40,50,120,40);
	add(lblError);
	
	setSize(350,350);
	setLayout(null);
	setVisible(true);
	}

}
