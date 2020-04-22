package com.learning.view;

import javax.swing.*;
import com.learning.model.*;
import com.learning.controller.*;

public class HomePage extends JFrame
{
	JLabel lblWelcome;
	public HomePage(UserModel model)
	{
		lblWelcome = new JLabel("Welcome to Home "+model.getUsrNm());
		lblWelcome.setBounds(40, 50, 120,50);
		
		add(lblWelcome);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
}
