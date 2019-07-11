package com.revature.service;

import java.util.List;

import com.revature.dao.UsersDAO;
import com.revature.pojo.Users;



public class UserService {
	
	private UsersDAO userDao = new UsersDAO();
	
	public List<Users> findAllUsers(){
		return userDao.findALL();
	}
	
	public Users login(String username, String password) {
		Users u = userDao.getByUsername(username);
		if(u == null) return null;
		if(u.getPWord().equals(password)) return u;
		return null;
	}
	
	public UserInformation getInfo(User u) {
		return userDao.getUserInfo(u);
	}

}