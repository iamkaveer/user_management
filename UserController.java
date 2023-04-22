package com.usermanagement.usermanagementsystem;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	//get all user
	@GetMapping("/getAllUser")
	public ArrayList<User> getAll(){
		return userservice.getAllUser();
	}
	
	//add User
	@PostMapping("/addUser")
	public User addUser(@RequestBody User newuser) {
		User u = userservice.addUser(newuser);
		return u;
		
	}
	//search user
	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable String id) {
		return userservice.searchUser(id);
	}
	
	//update 
		@PutMapping("/updateUserInfo/{id}")
		public void updateEmployee(@RequestBody User e, @PathVariable String id) {
			userservice.updateEmployee(id, e);
		}
		
		//delete Employee
		@DeleteMapping("/deleteUser/{id}")
		public void deleteEmp(@PathVariable String id) {
			userservice.deleteEmployee(id);
		}

}
