package com.inversionofcontrol.json_java_databinding;

public class Student {
	private String name;
	private String address;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", role=" + role + "]";
	}
	
	

}
