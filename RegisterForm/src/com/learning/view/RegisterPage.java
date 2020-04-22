package com.learning.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.learning.controller.*;
import com.learning.model.*;

public class RegisterPage extends JFrame
{
	JLabel lblusrNm,lblusrPss,lblusrEmail,lblusrCont;
	JTextField usrNm,usrPss,usrEmail,usrCont;
	JButton btnSubmit,btnReset;
	
	UserModel user;
	Controller controller;
	
	
	public RegisterPage()
	{
		//intialise
		lblusrNm=new JLabel("Name :");
		lblusrPss=new JLabel("Password :");
		lblusrEmail=new JLabel("Email :");
		lblusrCont=new JLabel("Contact :");
		controller = new Controller();
		
		usrNm=new JTextField();
		usrPss=new JTextField();
		usrEmail=new JTextField();
		usrCont=new JTextField();
		btnSubmit=new JButton("Submit");
		btnReset=new JButton("Reset");
		
		//Set Bounds
		usrNm.setBounds(90, 40, 90,30);
		usrPss.setBounds(90,80,90,30);
		usrEmail.setBounds(90, 120,140 , 30);
		usrCont.setBounds(90, 160,90, 30);
		btnSubmit.setBounds(90,200,90,25);
		btnReset.setBounds(180,200,90,25);
		lblusrNm.setBounds(20,40,220,30);
        lblusrPss.setBounds(20, 80,180,30);
        lblusrEmail.setBounds(20,120,200,30 );
        lblusrCont.setBounds(20, 160,200, 30);
        
        add(lblusrNm);
        add(lblusrPss);
        add(lblusrEmail);
        add(lblusrCont);
        add(usrNm);
        add(usrPss);
        add(usrCont);
        add(usrEmail);
        add(btnSubmit);
        add(btnReset);
        
        btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=usrNm.getText();
				String pass=usrPss.getText();
				String mail=usrEmail.getText();
				String cont=usrCont.getText();
				user = new UserModel(name,pass,mail,cont);
				 boolean valid = controller.registerUser(user);
				 if(valid) {
					 LoginPage login=new LoginPage(user);
					 setVisible(false);
					 login.setVisible(true);
				 }
				 else
				 {
					 usrEmail.setText("Invalid email");
				 }
				
			}
		});
        
        btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usrNm.setText("");
				usrPss.setText("");
				usrEmail.setText("");
				usrCont.setText("");
			}
		});
        
        //Set Size
        setSize(350,350);
        setLayout(null);
        setVisible(true);

	}
	public static void main(String[] args) {
		RegisterPage register=new RegisterPage();
		
	}
}
