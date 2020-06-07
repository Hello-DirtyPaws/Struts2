package org.upadhyay.suraj.service;

import org.upadhyay.suraj.model.User;

public class LoginService
{
	public boolean checkLogin(User u)
	{
		return (u.getUserId().equalsIgnoreCase("U") &&
				u.getPassword().equalsIgnoreCase("a"));
			
	}
}
