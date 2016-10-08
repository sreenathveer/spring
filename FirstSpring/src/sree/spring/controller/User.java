package sree.spring.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;

public class User {
	@Pattern(regexp="[^0-9]*")
	private String name;
	private String password;
	
	private Long phoneNumber;
	private Date dateOfBirth;
	private ArrayList<String> course;
	
	private Address userAddress;
	
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<String> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}
	
	
}
