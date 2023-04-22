package com.usermanagement.usermanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;



@Service
public class UserService {
	private ArrayList<User> user = new ArrayList<>(Arrays.asList(new User("u101","Kabir Hossain","@kaveer","Agartala","8730055")));
	
	//get all user
	public ArrayList<User> getAllUser(){
		return user;
	}
	
	//add user 
	public User addUser(User u) {
		user.add(u);
		return u;
	}
	
	//search user
	public User searchUser(String id) {
		return user.stream().filter(t -> t.getUserId().equals(id)).findFirst().get();
	}
	
	//update user
	public void updateEmployee(String id, User newuser) {
		for(int i=0;i<user.size();i++) {
			User em = user.get(i);
			if(em.getUserId().equals(id)) {
				user.set(i, newuser);
			}
		}
	}
	
	//delete user
	public void deleteEmployee(String id) {
		user.removeIf(t->t.getUserId().equals(id));//t is variable name
	}

}
