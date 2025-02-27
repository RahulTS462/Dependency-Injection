package com.codingNinjas.codingNinjasApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SimpleUserList implements UserList {
	ArrayList<User> listOfUsers;
	
	public SimpleUserList() {
		this.listOfUsers = new ArrayList<User>();
	}

	@Override
	public ArrayList<User> getUserList() {
		return this.listOfUsers;
	}

	@Override
	public void addUser(User user) {
		this.listOfUsers.add(user);
	}

}
