package com.learning.controller;
import com.learning.model.*;
import com.learning.view.*;
import java.util.regex.*;

public class Controller
{
	public boolean registerUser (UserModel model)
	{
		String rcvNm=model.getUsrNm();
		String rcvPss=model.getUsrPss();
		String rcvMail=model.getUsrEmail();
		String rcvCont=model.getUsrCont();
		Pattern pattern=Pattern.compile("@");
		Matcher match=pattern.matcher(rcvMail);
		if(match.find())
		{
			return true;
		}
		
		return false;
		
	}
	public boolean loginUser(String name, String pass, UserModel md) {
		// TODO Auto-generated method stub
		String Nmrcv= name;
		String Pwdrcv = pass;
	if(Nmrcv.equals(md.getUsrNm())&&Pwdrcv.equals(md.getUsrPss()))
		{
			return true;
		}
		return false;
	}
}
