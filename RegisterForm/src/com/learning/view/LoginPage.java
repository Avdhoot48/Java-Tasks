package com.learning.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.learning.controller.Controller;
import com.learning.model.*;
import com.learning.view.*;
public class LoginPage extends JFrame
{
	JLabel lblusrNm,lblusrPwd;
	JTextField txtNm,txtPwd;
	JButton btnSubmit,btnReset;
	//UserModel user;
	Controller controller;
	
	public LoginPage(UserModel model)
	{
		//Initialize
				lblusrNm=new JLabel("Name:");
				lblusrPwd=new JLabel("Password:");
				txtNm=new JTextField();
				txtPwd=new JTextField();
				btnSubmit=new JButton("Login");
				btnReset=new JButton("Cancel");
				controller = new Controller();
				
				//Set Bounds
				lblusrNm.setBounds(50, 40, 150, 50);
				txtNm.setBounds(170,40,120,40);
				lblusrPwd.setBounds(50, 100, 150, 50);
				txtPwd.setBounds(170,100 ,120 , 40);
				btnSubmit.setBounds(50, 160, 100, 50);
				btnReset.setBounds(190, 160, 100, 50);
				
				add(lblusrNm);
				add(lblusrPwd);
				add(txtNm);
				add(txtPwd);
				add(btnSubmit);
				add(btnReset);
				
				btnSubmit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String name=txtNm.getText();
						String pass=txtPwd.getText();
						//user = new UserModel(name, pass);
					
						 boolean valid= controller.loginUser(name,pass,model);
						if(valid)
						{
							HomePage home=new HomePage(model);
							setVisible(false);
							home.setVisible(true);
						}
						else
						{
							Failure fail = new Failure();
							setVisible(false);
							fail.setVisible(true);
						}
				}	
				});
				
				btnReset.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtNm.setText("");
						txtPwd.setText("");
				
					}
				});
				
				//Set JFrame
				setSize(350,350);
				setLayout(null);
				setVisible(true);
				setTitle("InputLayout");
	}
}
