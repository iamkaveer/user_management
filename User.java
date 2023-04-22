package com.usermanagement.usermanagementsystem;

public class User {
	private String UserId;
	private String Name;
	private String UserName;
	private String Address;
	private String PhoneNumber;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public User(String userId, String name, String userName, String address, String phoneNumber) {
		super();
		UserId = userId;
		Name = name;
		UserName = userName;
		Address = address;
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Name=" + Name + ", UserName=" + UserName + ", Address=" + Address
				+ ", PhoneNumber=" + PhoneNumber + "]";
	}
	

}
